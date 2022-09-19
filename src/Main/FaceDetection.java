
package Main;

import java.io.File;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;


public class FaceDetection {
    
    public String[] HaarCascade(File Image)
    {
        String[] Output = new String[2];
        
        //Mengambil nilai Mat gambar
        Mat src = Imgcodecs.imread(Image.getAbsolutePath());
        
        //Mengimplementasikan face detection 
        String xmlFile = "D://Kuliah//TA//haarcascade_frontalface_alt.xml"; 
        CascadeClassifier classifier = new CascadeClassifier(xmlFile);
        
        //Mendeteksi dan menghitung wajah pada gambar
        MatOfRect faceDetections = new MatOfRect();
        classifier.detectMultiScale(src, faceDetections);

        Output[1] = String.format("Detected %s faces", faceDetections.toArray().length);
        
        //Menggambar wajah
        for (Rect rect : faceDetections.toArray()) {
         Imgproc.rectangle(
            src,                                               // where to draw the box
            new Point(rect.x, rect.y),                            // bottom left
            new Point(rect.x + rect.width, rect.y + rect.height), // top right
            new Scalar(0, 0, 255),
            3                                                     // RGB colour
         );
        }
        
        //Menyimpan Gambar yang sudah dideteksi
        String filename = "D://ImageWithFaceDetection.jpg";  
        Imgcodecs.imwrite(filename, src);
        Output[0] = filename;
        

        return Output;
    }
}
