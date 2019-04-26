/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mantra.mfs100.test;

/**
 *
 * @author Rajesh
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;


import org.apache.http.NameValuePair;
import java.util.List;

import javax.swing.JFrame;
///////// MFS 100 //////////////
import MFS100.DeviceInfo;
import MFS100.FingerData;
import MFS100.MFS100;
import MFS100.MFS100Event;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Attandance extends javax.swing.JFrame implements MFS100Event{

    private String emp_code;
    String url = "http://52.44.198.156/index.php/";
    
    /************ MFS 100 */
    String key = "";
    MFS100 mfs100 = null;
    DeviceInfo deviceInfo = new DeviceInfo();
    int quality = 60;
    int timeout = 10000;
    byte[] ISOTemplate = null;
    byte[] saveTemplate1 = null;
    byte[] saveTemplate2 = null;
    byte[] saveTemplate3 = null;
    byte[] saveTemplate4 = null;
    byte[] ANSITemplate = null;
    private MyIcon m_FingerPrintImage;
    private String serial_no;
    /********** end MFS 100 **********/
    /**
     * Creates new form Attandance
     */
    
    public Attandance() {
        this.emp_code = "";
        initComponents();
        setExtendedState((int) JFrame.CENTER_ALIGNMENT); 
        m_FingerPrintImage = new MyIcon(lblFinger.getWidth(), lblFinger.getHeight());
        lblFinger.setIcon(null);
        /**** all indicator set  ***************/
        setIndicator();
        /************** timer *************/
        timer();
        /*************** end of timer *******/
        /****** device flag *****/
        deviceFlag();
        /******************* device flag *****/
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

        txtEmpcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_enter = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblFinger = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDevice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEmpcode.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        txtEmpcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpcode.setDisabledTextColor(new java.awt.Color(2, 36, 245));
        txtEmpcode.setName(""); // NOI18N
        txtEmpcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpcodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VFS Attandance");

        btn_enter.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_enter.setText("Enter");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_9.setText("9");
        btn_9.setToolTipText("");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_e.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btn_e.setText("E");
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFinger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblName.setText("Amit Singh");

        lblBranch.setText("BAGULA");

        lblMessage.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblMessage.setText("Attandance Accepted");

        lblTimer.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTimer.setForeground(java.awt.Color.blue);
        lblTimer.setText("Timer");
        lblTimer.setToolTipText("");
        lblTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_e, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMessage)
                                    .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEmpcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFinger, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(lblName)
                            .addComponent(lblBranch)
                            .addComponent(lblTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpcode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_e, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTimer)
                        .addGap(18, 18, 18)
                        .addComponent(lblFinger, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBranch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        // TODO add your handling code here:
        if(isDeviceConnected()){
            try {
                initilizeDevice();
                 apiCall();
                 startCapture();
            } catch (JSONException ex) {
                Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_btn_enterActionPerformed

    private void txtEmpcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpcodeActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "8";
        txtEmpcode.setText(emp_code);
                
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "7";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "9";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "4";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "5";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "6";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "1";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "3";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "2";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        this.emp_code = "";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        this.emp_code += "0";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        // TODO add your handling code here:
        this.emp_code += "E";
        txtEmpcode.setText(emp_code);
    }//GEN-LAST:event_btn_eActionPerformed
    /******** api call*******/
    private void apiCall() throws JSONException{
        // Map<String,String> sysInfo=SystemInfo.mac_ip();
        String mac=SystemInfo.getMACAddress();
        //System.out.println(mac);
        /*************** api call *************/
        

	HttpClient client = HttpClientBuilder.create().build();
	HttpPost post = new HttpPost(url+"employee/check_code");

	// add header
	//post.setHeader("User-Agent", USER_AGENT);
      
	List<NameValuePair> urlParameters;
        urlParameters = new ArrayList<NameValuePair>();
	urlParameters.add(new BasicNameValuePair("employee_code", this.emp_code));
        urlParameters.add(new BasicNameValuePair("mac", mac));

        try {
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
        }

	HttpResponse response = null;
        try {
            response = client.execute(post);
           // String json_string = EntityUtils.toString(response.getEntity());
            
           
        } catch (IOException ex) {
            Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
        }
	//System.out.println(response.getStatusLine().getStatusCode()+ "Response Code : ");
        

	BufferedReader rd = null;
        try {
            rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
        } catch (UnsupportedOperationException ex) {
            Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
        }
        

	StringBuilder result = new StringBuilder();
	String line = "";
        try {
            while ((line = rd.readLine()) != null) {
                result.append(line);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Attandance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         JSONObject jsonResponse = new JSONObject(result.toString());
         //System.out.println(jsonResponse);
         String error = jsonResponse.getString("error");
         if(error=="true"){
             //JOptionPane.showMessageDialog
             JSONArray errorTexts = jsonResponse.getJSONArray("errorText");
             String err = null;
             for(int i=0; i<errorTexts.length();i++){
                 err = errorTexts.getString(i)+",";
             }
             JOptionPane.showMessageDialog(rootPane,"Erorr: "+err);
         }else{
             // compair ISO
         }
        
        
        /*************** end of api call ********/
    }
    /******** MFS 100 ***********/
     private void initilizeDevice() throws JSONException {                                        
        this.serial_no ="";
        int ret = mfs100.Init();
        if (ret == 0) {
            deviceInfo = mfs100.GetDeviceInfo();
            this.serial_no =deviceInfo.SerialNo();
           
           // JOptionPane.showMessageDialog(rootPane, "Scanner Initialized");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");

        }
    }
     private void startCapture() {                                                
        
        int ret = mfs100.StartCapture(quality, timeout, true);
        if (ret != 0) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
        }
    } 
    private boolean isDeviceConnected() { 
        boolean is_connected = mfs100.IsConnected();
        /*if(!is_connected){
            JOptionPane.showMessageDialog(rootPane, mfs100.IsConnected());
        }*/
         return is_connected;
    } 
    private void matchISOActionPerformed() {                                            
        if (ISOTemplate == null || ISOTemplate.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Capture Finger First");
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                

                    int score = 0;
                    score = mfs100.MatchISO(saveTemplate1, ISOTemplate);
                    if (score >= 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Matched With Score " + String.valueOf(score));
                    } else if (score >= 0 && score < 14000) {
                        JOptionPane.showMessageDialog(rootPane, "Finger Not Matched");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() );
                    }
                
            }
        };
        Thread trd = new Thread(runnable);
        trd.start();

    } 
    @Override
    public void OnPreview(final FingerData fingerData) {
        //System.out.println("OnPreview");

        Runnable runnable = new Runnable() {
            public void run() {
                m_FingerPrintImage.setImage(mfs100.BytesToBitmap(fingerData.FingerImage()));
                lblFinger.setIcon(m_FingerPrintImage);
                lblFinger.repaint();
               // lblQuality.setText("Quality: " + String.valueOf(fingerData.Quality()));
               // lblQuality.repaint();
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
                   // lblQuality.setText("Quality: " + String.valueOf(fingerData.Quality()) + " Nfiq: " + String.valueOf(fingerData.Nfiq()));
                   // lblQuality.repaint();
                }
            };
            Thread trd = new Thread(runnable);
            trd.start();
           
            ISOTemplate = new byte[fingerData.ISOTemplate().length];
            System.arraycopy(fingerData.ISOTemplate(), 0, ISOTemplate, 0, fingerData.ISOTemplate().length);

            //ANSITemplate = new byte[fingerData.ANSITemplate().length];
            //System.arraycopy(fingerData.ANSITemplate(), 0, ANSITemplate, 0, fingerData.ANSITemplate().length);
            //JOptionPane.showMessageDialog(rootPane, "Capture Success.\nFinger data is saved at application path");
        } else {
            JOptionPane.showMessageDialog(rootPane, errorMsg + " (" + String.valueOf(errorCode) + ")");
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
            java.util.logging.Logger.getLogger(Attandance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attandance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attandance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attandance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attandance().setVisible(true);
            }
        });
    }
    
    /************* timer ***************/
    private void timer()
    {
        Timer timer;
        ActionListener actionListner;
        actionListner = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
                String dateTime = dateFormat.format(date);
                lblTimer.setText(dateTime);
                
            }
            
        };
        timer = new Timer(1000, actionListner);
        timer.setInitialDelay(0);
        timer.start();
    }
    /****** end of timer ************/
    /*********************** device is connected **********************/
    private void deviceFlag()
    {
        Timer timer;
        ActionListener actionListner;
        
       
        actionListner = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
               //String isConnected = "No";
                
                    //initilizeDevice();
                    if(isDeviceConnected())
                    {
                       // lblDevice.setIcon(new ImageIcon(img2));
                         lblDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Aqua-Ball-Green-icon-device.png")));
                        //lblDevice.setIcon(icon);
                    }else{
                         lblDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Aqua-Ball-Red-icon-device.png")));
                    }
               
                
                /*Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
                String dateTime = dateFormat.format(date);*/
                //lblDevice.setText(isConnected);
                
            }
            
        };
        timer = new Timer(1000, actionListner);
        timer.setInitialDelay(500);
        timer.start();
    }
    /*********************** end of device is connected ************/
    /**** set indicator *****/
    private void setIndicator(){
    
        
        lblDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Aqua-Ball-Red-icon-device.png")));
        
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblFinger;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JTextField txtEmpcode;
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


