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
public class PM extends javax.swing.JFrame {

    /**
     * Creates new form PM
     */
    public PM() {
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
        jLabel2 = new javax.swing.JLabel();
        writereport = new javax.swing.JButton();
        assproject = new javax.swing.JButton();
        pmattendance = new javax.swing.JButton();
        projectprograss = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Project Manager");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 300, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\myoss\\Downloads\\icon\\pm-icon.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 110, 160, 180);

        writereport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        writereport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/wreport.png"))); // NOI18N
        writereport.setText("Write Report");
        writereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writereportActionPerformed(evt);
            }
        });
        getContentPane().add(writereport);
        writereport.setBounds(40, 170, 280, 50);

        assproject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assproject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/pmprpject.png"))); // NOI18N
        assproject.setText("Assigen Project");
        assproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assprojectActionPerformed(evt);
            }
        });
        getContentPane().add(assproject);
        assproject.setBounds(40, 250, 280, 50);

        pmattendance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pmattendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/time-icon.png"))); // NOI18N
        pmattendance.setText("Attendance");
        pmattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmattendanceActionPerformed(evt);
            }
        });
        getContentPane().add(pmattendance);
        pmattendance.setBounds(40, 330, 280, 50);

        projectprograss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        projectprograss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/pmprograss.png"))); // NOI18N
        projectprograss.setText("Project Prograss");
        projectprograss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectprograssActionPerformed(evt);
            }
        });
        getContentPane().add(projectprograss);
        projectprograss.setBounds(40, 90, 280, 50);

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(440, 340, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/rsz_background.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel3.setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void writereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writereportActionPerformed
        // TODO add your handling code here:
        Pmreport p=new Pmreport();
        p.setLocation(400, 200);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_writereportActionPerformed

    private void pmattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmattendanceActionPerformed
        // TODO add your handling code here:
        Pmattendance p=new Pmattendance();
        p.setLocation(400, 200);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pmattendanceActionPerformed

    private void assprojectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assprojectActionPerformed
        // TODO add your handling code here:
        Pmassproject p=new Pmassproject();
        p.setLocation(400, 200);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assprojectActionPerformed

    private void projectprograssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectprograssActionPerformed
        // TODO add your handling code here:
        Pmproprograss p=new Pmproprograss();
        p.setLocation(400, 200);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_projectprograssActionPerformed

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
            java.util.logging.Logger.getLogger(PM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assproject;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pmattendance;
    private javax.swing.JButton projectprograss;
    private javax.swing.JButton writereport;
    // End of variables declaration//GEN-END:variables
}
