package mantra.mfs100.test;

import MFS100.DeviceInfo;
import MFS100.FingerData;
import MFS100.MFS100;
import MFS100.MFS100Event;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author SW02
 */
public class MFS100Test extends javax.swing.JFrame implements MFS100Event {

    String key = "";
    MFS100 mfs100 = null;
    DeviceInfo deviceInfo = new DeviceInfo();
    int quality = 60;
    int timeout = 10000;
    byte[] ISOTemplate = null;
    byte[] ANSITemplate = null;
    private MyIcon m_FingerPrintImage;

    public MFS100Test() {
        initComponents();
        m_FingerPrintImage = new MyIcon(lblFinger.getWidth(), lblFinger.getHeight());
        lblFinger.setIcon(null);
        mfs100 = new MFS100(this, key);
        try {
            System.out.println("JAV_VERSION: " + System.getProperty("java.version"));
        } catch (Exception e) {
        }
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInit = new javax.swing.JButton();
        lblSerial = new javax.swing.JLabel();
        btnStartCapture = new javax.swing.JButton();
        btnStopCapture = new javax.swing.JButton();
        btnCheckDevice = new javax.swing.JButton();
        btnGetVersion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chkShowPreview = new javax.swing.JCheckBox();
        txtQuality = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTimeout = new javax.swing.JTextField();
        btnAutoCapture = new javax.swing.JButton();
        btnMatchISO = new javax.swing.JButton();
        btnMatchANSI = new javax.swing.JButton();
        btnUninit = new javax.swing.JButton();
        lblFinger = new javax.swing.JLabel();
        lblSerial1 = new javax.swing.JLabel();
        lblQuality = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInit.setText("Init");
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });

        lblSerial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSerial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnStartCapture.setText("Start Capture");
        btnStartCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartCaptureActionPerformed(evt);
            }
        });

        btnStopCapture.setText("Stop Capture");
        btnStopCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopCaptureActionPerformed(evt);
            }
        });

        btnCheckDevice.setText("Check Device");
        btnCheckDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDeviceActionPerformed(evt);
            }
        });

        btnGetVersion.setText("Version");
        btnGetVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetVersionActionPerformed(evt);
            }
        });

        jLabel2.setText("Quality (1 to 100)");

        chkShowPreview.setSelected(true);
        chkShowPreview.setText("Show Preview");

        txtQuality.setText("60");

        jLabel3.setText("Timeout (ms)");

        txtTimeout.setText("10000");

        btnAutoCapture.setText("Auto Capture");
        btnAutoCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoCaptureActionPerformed(evt);
            }
        });

        btnMatchISO.setText("Match ISO");
        btnMatchISO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchISOActionPerformed(evt);
            }
        });

        btnMatchANSI.setText("Match ANSI");
        btnMatchANSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchANSIActionPerformed(evt);
            }
        });

        btnUninit.setText("Uninit");
        btnUninit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUninitActionPerformed(evt);
            }
        });

        lblFinger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSerial1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSerial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSerial1.setText("MANTRA Softech India Pvt. Ltd. - MFS100");

        lblQuality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSerial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSerial1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCheckDevice, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnGetVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuality)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimeout)
                            .addComponent(chkShowPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQuality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFinger, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStartCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnStopCapture, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(btnAutoCapture, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(btnMatchISO, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(btnMatchANSI, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(btnUninit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSerial1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGetVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnCheckDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(chkShowPreview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFinger, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStopCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAutoCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMatchISO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMatchANSI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUninit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuality, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnStartCapture.getAccessibleContext().setAccessibleName("StartCapture");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        lblSerial.setText("");
        int ret = mfs100.Init();
        if (ret == 0) {
            deviceInfo = mfs100.GetDeviceInfo();
            lblSerial.setText("Serial No: " + deviceInfo.SerialNo() + "     Make: " + deviceInfo.Make() + "     Model: " + deviceInfo.Model());
            System.out.println("Width: " + String.valueOf(deviceInfo.Width()));
            System.out.println("Height: " + String.valueOf(deviceInfo.Height()));
            JOptionPane.showMessageDialog(rootPane, "Scanner Initialized");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");

        }
    }//GEN-LAST:event_btnInitActionPerformed

    private void btnStartCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartCaptureActionPerformed
        lblQuality.setText("");
        lblQuality.repaint();
        int ret = mfs100.StartCapture(quality, timeout, chkShowPreview.isSelected());
        if (ret != 0) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
        }
    }//GEN-LAST:event_btnStartCaptureActionPerformed

    private void btnStopCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopCaptureActionPerformed
        int ret = mfs100.StopCapture();
        if (ret != 0) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
        }
    }//GEN-LAST:event_btnStopCaptureActionPerformed

    private void btnCheckDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDeviceActionPerformed
        JOptionPane.showMessageDialog(rootPane, mfs100.IsConnected());
    }//GEN-LAST:event_btnCheckDeviceActionPerformed

    private void btnGetVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetVersionActionPerformed
        JOptionPane.showMessageDialog(rootPane, mfs100.GetSDKVersion());
    }//GEN-LAST:event_btnGetVersionActionPerformed

    private void btnAutoCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoCaptureActionPerformed
        lblQuality.setText("");
        lblQuality.repaint();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                FingerData fingerData = new FingerData();
                int ret = mfs100.AutoCapture(fingerData, quality, timeout, chkShowPreview.isSelected());
                if (ret == 0) {
                    m_FingerPrintImage.setImage(mfs100.BytesToBitmap(fingerData.FingerImage()));
                    lblFinger.setIcon(m_FingerPrintImage);
                    lblFinger.repaint();
                    lblQuality.setText("Quality: " + String.valueOf(fingerData.Quality()) + " Nfiq: " + String.valueOf(fingerData.Nfiq()));
                    lblQuality.repaint();

                    ISOTemplate = new byte[fingerData.ISOTemplate().length];
                    System.arraycopy(fingerData.ISOTemplate(), 0, ISOTemplate, 0, fingerData.ISOTemplate().length);

                    ANSITemplate = new byte[fingerData.ANSITemplate().length];
                    System.arraycopy(fingerData.ANSITemplate(), 0, ANSITemplate, 0, fingerData.ANSITemplate().length);

                    WriteBytesToFile("FingerImage.bmp", fingerData.FingerImage());
                    WriteBytesToFile("ISOTemplate.iso", fingerData.ISOTemplate());
                    WriteBytesToFile("ISOImage.iso", fingerData.ISOImage());
                    WriteBytesToFile("AnsiTemplate.ansi", fingerData.ANSITemplate());
                    WriteBytesToFile("RawData.raw", fingerData.RawData());
                    WriteBytesToFile("WSQImage.wsq", fingerData.WSQImage());
                    JOptionPane.showMessageDialog(rootPane, "Capture Success.\nFinger data is saved at application path");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
                }
            }
        };

        Thread trd = new Thread(runnable);
        trd.start();
    }//GEN-LAST:event_btnAutoCaptureActionPerformed

    private void btnMatchISOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchISOActionPerformed
        if (ISOTemplate == null || ISOTemplate.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Capture Finger First");
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                FingerData fingerData = new FingerData();
                int ret = mfs100.AutoCapture(fingerData, quality, timeout, chkShowPreview.isSelected());
                if (ret == 0) {

                    int score = 0;
                    score = mfs100.MatchISO(fingerData.ISOTemplate(), ISOTemplate);
                    if (score >= 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Matched With Score " + String.valueOf(score));
                    } else if (score >= 0 && score < 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Not Matched");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
                }
            }
        };
        Thread trd = new Thread(runnable);
        trd.start();

    }//GEN-LAST:event_btnMatchISOActionPerformed

    private void btnMatchANSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchANSIActionPerformed
        if (ANSITemplate == null || ANSITemplate.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Capture Finger First");
            return;
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                FingerData fingerData = new FingerData();
                int ret = mfs100.AutoCapture(fingerData, quality, timeout, chkShowPreview.isSelected());
                if (ret == 0) {

                    int score = 0;
                    score = mfs100.MatchANSI(fingerData.ANSITemplate(), ANSITemplate);
                    if (score >= 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Matched With Score " + String.valueOf(score));
                    } else if (score >= 0 && score < 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Not Matched");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
                }
            }
        };
        Thread trd = new Thread(runnable);
        trd.start();
    }//GEN-LAST:event_btnMatchANSIActionPerformed

    private void btnUninitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUninitActionPerformed
        lblSerial.setText("");
        int ret = mfs100.Uninit();
        if (ret == 0) {
            deviceInfo = mfs100.GetDeviceInfo();
            JOptionPane.showMessageDialog(rootPane, "Scanner Uninitialized");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
        }
    }//GEN-LAST:event_btnUninitActionPerformed

    @Override
    public void OnPreview(final FingerData fingerData) {
        //System.out.println("OnPreview");

        Runnable runnable = new Runnable() {
            public void run() {
                m_FingerPrintImage.setImage(mfs100.BytesToBitmap(fingerData.FingerImage()));
                lblFinger.setIcon(m_FingerPrintImage);
                lblFinger.repaint();
                lblQuality.setText("Quality: " + String.valueOf(fingerData.Quality()));
                lblQuality.repaint();
            }
        };
        Thread trd = new Thread(runnable);
        trd.start();

    }

    @Override
    public void OnCaptureCompleted(boolean status, int errorCode, String errorMsg, final FingerData fingerData) {
        if (status) {
            Runnable runnable = new Runnable() {
                public void run() {
                    m_FingerPrintImage.setImage(mfs100.BytesToBitmap(fingerData.FingerImage()));
                    lblFinger.setIcon(m_FingerPrintImage);
                    lblFinger.repaint();
                    lblQuality.setText("Quality: " + String.valueOf(fingerData.Quality()) + " Nfiq: " + String.valueOf(fingerData.Nfiq()));
                    lblQuality.repaint();
                }
            };
            Thread trd = new Thread(runnable);
            trd.start();
            WriteBytesToFile("FingerImage.bmp", fingerData.FingerImage());
            WriteBytesToFile("ISOTemplate.iso", fingerData.ISOTemplate());
            WriteBytesToFile("ISOImage.iso", fingerData.ISOImage());
            WriteBytesToFile("AnsiTemplate.ansi", fingerData.ANSITemplate());
            WriteBytesToFile("RawData.raw", fingerData.RawData());
            WriteBytesToFile("WSQImage.wsq", fingerData.WSQImage());
            ISOTemplate = new byte[fingerData.ISOTemplate().length];
            System.arraycopy(fingerData.ISOTemplate(), 0, ISOTemplate, 0, fingerData.ISOTemplate().length);

            ANSITemplate = new byte[fingerData.ANSITemplate().length];
            System.arraycopy(fingerData.ANSITemplate(), 0, ANSITemplate, 0, fingerData.ANSITemplate().length);
            JOptionPane.showMessageDialog(rootPane, "Capture Success.\nFinger data is saved at application path");
        } else {
            JOptionPane.showMessageDialog(rootPane, errorMsg + " (" + String.valueOf(errorCode) + ")");
        }
    }

    private void WriteBytesToFile(String FileName, byte[] Bytes) {
        try {
            String FilePath = new File("").getAbsolutePath();//System.getProperty("user.dir");
            FilePath += File.separator + "FingerData";
            File file = new File(FilePath);
            if (!file.exists()) {
                file.mkdir();
            }
            FilePath += File.separator +  FileName;
            FileOutputStream fos = new FileOutputStream(FilePath);
            fos.write(Bytes);
            fos.close();
        } catch (Exception ex) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MFS100Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MFS100Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MFS100Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MFS100Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MFS100Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoCapture;
    private javax.swing.JButton btnCheckDevice;
    private javax.swing.JButton btnGetVersion;
    private javax.swing.JButton btnInit;
    private javax.swing.JButton btnMatchANSI;
    private javax.swing.JButton btnMatchISO;
    private javax.swing.JButton btnStartCapture;
    private javax.swing.JButton btnStopCapture;
    private javax.swing.JButton btnUninit;
    private javax.swing.JCheckBox chkShowPreview;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFinger;
    private javax.swing.JLabel lblQuality;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblSerial1;
    private javax.swing.JTextField txtQuality;
    private javax.swing.JTextField txtTimeout;
    // End of variables declaration//GEN-END:variables

    public class MyIcon implements Icon {

        int _Width = 0;
        int _Height = 0;

        public MyIcon(int Width, int Height) {
            this._Width = Width;
            this._Height = Height;
            m_Image = null;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (m_Image != null) {
                g.drawImage(m_Image, x, y, getIconWidth(), getIconHeight(), null);
            } else {
                g.fillRect(x, y, getIconWidth(), getIconHeight());
            }
        }

        public int getIconWidth() {
            return _Width;
        }

        public int getIconHeight() {
            return _Height;
        }

        public boolean LoadImage(String path) {
            boolean bRetCode = false;
            Image newImg;
            try {
                File f = new File(path);
                newImg = ImageIO.read(f);
                bRetCode = true;
                setImage(newImg);
            } catch (IOException e) {
            }

            return bRetCode;
        }

        public void setImage(Image Img) {
            if (Img != null) {
                m_Image = Img.getScaledInstance(getIconWidth(), getIconHeight(), Image.SCALE_FAST);
            } else {
                m_Image = null;
            }
        }

        private Image m_Image;
    }
}