/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lasttryfoddiary;

/**
 *
 * @author amirm
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class search_Recipes extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
    /**
     * Creates new form search_Recipes
     */
    public search_Recipes() {
        initComponents();
        Update_table();
    }
private void Update_table(){
    try {
        String query ="select * from recipes";
        con = DriverManager.getConnection("jdbc:mysql://localhost/food_diary_main", "root", "");
        pst=con.prepareStatement(query);
        rs=pst.executeQuery();
        Table_Recipes.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (SQLException ex) {
        Logger.getLogger(search_Recipes.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Recipes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingredients = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        procedure = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        rname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Recipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Recipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_RecipesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Recipes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 68, 440, 519));

        jButton1.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lasttryfoddiary/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 630, -1, 36));

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        jLabel1.setText("Search Recipes Here:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, 469, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 469, 36));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setText("Ingredients:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 469, 33));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 469, 36));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel3.setText("User Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 469, 33));

        ingredients.setColumns(20);
        ingredients.setRows(5);
        jScrollPane2.setViewportView(ingredients);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 469, 107));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel4.setText("Procedure:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 486, 33));

        procedure.setColumns(20);
        procedure.setRows(5);
        jScrollPane3.setViewportView(procedure);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 470, 260));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel5.setText("Recipe Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 469, 33));
        getContentPane().add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 469, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lasttryfoddiary/search_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Table_RecipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_RecipesMouseClicked
        // TODO add your handling code here:
        try{
           int row = Table_Recipes.getSelectedRow();
           String Table_click=(Table_Recipes.getModel().getValueAt(row,0).toString());
           String query="select * from recipes where Recipe NJame='"+Table_click+"' ";
           pst=con.prepareStatement(query);
           rs=pst.executeQuery(); 
           if(rs.next()){
               String add1 = rs.getString("User Email");
               email.setText(add1);
               String add2 = rs.getString("Recipe Name");
               rname.setText(add2);
               String add3 = rs.getString("Ingredients");
               ingredients.setText(add3);
               String add4 = rs.getString("Method");
               procedure.setText(add4);
           } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Table_RecipesMouseClicked

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
            java.util.logging.Logger.getLogger(search_Recipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_Recipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_Recipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_Recipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_Recipes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Recipes;
    private javax.swing.JTextField email;
    private javax.swing.JTextArea ingredients;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea procedure;
    private javax.swing.JTextField rname;
    // End of variables declaration//GEN-END:variables
}