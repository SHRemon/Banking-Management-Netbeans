/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDJAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;





public class registerForm extends javax.swing.JFrame {

    String msc;
    String pin2;
    public registerForm() {
	initComponents();
	RandomAcc();
	RandomPin();
	
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backButton1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Acc_NoTB = new javax.swing.JTextField();
        PinTB = new javax.swing.JTextField();
        NameTB = new javax.swing.JTextField();
        EmailTB = new javax.swing.JTextField();
        AddressTB = new javax.swing.JTextField();
        PhoneTB = new javax.swing.JTextField();
        SecATB = new javax.swing.JTextField();
        DOBTB = new javax.swing.JTextField();
        AccTypeCB = new javax.swing.JComboBox<>();
        genderCB = new javax.swing.JComboBox<>();
        registerButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        AmountTB = new javax.swing.JTextField();
        SecQCB = new javax.swing.JComboBox<>();
        national_ID = new javax.swing.JTextField();
        SecQ = new javax.swing.JTextField();
        genderTB = new javax.swing.JTextField();
        acc_Type = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 155));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Register Here");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Account No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pin Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("National ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Phone");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date of Birth");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Account Type");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Gender");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Security Question");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Answer");

        Acc_NoTB.setEditable(false);
        Acc_NoTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Acc_NoTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acc_NoTBActionPerformed(evt);
            }
        });

        PinTB.setEditable(false);
        PinTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NameTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EmailTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AddressTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PhoneTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SecATB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DOBTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AccTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Savings", "Current" }));
        AccTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccTypeCBActionPerformed(evt);
            }
        });

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        genderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCBActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 153, 255));
        registerButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Amount");

        AmountTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SecQCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "What's your pet name?", "What's your mother name?", "What's your hobby?" }));
        SecQCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecQCBActionPerformed(evt);
            }
        });

        national_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                national_IDActionPerformed(evt);
            }
        });

        SecQ.setEditable(false);

        genderTB.setEditable(false);

        acc_Type.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backButton1)
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 25, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AmountTB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(national_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameTB, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(EmailTB)
                                .addComponent(Acc_NoTB)
                                .addComponent(PinTB))
                            .addComponent(AddressTB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel8))
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PhoneTB)
                                        .addComponent(DOBTB)
                                        .addComponent(acc_Type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AccTypeCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(genderTB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SecATB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SecQCB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SecQ, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton1)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Acc_NoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(PhoneTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PinTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(DOBTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acc_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(NameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(genderTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(SecQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EmailTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(national_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(SecQCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AddressTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(SecATB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(AmountTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RandomAcc(){
	Random ra = new Random();
	long ran = Math.abs((ra.nextLong() % 900000L) + 100000L);
	String p = String.valueOf(ran);
	Acc_NoTB.setText(""+p);
	
    }
    
     public void RandomPin(){
	Random ra = new Random();
	long ran2 = Math.abs((ra.nextLong() % 9000L) + 1000L);
	String p = String.valueOf(ran2);
	PinTB.setText(""+p);
    }
    
    
    private void backButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton1MouseClicked
        BankMS b = new BankMS();
	b.setVisible(true);
	dispose();
    }//GEN-LAST:event_backButton1MouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
         
	if(NameTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Name Field is Empty!");
	}
	else if(EmailTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Email Field is Empty!");
	}
	else if(national_ID.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "National ID Field is Empty!");
	}
	else if(AddressTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Address Field is Empty!");
	}
	else if(AmountTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Amount Field is Empty!");
	}
	else if(PhoneTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Phone Field is Empty!");
	}
	else if(DOBTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Date of Birth Field is Empty!");
	}
	else if(acc_Type.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Account Type Field is Empty!");
	}
	else if(genderTB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Gender Field is Empty!");
	}
	else if(SecQ.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Security Question Field is Empty!");
	}
	else if(SecATB.getText().equals("")){
	      JOptionPane.showMessageDialog(this, "Security Answer Field is Empty!");
	}
	
	else{
	
	try{
	     Class.forName("com.mysql.jdbc.Driver");
	     
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
	      String sql = "insert into register values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	      String sqll = "insert into login values(?,?)";
	      String sql3 = "insert into account values(?,?)";
	      String sql4 = "insert into card values(?,?,?)";
	      
	      
	      PreparedStatement ptstmt = conn.prepareStatement(sql);
	      PreparedStatement ptstmt1 = conn.prepareStatement(sqll);
	      PreparedStatement ptstmt3 = conn.prepareStatement(sql3);
	      PreparedStatement ptstmt4 = conn.prepareStatement(sql4);
	     
	      
	      ptstmt.setString(1, Acc_NoTB.getText());
	      ptstmt.setString(2, PinTB.getText());
	      ptstmt.setString(3, NameTB.getText());
	      ptstmt.setString(4, EmailTB.getText());
	      ptstmt.setString(5, national_ID.getText());
	      ptstmt.setString(6, AddressTB.getText());
	      ptstmt.setString(7, AmountTB.getText());
	      ptstmt.setString(8, PhoneTB.getText());
	      ptstmt.setString(9, DOBTB.getText());
	      ptstmt.setString(10, acc_Type.getText());
	      ptstmt.setString(11, genderTB.getText());
	      ptstmt.setString(12, SecQ.getText());
	      ptstmt.setString(13, SecATB.getText());
	      
	      ptstmt.executeUpdate();
	      
	      ptstmt1.setString(1, Acc_NoTB.getText());
	      ptstmt1.setString(2, PinTB.getText());
	      
	      ptstmt1.executeUpdate();
	      
	     
	      ptstmt3.setString(1, Acc_NoTB.getText());
	      ptstmt3.setString(2, AmountTB.getText());
	      
	      
	      ptstmt3.executeUpdate();
	      
	      Random randoms = new Random();
	      long ran = Math.abs((randoms.nextLong() % 90000000L) + 5430917000000000L);
	      long ran2 = Math.abs((randoms.nextLong() % 9000L) + 1000L);
	      String mc = String.valueOf(ran);
	      String mpin = String.valueOf(ran2);
	      
	      ptstmt4.setString(1, Acc_NoTB.getText());
	      ptstmt4.setString(2, mc);
	      ptstmt4.setString(3, mpin);
	      
	      ptstmt4.executeUpdate();
	
	      JOptionPane.showMessageDialog(null, "Registration Successful!");
	      
	      
	      conn.close();
	      
	      Acc_NoTB.setText("");
	      PinTB.setText("");
	      NameTB.setText("");
	      EmailTB.setText("");
	      national_ID.setText("");
	      AddressTB.setText("");
	      AmountTB.setText("");
	      PhoneTB.setText("");
	      DOBTB.setText("");
	      acc_Type.setText("");
	      genderTB.setText("");
	      SecQ.setText("");
	      SecATB.setText("");
	     
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, "Couldn't connect Database!");
	}
	
       }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void Acc_NoTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acc_NoTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Acc_NoTBActionPerformed

    private void AccTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccTypeCBActionPerformed
       String value = AccTypeCB.getSelectedItem().toString();
       acc_Type.setText(value);
    }//GEN-LAST:event_AccTypeCBActionPerformed

    private void genderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCBActionPerformed
        String value = genderCB.getSelectedItem().toString();
        genderTB.setText(value);
    }//GEN-LAST:event_genderCBActionPerformed

    private void SecQCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecQCBActionPerformed
       String value = SecQCB.getSelectedItem().toString();
       SecQ.setText(value);
    }//GEN-LAST:event_SecQCBActionPerformed

    private void national_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_national_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_national_IDActionPerformed

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
	    java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new registerForm().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccTypeCB;
    private javax.swing.JTextField Acc_NoTB;
    private javax.swing.JTextField AddressTB;
    private javax.swing.JTextField AmountTB;
    private javax.swing.JTextField DOBTB;
    private javax.swing.JTextField EmailTB;
    private javax.swing.JTextField NameTB;
    private javax.swing.JTextField PhoneTB;
    private javax.swing.JTextField PinTB;
    private javax.swing.JTextField SecATB;
    private javax.swing.JTextField SecQ;
    private javax.swing.JComboBox<String> SecQCB;
    private javax.swing.JTextField acc_Type;
    private javax.swing.JLabel backButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JTextField genderTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField national_ID;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
