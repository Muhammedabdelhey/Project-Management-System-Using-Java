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
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        Viewpenalties = new javax.swing.JButton();
        Attendance = new javax.swing.JButton();
        Requestvacation = new javax.swing.JButton();
        AssigenTasks = new javax.swing.JButton();
        UploadTask = new javax.swing.JButton();
        mytasks = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(651, 451));
        setResizable(false);
        setSize(new java.awt.Dimension(652, 452));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, -10, 180, 60);

        Viewpenalties.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Viewpenalties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/penlatis.png"))); // NOI18N
        Viewpenalties.setText("View penalties");
        Viewpenalties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewpenaltiesActionPerformed(evt);
            }
        });
        getContentPane().add(Viewpenalties);
        Viewpenalties.setBounds(60, 360, 280, 50);

        Attendance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/time-icon.png"))); // NOI18N
        Attendance.setText("Attendance");
        Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(Attendance);
        Attendance.setBounds(60, 60, 280, 50);

        Requestvacation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Requestvacation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Coffee-break-icon.png"))); // NOI18N
        Requestvacation.setText("Request vacation");
        Requestvacation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestvacationActionPerformed(evt);
            }
        });
        getContentPane().add(Requestvacation);
        Requestvacation.setBounds(60, 120, 280, 50);

        AssigenTasks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AssigenTasks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/asstask.png"))); // NOI18N
        AssigenTasks.setText("Assigened Tasks");
        AssigenTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssigenTasksActionPerformed(evt);
            }
        });
        getContentPane().add(AssigenTasks);
        AssigenTasks.setBounds(60, 180, 280, 50);

        UploadTask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UploadTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/upload task.png"))); // NOI18N
        UploadTask.setText("Upload Task");
        UploadTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadTaskActionPerformed(evt);
            }
        });
        getContentPane().add(UploadTask);
        UploadTask.setBounds(60, 240, 280, 50);

        mytasks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mytasks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/com tasks-icon.png"))); // NOI18N
        mytasks.setText("My Tasks");
        mytasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mytasksActionPerformed(evt);
            }
        });
        getContentPane().add(mytasks);
        mytasks.setBounds(60, 300, 280, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/employee.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 100, 150, 170);

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(440, 360, 150, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/rsz_background.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel2.setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadTaskActionPerformed
        // TODO add your handling code here:
        Uploadtask t=new Uploadtask();
        t.setLocation(400, 200);
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UploadTaskActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceActionPerformed
        Attendance a = new Attendance();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AttendanceActionPerformed

    private void RequestvacationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestvacationActionPerformed
        // TODO add your handling code here:
        Requestvacation v=new Requestvacation();
        v.setLocation(400, 200);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RequestvacationActionPerformed

    private void AssigenTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssigenTasksActionPerformed
        // TODO add your handling code here:
        Assigentask a=new Assigentask();
        a.setLocation(400, 200);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AssigenTasksActionPerformed

    private void mytasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mytasksActionPerformed
        // TODO add your handling code here:
        mytasks m=new mytasks();
        m.setLocation(400, 200);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mytasksActionPerformed

    private void ViewpenaltiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewpenaltiesActionPerformed
        // TODO add your handling code here:
        penalties p=new penalties();
        p.setLocation(400, 200);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewpenaltiesActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssigenTasks;
    private javax.swing.JButton Attendance;
    private javax.swing.JButton Requestvacation;
    private javax.swing.JButton UploadTask;
    private javax.swing.JButton Viewpenalties;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mytasks;
    // End of variables declaration//GEN-END:variables
}