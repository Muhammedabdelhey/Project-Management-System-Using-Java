/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author myoss
 */
public class Tmpenlaties extends javax.swing.JFrame {

    /**
     * Creates new form Tmpenlaties
     */
    public Tmpenlaties() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        empid2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        penlaties = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/penlatis.png"))); // NOI18N
        jLabel1.setText("Penlaties");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, -10, 240, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Penlaties :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 160, 170, 30);

        empid2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(empid2);
        empid2.setBounds(130, 100, 250, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Id :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 60, 170, 30);

        penlaties.setColumns(20);
        penlaties.setRows(5);
        jScrollPane1.setViewportView(penlaties);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 200, 420, 130);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/back-icon.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(471, 360, 129, 40);

        send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/send.png"))); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send);
        send.setBounds(40, 360, 130, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/no-icon.png"))); // NOI18N
        jButton1.setText("Delete All Penlaties");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 360, 200, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/rsz_background.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel6.setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Teamleader e = new Teamleader();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CTm t = new CTm();
        try {
            t.deletepenlaties();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        try {
            CTm t = new CTm();
            t.writePenalties();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sendActionPerformed

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
            java.util.logging.Logger.getLogger(Tmpenlaties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tmpenlaties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tmpenlaties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tmpenlaties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tmpenlaties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public static javax.swing.JTextField empid2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea penlaties;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}