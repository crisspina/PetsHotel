package CounterService;

import dataaccess.DBConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DatabaseInitialization {

    public static void main(String[] args) {
        createTablesCustomer();
        initializeDb(true);
    }

    public static void reNew() {
        createTablesCustomer();
        initializeDb(false);
    }

    private static void createTablesCustomer() {
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {stm.executeUpdate("DROP TABLE customer");} catch (SQLException ex) {}
            try {stm.executeUpdate("DROP TABLE pet");} catch (SQLException ex) {}
            
            
            try {stm.executeUpdate("CREATE TABLE Customer (cus_id INT NOT NULL, Firstname VARCHAR(50) NOT NULL, Lastname VARCHAR(50) NOT NULL, phoneNummber INT NOT NULL, PRIMARY KEY (cus_id))");} catch (SQLException ex) {}
            try {stm.executeUpdate("CREATE TABLE Pet(pet_name VARCHAR(50) NOT NULL,petAge CHAR(2),petType VARCHAR(6) NOT NULL)");} catch (SQLException ex) {}

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void initializeDb(boolean show) {
        String sqlCustomer = "INSERT INTO customer VALUES(?,?,?,?)";
        String sqlPet = "INSERT INTO pet VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmC = conn.prepareStatement(sqlCustomer);
                PreparedStatement stmP = conn.prepareStatement(sqlPet)) {
            Scanner sc;
            
            try {
                if (show) {
                    System.out.println("\n--- Import Customer ---");
                    sc = new Scanner(new File("file/customers"));
                    String line;
                    
                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmC.setInt(1,  Integer.parseInt(temp[0]));
                            stmC.setString(2, temp[1]);
                            stmC.setString(3, temp[2]);
                            stmC.setInt(4, Integer.parseInt(temp[3]));
                            stmC.executeUpdate();
                            if (show) {
                                System.out.println("Insert: " + line);
                            }
                        }
                    } catch (NoSuchElementException ex) {}
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmP = conn.prepareStatement(sqlPet)) {
            Scanner sc;
    //Pet
     try {
                if (show) {
                    System.out.println("\n--- Import Pet ---");
                    sc = new Scanner(new File("file/pet"));
                    String line;
                    
                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmP.setString(1, temp[0]);
                            stmP.setString(2, temp[1]);
                            stmP.setString(3, temp[2]);
                            stmP.executeUpdate();
                            if (show) {
                                System.out.println("Insert: " + line);
                            }
                        }
                    } catch (NoSuchElementException ex) {

                    }
                }

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}