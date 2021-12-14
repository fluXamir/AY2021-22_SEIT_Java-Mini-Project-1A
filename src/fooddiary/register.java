/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lasttryfoddiary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author amirm
 */
public class register extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        setDefaultCloseOperation(register.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        confpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Food Diary");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 490, 70));

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel2.setText("Welcome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 126, -1, 48));

        jLabel3.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel3.setText("Register Here");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 224, 229, -1));

        jLabel4.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel4.setText("First name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 281, -1, 37));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 325, 416, 36));

        jLabel5.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel5.setText("Last name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 374, 158, -1));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 412, 416, 33));

        jLabel6.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel6.setText("Email Id:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 457, -1, -1));
        getContentPane().add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 494, 416, 33));

        jLabel7.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel7.setText("Create password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 540, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 578, 416, 38));

        jLabel8.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel8.setText("Confirm password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 628, -1, -1));
        getContentPane().add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 666, 416, 38));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lasttryfoddiary/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, 150, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lasttryfoddiary/save-icon--1.png"))); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 151, 59));

        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 20, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\amirm\\Downloads\\eye-16.png")); // NOI18N
        jLabel10.setText("Show Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lasttryfoddiary/Register_page_BG.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login view=new login();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
String query = "INSERT INTO `info`(`fname`, `lname`,  `email`,  `pass`) VALUES (?, ?, ?, ?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "");
pst=con.prepareStatement(query);
pst.setString(1, firstname.getText());
pst.setString(2, lastname.getText());
pst.setString(3, emailid.getText());
pst.setString(4, password.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY!!!");
home_page view1 = new home_page();
        view1.setVisible(true);
        dispose();

}catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);

}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
                if(showpass.isSelected())
        {
            password.setEchoChar((char)0);
            confpass.setEchoChar((char)0);
        }
        // hide password chars
        else
        {
            password.setEchoChar('*');
            confpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confpass;
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showpass;
    // End of variables declaration//GEN-END:variables
}