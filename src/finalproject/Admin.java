/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author myoss
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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
        jLabel3 = new javax.swing.JLabel();
        Adduser = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Aproject = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(653, 453));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, -10, 180, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\myoss\\Downloads\\icon\\Manager-icon.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 100, 150, 170);

        Adduser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Adduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Add user.png"))); // NOI18N
        Adduser.setText("Add User");
        Adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdduserActionPerformed(evt);
            }
        });
        getContentPane().add(Adduser);
        Adduser.setBounds(40, 160, 280, 50);

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/update user.png"))); // NOI18N
        update.setText("Update Uesr");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(40, 250, 280, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Preppy-icon.png"))); // NOI18N
        jButton4.setText("View Users");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 340, 280, 50);

        Aproject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Aproject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Assproject.png"))); // NOI18N
        Aproject.setText("Projects");
        Aproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprojectActionPerformed(evt);
            }
        });
        getContentPane().add(Aproject);
        Aproject.setBounds(40, 70, 280, 50);

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(440, 350, 150, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/rsz_background.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel2.setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AprojectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprojectActionPerformed
        // TODO add your handling code here:
        Aprojects a = new Aprojects();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AprojectActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void AdduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdduserActionPerformed
        // TODO add your handling code here:
        Add a = new Add();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdduserActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Update a = new Update();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ViewUsers a = new ViewUsers();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adduser;
    private javax.swing.JButton Aproject;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}