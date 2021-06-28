
package finalproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clogin {
        public ResultSet openemp() throws SQLException {
        String sql = "Select id,pass,position from users where position = 'employee' and id=? and pass = ? ";
        DB d = new DB();
        PreparedStatement pst = d.conn.prepareStatement(sql);
        pst.setString(1, Login.loginid.getText());
        pst.setString(2, Login.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public ResultSet opentm() throws SQLException {
        DB d = new DB();
        String sql = "Select id,pass,position from users where position = 'team leader' and id=? and pass = ? ";
        PreparedStatement pst = d.conn.prepareStatement(sql);
        pst.setString(1, Login.loginid.getText());
        pst.setString(2, Login.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public ResultSet openpm() throws SQLException {
                DB d = new DB();
        String sql = "Select id,pass,position from users where position = 'project manger' and id=? and pass = ? ";
        PreparedStatement pst = d.conn.prepareStatement(sql);
        pst.setString(1, Login.loginid.getText());
        pst.setString(2, Login.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public ResultSet opena() throws SQLException {
        DB d = new DB();
        String sql = "Select id,pass from Admin where   id=? and pass = ? ";
        PreparedStatement pst = d.conn.prepareStatement(sql);
        pst.setString(1, Login.loginid.getText());
        pst.setString(2, Login.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }
    
}
