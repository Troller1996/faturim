/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author User
 */
public class adminMenu extends javax.swing.JFrame {
Connection conn = null;
   Statement stmt = null;
  static int us;
    ArrayList<String> listpunonjesish;
    /**
     * Creates new form adminMenu
     */
    public adminMenu(int s) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
this.us=s;
    
    
      Connection conn = DbConnect.Connect();
      // the mysql insert statement
     mbushList();
          hiqShtoPunonjes();
   hiqFshiPunonjes();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Rregjistro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 490, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Fshi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 73, 36));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 168, 143, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Emri");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 139, 86, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 348, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 91, 134, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Zgjidh Shitesin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 70, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Kthehu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 643, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Faqe e pare");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 622, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mbiemer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 216, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 237, 143, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 283, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 304, 143, 38));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 369, 143, 38));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Rivendos Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 413, 143, 23));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 442, 143, 37));

        jButton4.setText("SHTO PERDORUES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 11, 166, 51));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shites", "Operator", "Admin" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 91, 166, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Roli");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 68, -1, -1));

        jButton5.setText("Fshi Perdorues");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 11, 140, 51));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void mbushList(){
      try{Connection conn = DbConnect.Connect();
        String query = " SELECT EMRI,MBIEMRI FROM shitesi";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
   ResultSet rs=preparedStmt.executeQuery();
   listpunonjesish=new ArrayList<>();
   while(rs.next()){
        listpunonjesish.add(rs.getString("EMRI")+" "+rs.getString("MBIEMRI"));
   }
      conn.close();
      jComboBox1.setModel(new DefaultComboBoxModel(listpunonjesish.toArray()));
      }
   catch(Exception e){ 
   System.out.println(e);}   
      
      }
  private void shfaqShtoPunonjes(){
jLabel1.setVisible(true);
jComboBox2.setVisible(true);
jLabel3.setVisible(true);
jLabel7.setVisible(true);
jLabel8.setVisible(true);
jLabel4.setVisible(true);
jLabel9.setVisible(true);
jTextField1.setVisible(true);
jTextField3.setVisible(true);
jTextField4.setVisible(true);
jPasswordField1.setVisible(true);
jPasswordField2.setVisible(true);
jButton1.setVisible(true);
}
   private void hiqShtoPunonjes(){
       jLabel1.setVisible(false);
jComboBox2.setVisible(false);
jLabel3.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel4.setVisible(false);
jLabel9.setVisible(false);
jTextField1.setVisible(false);
jTextField3.setVisible(false);
jTextField4.setVisible(false);
jPasswordField1.setVisible(false);
jPasswordField2.setVisible(false);
jButton1.setVisible(false);
   }
   private void shfaqFshiPunonjes(){
       jLabel5.setVisible(true);
   jComboBox1.setVisible(true);
   jButton2.setVisible(true);
   }
    private void hiqFshiPunonjes(){
        jLabel5.setVisible(false);
   jComboBox1.setVisible(false);
   jButton2.setVisible(false);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int chk=JOptionPane.showConfirmDialog(null, "Jeni Te Sigurt Qe Deshironi Te Fshini Punonjesin E Zgjedhur");
        if(chk==JOptionPane.YES_OPTION){
            String em=jComboBox1.getSelectedItem().toString();
            String[] str = em.split("\\s+");
        try
    {
    
      Connection conn = DbConnect.Connect();
      // the mysql insert statement
      String query = "DELETE FROM shitesi WHERE EMRI=? AND MBIEMRI=?";
      System.out.println(query);
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString(1, str[0]);
      preparedStmt.setString(2, str[1]);
  preparedStmt.execute();
   mbushList();
   hiqFshiPunonjes();
    }
    catch (Exception e)
    {
     
      System.err.println(e.getMessage());}
    }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login log=new Login();
        
        
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jPasswordField1.getText().length()>3&&jPasswordField1.getText().equals(jPasswordField2.getText())){
        try
    {
   String query ;
      Connection conn = DbConnect.Connect();
            // the mysql insert statement
            switch (jComboBox2.getSelectedItem().toString()) {
                case "Shites":
                    query = " INSERT into shitesi (EMRI, MBIEMRI, USERNAME, PASSWORD,ID_ADMINISTRATOR)"
                            + " values (?, ?, ?, ?,?)";break;
                case "Operator":
                    query = " INSERT into operatori (EMRI, MBIEMRI, USERNAME, PASSWORD,ID_ADMINISTRATOR)"
                            + " values (?, ?, ?, ?,?)";
                    break;
                default:
                    query = " INSERT into administratori (EMRI, MBIEMRI, USERNAME, PASSWORD,ID_ADMINISTRATOR)"
                            + " values (?, ?, ?, ?,? )";
                    break;
            }
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1,jTextField1.getText());
      preparedStmt.setString (2, jTextField3.getText());
    preparedStmt.setString (3, jTextField4.getText());
    preparedStmt.setString (4, jPasswordField1.getText());

   preparedStmt.setInt(5, us);
      preparedStmt.execute();
      
      conn.close();
      hiqShtoPunonjes();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
        }
        else{
            JOptionPane.showMessageDialog(null, "Password i Gabuar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        shfaqFshiPunonjes();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     shfaqShtoPunonjes();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMenu(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
