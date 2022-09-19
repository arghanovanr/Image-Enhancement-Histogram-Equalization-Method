
package Main;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.opencv.imgcodecs.Imgcodecs;

public class Histogram {
    
    public File Histogram (double RGB[][][]) throws IOException
    {
        int Red = 0;
        int Green = 1;
        int Blue = 2;
        int Count[][] = new int [3][256];
        for (int i = 0; i < RGB.length; i++) {
            for (int j = 0; j < RGB[0].length; j++) {
                double red = RGB[i][j][0];
                double green = RGB[i][j][1];
                double blue = RGB[i][j][2];
                int r = (int)red; 
                int g = (int)green;
                int b = (int)blue;
                Count[Red][r]++;
                Count[Green][g]++;
                Count[Blue][b]++;
            }
        }
        DefaultCategoryDataset colorDataset = new DefaultCategoryDataset();
        for (int j = 0; j < 256; j++) {
	    colorDataset.addValue(Count[0][j], "Red", new Integer(j)+" ");
	    colorDataset.addValue(Count[2][j], "Blue", new Integer(j)+" ");
	    colorDataset.addValue(Count[1][j], "Green", new Integer(j)+" ");
	}
        JFreeChart jfcolor = ChartFactory.createLineChart("", "0                128                255", "", colorDataset, PlotOrientation.VERTICAL, true, true, true);
        File outputfile = new File("D://Histogram.jpg");
        

	ChartUtilities.saveChartAsJPEG(outputfile, jfcolor, 256, 256);
        ChartPanel jpchart = new ChartPanel(jfcolor);
        
        return outputfile;
    }
    
}
