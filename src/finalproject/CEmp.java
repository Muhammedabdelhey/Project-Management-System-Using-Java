package finalproject;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author myoss
 */
public class CEmp {


    int id = Integer.parseInt(Login.loginid.getText());

    public void uploadtask() throws SQLException {
        String task = Uploadtask.taskname.getText();
        int projectnum = Integer.parseInt(Uploadtask.pnum.getText());
        DB d = new DB();
        String sql = "update tasks set state ='C' "
                + "where id= '" + id + "'"
                + "and tname = '" + task + "'"
                + "and pnum = '" + projectnum + "'";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Upload sucssefuly", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }



 public void Enter() throws SQLException {

        DB d = new DB();
        String sql = "insert into attendance values('"+java.time.LocalTime.now()+"',' ','"+java.time.LocalDate.now()+"',"+id+")";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Enter ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }
    
        public void Exit() throws SQLException {
       DB d = new DB();
        String sql = "update attendance set exit_time ='"+java.time.LocalTime.now()+"'"
                + "where id= '" + id + "'"
                + "and date = '" + java.time.LocalDate.now() + "'";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Exit ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void requestvacation() throws SQLException {

        String from1 = Requestvacation.from1.getText();
        String to = Requestvacation.to.getText();
        String s = "pending";
        DB d = new DB();
        String sql = "insert into vaction values(" + id + ",'" + from1 + "','" + to + "','" + s + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Requestvacatin ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    DefaultTableModel t = new DefaultTableModel();

    public void vacationstate() {
        t.addColumn("from");
        t.addColumn("to");
        t.addColumn("state");
        Vacationstate.jTable1.setModel(t);

        try {
            DB d = new DB();
            String sql = "select from_d,to_d,state from vaction where id =" + id;
            ResultSet result = d.st.executeQuery(sql);
            while (result.next()) {
                t.addRow(new String[]{
                    result.getString(1),
                    result.getString(2),
                    result.getString(3)
                });
            }
            d.Close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void viewpenalties() throws SQLException {
        DB d = new DB();
        String sql = "select id ,p from penalties where id =" + id;
        ResultSet result = d.st.executeQuery(sql);
        while (result.next()) {
            String p = result.getString("p");
            penalties.jTextArea1.setText(p + "\n");
        }

    }

    public void mytask() {
        t.addColumn("Task Name");
        t.addColumn("Project Number");
        mytasks.jTable1.setModel(t);
        try {
            DB d = new DB();
            String sql = "select tname,pnum from tasks where id = " + id + "and state='C'";
            ResultSet result = d.st.executeQuery(sql);
            while (result.next()) {
                t.addRow(new String[]{
                    result.getString(1),
                    String.valueOf(result.getInt(2))
                });
            }
            d.Close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void assignTask() {
        t.addColumn("Task Name");
        t.addColumn("Project Number");
        Assigentask.jTable1.setModel(t);
        try {
            DB d = new DB();
            String sql = "select tname , pnum from tasks where id = " + id + " and state = 'A' ";
            ResultSet result = d.st.executeQuery(sql);
            while (result.next()) {
                t.addRow(new String[]{
                    result.getString(1),
                    String.valueOf(result.getInt(2))
                });
            }
            d.Close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
