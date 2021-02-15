/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sinxdell
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    String Uname;
    File file = new File("save.txt");

    public LoginScreen() {
        initComponents();
        setVisible(true);
        JLabel imgLabel = new JLabel(new ImageIcon("C:\\Users\\sinxdell\\Pictures\\nibm.jpg"));
        setSize(930, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         UPDATE(); 
         
          btnLogin.addMouseListener(new MouseAdapter(){
           public void mouseReleased(MouseEvent m){

               if(remember.isSelected()){
                  SAVE(); //Save This UserName and his PassWord     
               }

           }//end of mouseReleased
       });
    }

    public void SAVE() {      //Save the UserName and Password (for one user)

        try {
            if (!file.exists()) {
                file.createNewFile();  //if the file !exist create a new one
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            bw.write(txtUsername.getText()); //write the name
            bw.newLine(); //leave a new Line
            bw.write(txtPwd.getPassword()); //write the password
            bw.close(); //close the BufferdWriter

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//End Of Save

    public void UPDATE() { //UPDATE ON OPENING THE APPLICATION

        try {
            if (file.exists()) {    //if this file exists

                Scanner scan = new Scanner(file);   //Use Scanner to read the File

                txtUsername.setText(scan.nextLine());  //append the text to name field
                txtPwd.setText(scan.nextLine()); //append the text to password field
                scan.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }//End OF UPDATE

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new java.awt.Button();
        txtUsername = new java.awt.TextField();
        button2 = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        remember = new javax.swing.JRadioButton();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/key.png"))); // NOI18N
        jLabel1.setText("Password ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 290, 110, 70);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Dont have an Account?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 250, 160, 40);

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setLabel("Log in");
        btnLogin.setName("btnLogin"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(210, 400, 300, 40);

        txtUsername.setName("txtUsername"); // NOI18N
        getContentPane().add(txtUsername);
        txtUsername.setBounds(320, 270, 180, 30);

        button2.setBackground(new java.awt.Color(51, 51, 255));
        button2.setLabel("Register");
        button2.setName("btnRegister"); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(580, 290, 310, 40);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/email.png"))); // NOI18N
        jLabel6.setText("Username ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 250, 110, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/profile.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 110, 160, 130);

        txtPwd.setBackground(new java.awt.Color(255, 255, 255));
        txtPwd.setForeground(new java.awt.Color(0, 0, 0));
        txtPwd.setName("txtPwd"); // NOI18N
        getContentPane().add(txtPwd);
        txtPwd.setBounds(320, 312, 180, 30);

        kGradientPanel1.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 102, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 51));
        kGradientPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPackage/medicine.png"))); // NOI18N
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(630, 30, 310, 240);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Medical Sales System");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(20, 10, 440, 70);

        remember.setText("Remember me");
        kGradientPanel1.add(remember);
        remember.setBounds(210, 360, 140, 28);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 920, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        this.hide();
        RegisterScreen rs = new RegisterScreen();
        rs.show();
    }//GEN-LAST:event_button2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String databaseUsername = txtUsername.getText();
            Uname = databaseUsername;
            String databasePassword = txtPwd.getText();
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/medical_sales", "root", "");

            PreparedStatement st = (PreparedStatement) con.prepareStatement("Select email,pwd from login where email=? and pwd=?");
            st.setString(1, databaseUsername);
            st.setString(2, databasePassword);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                dispose();

                JOptionPane.showMessageDialog(null, "You have successfully logged in");
                this.hide();
                Dashboard ds = new Dashboard(this, databaseUsername);

                ds.show();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username & Password");
            }

//    if (txtUsername.equals(databaseUsername) && txtPwd.equals(databasePassword)) {
//        System.out.println("Successful Login!\n----");
//    } else {
//        System.out.println("Incorrect Password\n----");
//        JOptionPane.showMessageDialog(null, "Password Incorrect.");
//    }
//            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database not connected.");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginScreen ls = new LoginScreen();
                ls.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private java.awt.Button button2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton remember;
    private javax.swing.JPasswordField txtPwd;
    private java.awt.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

    String getUname() {

        return Uname;
    }

}
