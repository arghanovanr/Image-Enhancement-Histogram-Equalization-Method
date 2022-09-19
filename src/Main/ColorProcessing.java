
package Main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ColorProcessing {
    
    public double[][][] getRGB (File image) throws IOException 
    {   
                // Menyimpan nilai RGB ke Array
                int R=0;
                int G=0;
                int B=0;
                int rata = 0;
                BufferedImage read = ImageIO.read(image);
                double[][][] ImageRGB = new double [read.getWidth()][read.getHeight()][3] ;
                for(int i=0;i<read.getWidth();i++)
                {
                    for(int j=0;j<read.getHeight();j++)
                    {
                        int clr   = read.getRGB(i,j)       ;
                        int red   = (clr & 0x00ff0000) >> 16;
                        int green = (clr & 0x0000ff00) >> 8 ;
                        int blue  = (clr & 0x000000ff)      ;
                        ImageRGB[i][j][0] = red ;
                        ImageRGB[i][j][1] = green ;
                        ImageRGB[i][j][2] = blue ;
                             
                        R=R+red;
                        G=G+green;
                        B=B+blue;
                        rata = R+G+B;
                    }                
                }
                R=R/(read.getWidth()*read.getHeight());
                G=G/(read.getWidth()*read.getHeight());
                B=B/(read.getWidth()*read.getHeight());
                rata= (rata / 3)/(read.getWidth()*read.getHeight());
                System.out.println("R = "+R);
                System.out.println("G = "+G);
                System.out.println("B = "+B);
                System.out.println("Rata = "+rata);
                return ImageRGB;
 }
    
    public double[][][] RGBtoHSV( double[][][] RGBArray)
    {
        double[][][] ImageHSV = new double [RGBArray.length][RGBArray[0].length][3];
        for (int i = 0; i < RGBArray.length; i++) {
            for (int j = 0; j < RGBArray[0].length; j++) {

                //Normalisasi nilai RGB dari 0-255 menjadi 0-1
                RGBArray[i][j][0] = RGBArray[i][j][0]/255.0; //Red
                RGBArray[i][j][1] = RGBArray[i][j][1]/255.0; //Green
                RGBArray[i][j][2] = RGBArray[i][j][2]/255.0; //Blue

                //Memasukkan array ke variabel r g b
                double r = RGBArray[i][j][0];
                double g = RGBArray[i][j][1];
                double b = RGBArray[i][j][2];

                // h, s, v = hue, saturation, value
                double cmax = Math.max(r, Math.max(g, b)); // nilai maksimum dari rgb
                double cmin = Math.min(r, Math.min(g, b)); // nilai minimum dari rgb
                double diff = cmax - cmin; // perbedaan maksimum dan minimum
                double h = -1, s = -1;

                // if cmax and cmax are equal then h = 0
                if (cmax == cmin)
                h = 0;

                // if cmax equal r then compute h
                else if (cmax == r)
                    h = (60 * ((g - b) / diff) + 360) % 360;

                // if cmax equal g then compute h
                else if (cmax == g)
                    h = (60 * ((b - r) / diff) + 120) % 360;

                // if cmax equal b then compute h
                else if (cmax == b)
                    h = (60 * ((r - g) / diff) + 240) % 360;

                // if cmax equal zero
                if (cmax == 0)
                    s = 0;
                else
                    s = (diff / cmax) * 100;

                // compute v
                double v = cmax * 100;

                ImageHSV[i][j][0] = h;
                ImageHSV[i][j][1] = s;
                ImageHSV[i][j][2] = v;

            }
        }
    return ImageHSV;
    };
    
    public double[][][] HSVtoRGB(double[][][] HSVArray)
    {
        double[][][] ImageRGB = new double [HSVArray.length][HSVArray[0].length][3];
        for (int i = 0; i < HSVArray.length; i++) {
            for (int j = 0; j < HSVArray[0].length; j++) {
                double H = HSVArray[i][j][0];
                double S = HSVArray[i][j][1];
                double V = HSVArray[i][j][2];

                //Ubah H dan V ke range 0-1 
                double C = (V/100)*(S/100);
                double X = C * (1 - Math.abs( (H/60) % 2 - 1 ));
                double m = (V/100) - C ;

                double r,g,b;

                if(H<=60)
                {
                    r = C;
                    g = X;
                    b = 0;
                }
                else if(H<=120)
                {
                    r = X;
                    g = C;
                    b = 0;
                }
                else if(H<=180)
                {
                    r = 0;
                    g = C;
                    b = X;
                }
                else if(H<=240)
                {
                    r = 0;
                    g = X;
                    b = C;
                }
                else if(H<=300)
                {
                    r = X;
                    g = 0;
                    b = C;
                }
                else
                {
                    r = C;
                    g = 0;
                    b = X;
                }

                ImageRGB[i][j][0] = (r+m)*255;
                ImageRGB[i][j][1] = (g+m)*255;
                ImageRGB[i][j][2] = (b+m)*255;


            }
        }
        return ImageRGB;
    }
}
