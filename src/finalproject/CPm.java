package finalproject;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CPm {

    public void pop() throws SQLException {
        DB d = new DB();
        int id = Integer.parseInt(Pmproprograss.pnum1.getText());
        String sql = "select prograss from project where p_num = '" + id + "'";
        ResultSet result = d.st.executeQuery(sql);
        while (result.next()) {
            String p = result.getString("prograss");
            Pmproprograss.prograss.setText(p + "\n");
        }
    }

    public void pmwr() throws SQLException {
        DB d = new DB();
        int id = Integer.parseInt(Pmreport.empid2.getText());
        String report = (Pmreport.report.getText());
        String sql = "insert into report values('" + id + "','" + report + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Report ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void assp() throws SQLException {
        DB d = new DB();
        int id = Integer.parseInt(Pmassproject.tmid.getText());
        String name = (Pmassproject.pname.getText());
        int num = Integer.parseInt(Pmassproject.pnum.getText());
        String sql = "insert into project values('" + num + "','" + id + "',' ','" + name + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Assgin Project", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void view_attendance() throws SQLException {
        DB d = new DB();
        DefaultTableModel v = new DefaultTableModel();
        v.addColumn("ID");
        v.addColumn("Enter Time");
        v.addColumn("Exit Time");
        v.addColumn("Date");
        Pmattendance.jTable1.setModel(v);
        String sql = "select * from attendance";
        ResultSet result = d.st.executeQuery(sql);

        while (result.next()) {
            v.addRow(new String[]{
                String.valueOf(result.getInt("id")),
                result.getString("enter_time"),
                result.getString("exit_time"),
                result.getString("date")

            });
        }
    }
    
        public void deleteReport() throws SQLException {

            DB d = new DB();
            String sql = "delete Report";
            d.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Delete All Reports", JOptionPane.INFORMATION_MESSAGE);
            d.Close(); 
    }

    
    
}
