package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    private static final String DRIVER="org.apache.derby.jdbc.ClientDriver";
    private static final String URI="jdbc:derby://localhost:1527/petshop";
    private static final String USERNAME="petshop";
    private static final String PASSWORD="petshop";
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URI, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error loading driver: " + ex);
           
        } catch (SQLException ex) {
            System.err.println("Error database connection: " + ex);
        }
        return conn;
    }
    
}