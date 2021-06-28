package finalproject;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CTm {
    
DefaultTableModel t = new DefaultTableModel();
    

    public void acceptv() throws SQLException {
        DB d = new DB();
        int row = Tmvaction.vaction.getSelectedRow();
        int id = Integer.parseInt(Tmvaction.vaction.getValueAt(row, 0).toString());
        String from = Tmvaction.vaction.getValueAt(row, 1).toString();
        String to = Tmvaction.vaction.getValueAt(row, 2).toString();
        String sql = "update vaction set state ='Accept'"
                + "where id= '" + id + "'"
                + "and from_d = '" + from + "'"
                + "and to_d = '" + to + "'";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Accept Vaction ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void refuesv() throws SQLException {

        DB d = new DB();
        int row = Tmvaction.vaction.getSelectedRow();
        int Id = Integer.parseInt(Tmvaction.vaction.getValueAt(row, 0).toString());
        String from = Tmvaction.vaction.getValueAt(row, 1).toString();
        String to = Tmvaction.vaction.getValueAt(row, 2).toString();
        String sql = "update vaction set state ='Refused' "
                + "where id= '" + Id + "'"
                + "and from_d = '" + from + "'"
                + "and to_d = '" + to + "'";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Refused Vaction", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void vacation() {
        t.addColumn("id");
        t.addColumn("from");
        t.addColumn("to");

        Tmvaction.vaction.setModel(t);

        try {
            DB d = new DB();
            String sql = "select id,from_d,to_d from vaction where state ='pending' ";
            d.st.executeQuery(sql);
            ResultSet result = d.st.executeQuery(sql);

            while (result.next()) {
                t.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    result.getString(3)
                });
            }
            d.Close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void completetasks() throws SQLException {
        DB d = new DB();

        t.addColumn("Id");
        t.addColumn("Task Name");
        t.addColumn("Project Number ");
        Tmcomtasks.jTable1.setModel(t);
        String sql = "select * from tasks where state='C'";
        ResultSet result = d.st.executeQuery(sql);
        while (result.next()) {
            t.addRow(new String[]{
                String.valueOf(result.getInt(1)),
                result.getString(2),
                String.valueOf(result.getInt(3))
            });
        }
    }

    public void asstask() throws SQLException {
        int id = Integer.parseInt(Tmassigentask.empid2.getText());
        String tname = Tmassigentask.tname.getText();
        int pnum = Integer.parseInt(Tmassigentask.pnum.getText());
        String state = "A";
        DB d = new DB();
        String sql = "insert into tasks values(" + id + ",'" + tname + "'," + pnum + ",'" + state + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Assgin Task ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void deletepenlaties() throws SQLException {

        DB d = new DB();
        String sql = "delete penalties";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Delete All Penalties ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();

    }

    public void assignProject() {

        t.addColumn("Project Name");
        t.addColumn("Project Number");
        Tmassproject.jTable1.setModel(t);
        try {
            DB d = new DB();
            int id = Integer.parseInt(Login.loginid.getText());
            String sql = "select p_num , name from project where tm_id = " + id + " ";            
            ResultSet result = d.st.executeQuery(sql);
            while (result.next()) {

                t.addRow(new String[]{
                    result.getString(2),
                    String.valueOf(result.getInt(1))
                });
            }
            d.Close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void viewReports() throws SQLException {

        int id = Integer.parseInt(Tmreport.empid2.getText());
        DB d = new DB();
        String sql = "select report from report where id = " + id + "";
        ResultSet result = d.st.executeQuery(sql);
        while (result.next()) {           
            Tmreport.reports.setText(result.getString("report"));            
        }
        d.Close();
    }
    
    public void projectPrograss () throws SQLException{
  int pNum = Integer.parseInt(Tmprojectprograss.pnum.getText());
  String pop = Tmprojectprograss.prograss.getText(); 
  DB d = new DB () ;
  String sql = "update project set prograss ='"+pop+"'where p_num = "+pNum+"";
  d.st.executeUpdate(sql);
  JOptionPane.showMessageDialog(null, "Done", "Write Project Prograss", JOptionPane.INFORMATION_MESSAGE);
  d.Close();
}
    
        public void writePenalties() throws SQLException {

        int id = Integer.parseInt(Tmpenlaties.empid2.getText());
        String p = Tmpenlaties.penlaties.getText();
        DB d = new DB();
        String sql = "insert into penalties values (" + id + ",'" + p + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Write Penalties", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }
}

