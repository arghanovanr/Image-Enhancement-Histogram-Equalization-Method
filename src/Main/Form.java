
package Main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.opencv.core.Core;


public class Form extends javax.swing.JFrame {
private File ImageInput = null;
private File ImageOutput = null; 
private File ImageOutputWithFace = null;
Controller CTL = new Controller();

    public Form() {
        initComponents();
        Notification1.setText("");
        Notification2.setText("");
    }

    public void ShowImageInput(File img)
    {
        ImageIcon icon = new ImageIcon(img.toString()); 
        Image image = icon.getImage().getScaledInstance(ImagePanelInput.getWidth(), ImagePanelInput.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        ImagePanelInput.setIcon(ic);
    }
    
    public void ShowImageOutput(File img)
    {
        ImageIcon icon = new ImageIcon(img.toString()); 
        Image image = icon.getImage().getScaledInstance(ImagePanelOutput.getWidth(), ImagePanelOutput.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        ImagePanelOutput.setIcon(ic);
    }
    
    public void ShowHistogramInput(File img)
    {
        ImageIcon icon = new ImageIcon(img.toString()); 
        Image image = icon.getImage().getScaledInstance(ImagePanelHistogramInput.getWidth(), ImagePanelHistogramInput.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        ImagePanelHistogramInput.setIcon(ic);
    }
    
    public void ShowHistogramOutput(File img)
    {
        ImageIcon icon = new ImageIcon(img.toString()); 
        Image image = icon.getImage().getScaledInstance(ImagePanelHistogramOutput.getWidth(), ImagePanelHistogramOutput.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        ImagePanelHistogramOutput.setIcon(ic);
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImagePanelInput = new javax.swing.JLabel();
        BtnUpload = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        btnDetectFace = new javax.swing.JButton();
        Notification1 = new javax.swing.JLabel();
        btnEnhance = new javax.swing.JButton();
        Notification2 = new javax.swing.JLabel();
        ImagePanelHistogramInput = new javax.swing.JLabel();
        ImagePanelHistogramOutput = new javax.swing.JLabel();
        ImagePanelOutput = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImagePanelInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ImagePanelInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePanelInput.setText("Input Image");
        ImagePanelInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BtnUpload.setText("Upload Image");
        BtnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUploadActionPerformed(evt);
            }
        });

        BtnSave.setText("Save Image");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        btnDetectFace.setText("Detect Face ");
        btnDetectFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetectFaceActionPerformed(evt);
            }
        });

        Notification1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Notification1.setForeground(new java.awt.Color(255, 0, 51));
        Notification1.setText("Notification");

        btnEnhance.setText("Image Enhancement");
        btnEnhance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnhanceActionPerformed(evt);
            }
        });

        Notification2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Notification2.setForeground(new java.awt.Color(255, 0, 51));
        Notification2.setText("Notification");

        ImagePanelHistogramInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ImagePanelHistogramInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePanelHistogramInput.setText("Input Image Histogram");
        ImagePanelHistogramInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ImagePanelHistogramOutput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ImagePanelHistogramOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePanelHistogramOutput.setText("Output Image Histogram");
        ImagePanelHistogramOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ImagePanelOutput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ImagePanelOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePanelOutput.setText("Ouput Image");
        ImagePanelOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ImagePanelHistogramInput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(ImagePanelHistogramOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnhance)
                                .addGap(18, 18, 18)
                                .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ImagePanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ImagePanelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnDetectFace)
                                .addGap(62, 62, 62)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(Notification1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Notification2)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImagePanelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImagePanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagePanelHistogramInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagePanelHistogramOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Notification1)
                    .addComponent(Notification2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpload)
                    .addComponent(btnEnhance)
                    .addComponent(BtnSave)
                    .addComponent(btnClear)
                    .addComponent(btnDetectFace))
                .addGap(16, 16, 16))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUploadActionPerformed
    try {
        String Filepath = CTL.UploadImage();
        File img = new File (Filepath);
        ImageInput = img; 
        ShowImageInput(ImageInput);
        File fileinput = CTL.DrawHistogram(ImageInput);
        ShowHistogramInput(fileinput);
    } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gambar tidak dipilih user"); 
    }
    }//GEN-LAST:event_BtnUploadActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        if(ImageInput != null)
        {
            if(ImageOutput != null)
            {
                if(ImageOutputWithFace != null)
                {
                    CTL.SaveImage(ImageOutputWithFace);
                }
                else
                {
                    CTL.SaveImage(ImageOutput);
                }
                
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Image has not been enhanced"); 
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Image has not been entered");  
        }
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void btnDetectFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetectFaceActionPerformed
        if(ImageInput != null)
        {
            if(ImageOutput != null )
            {
                String[] Input = new String[2];
                Input = CTL.FaceDetection(ImageInput);      
                Notification1.setText(Input[1]);
                File fileInput = new File(Input[0]);
                ShowImageInput(fileInput);   

                String[] Output = new String[2];
                Output = CTL.FaceDetection(ImageOutput);
                Notification2.setText(Output[1]);
                File fileOutput = new File(Output[0]);
                ImageOutputWithFace = fileOutput;
                ShowImageOutput(fileOutput);

            }
            else 
            {
                String[] Input = new String[2];
                Input = CTL.FaceDetection(ImageInput);      
                Notification1.setText(Input[1]);
                File fileInput = new File(Input[0]);
                ShowImageInput(fileInput); 
            }       

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Image has not been entered"); 
        }
        
    }//GEN-LAST:event_btnDetectFaceActionPerformed

    private void btnEnhanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnhanceActionPerformed
    if(ImageInput != null)
    {
        ImageOutput = CTL.EnhanceImage(ImageInput);
        try 
        {
            File fileoutput = CTL.DrawHistogram(ImageOutput);
            ShowHistogramOutput(fileoutput);  
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        ShowImageOutput(ImageOutput);
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Image has not been entered"); 
    }

    }//GEN-LAST:event_btnEnhanceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        ImageInput = null;
        ImageOutput = null;
        ImagePanelInput.setIcon(null);
        ImagePanelOutput.setIcon(null);
        ImagePanelHistogramInput.setIcon(null);
        ImagePanelHistogramOutput.setIcon(null);
        Notification1.setText("");
        Notification2.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnUpload;
    private javax.swing.JLabel ImagePanelHistogramInput;
    private javax.swing.JLabel ImagePanelHistogramOutput;
    private javax.swing.JLabel ImagePanelInput;
    private javax.swing.JLabel ImagePanelOutput;
    private javax.swing.JLabel Notification1;
    private javax.swing.JLabel Notification2;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDetectFace;
    private javax.swing.JButton btnEnhance;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
