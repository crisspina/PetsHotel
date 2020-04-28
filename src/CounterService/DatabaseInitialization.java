package CounterService;

import dataaccess.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitialization {

    public static void main(String[] args) {
        createTables();
        initializeDb(true);
    }

    public static void reNew() {
        createTables();
        initializeDb(false);
    }

    private static void createTables() {
       try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {stm.executeUpdate("DROP TABLE customer");} catch (SQLException ex) {}         
//            try {stm.executeUpdate("DROP TABLE product");} catch (SQLException ex) {}   
//            try {stm.executeUpdate("DROP TABLE wishlist");} catch (SQLException ex) {}  
           
//            try {stm.executeUpdate("CREATE TABLE customer (cus_id INT NOT NULL, cus_name VARCHAR(100),PRIMARY KEY (cus_id))");} catch (SQLException ex) {} 
//            try {stm.executeUpdate("CREATE TABLE product (pro_id INT NOT NULL, pro_name VARCHAR(100),price DOUBLE,PRIMARY KEY (pro_id))");} catch (SQLException ex) {} 
//            try {stm.executeUpdate("CREATE TABLE wishlist (cus_id INT NOT NULL, pro_id INT NOT NULL,PRIMARY KEY (cus_id,pro_id))");} catch (SQLException ex) {} 
        }catch (Exception ex) {
            System.out.println(ex.getMessage()+" แก้ไขตามคำแนะนำด้านบน แล้ว Run ใหม่จนกว่าจะผ่าน");
        }
    }

    private static void initializeDb(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
