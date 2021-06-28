package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    Connection conn;
    Statement st;

    public DB() throws SQLException {
        String ConnectionUrl = "jdbc:sqlserver://localhost\\MUHAMMED\\SQLEXPRESS:1433;databaseName=finalproject" + ";username=sa" + ";password=12345";
        conn = DriverManager.getConnection(ConnectionUrl);
        st = conn.createStatement();
    }
    
    public void Close() throws SQLException
    {
        st.close();
        conn.close(); 
    }

}
