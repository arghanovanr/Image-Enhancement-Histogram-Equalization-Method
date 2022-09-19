
package Main;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controller {
    Enhancer HI = new Enhancer();
    ColorProcessing CP = new ColorProcessing();
    FaceDetection FD = new FaceDetection();
    Histogram HG = new Histogram();
    
    public String UploadImage()
    {
        String Filepath = null;
        try
        {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg" );
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            Filepath = chooser.getSelectedFile().getAbsolutePath();
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Upload Citra Error " + E);
        }
        return Filepath;
    }
    
    public File EnhanceImage(File ImageGlobal)
    {
        File img = new File("Image.jpg");
        try 
        {             
            double[][][] Array = CP.getRGB(ImageGlobal);
            Array = CP.RGBtoHSV(Array);
            Array = HI.HistogramEqualization(Array);
            Array = CP.HSVtoRGB(Array);

            BufferedImage read = ImageIO.read(ImageGlobal);
            for(int i=0;i<read.getWidth();i++)
            {
                for(int j=0;j<read.getHeight();j++)
                {
                    int clr   = read.getRGB(i,j)       ;
                    int red   = (clr & 0x00ff0000) >> 16;
                    int green = (clr & 0x0000ff00) >> 8 ;
                    int blue  = (clr & 0x000000ff)      ;
                    Color c = new Color((int)Array[i][j][0], (int)Array[i][j][1],(int)Array[i][j][2]);
                    read.setRGB(i, j, c.getRGB());
                }
            }

            ImageIO.write(read, "jpg", img);   
        }
        catch (Exception E) 
        {
          JOptionPane.showMessageDialog(null, " Error " + E);
        }
        return img;
    }
    
    public String[] FaceDetection(File Image)
    {
        return FD.HaarCascade(Image);
    }
    
    public void SaveImage (File image)
    {
        try
        {
            String m = JOptionPane.showInputDialog("Type image name");
            BufferedImage read = ImageIO.read(image);
            ImageIO.write(read, "jpg", new File("D://TA/"+m+".jpg"));
        }
        catch (Exception E)
        {
            JOptionPane.showMessageDialog(null, "Upload Citra Error " + E);
        }
    }
    
    public File DrawHistogram(File image) throws IOException
    {
        double RGB[][][] = CP.getRGB(image);
        return HG.Histogram(RGB);
    }
    
}
