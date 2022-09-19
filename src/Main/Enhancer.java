
package Main;

public class Enhancer {
    
    public double[][][] HistogramEqualization(double[][][] HSVArray)
    {
        double[] Frequency = new double[101];                       
        double[] CDF = new double[101];
        double totalpxl = HSVArray.length * HSVArray[0].length;
        double CDFTemp = 0.0;

        for (int i = 0; i < HSVArray.length; i++) {                 
            for (int j = 0; j < HSVArray[0].length; j++) {
                HSVArray[i][j][2] = Math.floor(HSVArray[i][j][2]);  
                int index = (int) HSVArray[i][j][2];                
                Frequency[index] = Frequency[index] + 1.0 ;
            }
        }
        
        for (int i = 0; i < CDF.length; i++) {
            CDFTemp = CDFTemp + (Frequency[i] / totalpxl);
            CDF[i] = CDFTemp;
        }      
        
        for (int i = 0; i < CDF.length; i++) {
            CDF[i] = Math.floor(CDF[i] * (100));
        }
        
        for (int i = 0; i < HSVArray.length; i++) {
            for (int j = 0; j < HSVArray[0].length; j++) {
                int index = (int) HSVArray[i][j][2];  
                HSVArray[i][j][2] = CDF[index];
            }
        }

    return HSVArray;
    }
}
