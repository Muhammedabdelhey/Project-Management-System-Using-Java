package finalproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CAdmin {

    

    public void adduser() throws SQLException {
        int id = Integer.parseInt(Add.id.getText());
        String Name = Add.name.getText();
        int Pass = Integer.parseInt(Add.pass.getText());
        float Salary = Float.parseFloat(Add.salary.getText());
        String Poss = Add.poss.getSelectedItem().toString();
        DB d = new DB();
        String sql = "insert into users values(" + id + ",'" + Name + "'," + Pass + "," + Salary + ",'" + Poss + "')";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "ADD User ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void updateuser() throws SQLException {
        int Id = Integer.parseInt(Update.id.getText());
        float Salary = Float.parseFloat(Update.salary.getText());
        String Poss = Update.poss.getSelectedItem().toString();
        DB d = new DB();
        String sql = "update users set salary=" + Salary + ""
                + ",position='" + Poss + "'"
                + "where id=" + Id + "";
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Update User ", JOptionPane.INFORMATION_MESSAGE);
        d.Close();
    }

    public void View() {
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID");
        t.addColumn("Name");
        t.addColumn("Salary");
        t.addColumn("Position");
        ViewUsers.view.setModel(t);
        try {
            DB d = new DB();
            String sql = "select id,name,salary,position from users";
            ResultSet result = d.st.executeQuery(sql);

            while (result.next()) {
                t.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    String.valueOf(result.getFloat(3)),
                    result.getString(4)
                });
            }

            //Close
            d.Close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 
        
        public void Viewprojects() {
            DefaultTableModel t = new DefaultTableModel();
        t.addColumn("Project number");
        t.addColumn("Progress");
        t.addColumn("Project name");
        Aprojects.view.setModel(t);
        try {
            DB d = new DB();
            String sql = "select p_num,prograss,name from project";
            ResultSet result = d.st.executeQuery(sql);

            while (result.next()) {
                t.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                   result.getString(2),
                   result.getString(3)
                });
            }

            //Close
            d.Close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    

          }

    

    public void delete() throws SQLException {
        DB d = new DB();
        int row = ViewUsers.view.getSelectedRow();
        int id = Integer.parseInt(ViewUsers.view.getValueAt(row, 0).toString());
        String sql = "delete from users where id = " + id;
        d.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Done", "Delete User ", JOptionPane.INFORMATION_MESSAGE);
        View();
        d.Close();
    }

}
