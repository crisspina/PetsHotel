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
        createTablesPet();
        createTablesActivites();
        createTablesReservedCustomer();
        initializeDb(true);
    }

    public static void reNew() {
        createTablesCustomer();
        initializeDb(false);
    }
//Customer

    private static void createTablesCustomer() {
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {
                stm.executeUpdate("DROP TABLE customers");
            } catch (SQLException ex) {
            }

            try {
                stm.executeUpdate("CREATE TABLE Customers (IdNumber INT NOT NULL,"
                        + " Firstname VARCHAR(50) NOT NULL,"
                        + " Lastname VARCHAR(50) NOT NULL, "
                        + " phoneNumber INT NOT NULL, "
                        + " PRIMARY KEY (IdNumber,phoneNumber))");
//                        + "FOREIGN KEY (phoneNumber))");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//Pet

    private static void createTablesPet() {
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {
                stm.executeUpdate("DROP TABLE pet");
            } catch (SQLException ex) {

            }

            try {
                stm.executeUpdate("CREATE TABLE Pet(pet_name VARCHAR(50) NOT NULL,"
                        + "petAge CHAR(2),"
                        + "petType VARCHAR(6) NOT NULL,"
                        + "ownerPhoneNumber INT NOT NULL,"
                        + "PRIMARY KEY(ownerPhoneNumber))");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Activites
    private static void createTablesActivites() {
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {
                stm.executeUpdate("DROP TABLE activites");
            } catch (SQLException ex) {

            }

            try {
                stm.executeUpdate("CREATE TABLE activites(IdNumber INT NOT NULL, "
                        + "pet_name VARCHAR(50) NOT NULL,"
                        + "Activity VARCHAR(100) NOT NULL,"
                        + "PRIMARY KEY (IdNumber)) ");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//ReservedCustomer
    private static void createTablesReservedCustomer() {
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            try {
                stm.executeUpdate("DROP TABLE ReservedCustomer");
            } catch (SQLException ex) {
            }
            //เอาตารางcustomerมารวม มีid,first,last,phonenum
            //เอาตารางActivityที่จองมาใส่ มีid,petname,Act  
            try {
                stm.executeUpdate("CREATE TABLE ReservedCustomer (IdNumber INT NOT NULL,"
                        + " resRoom VARCHAR(20) "
                        + " amount INT  "
                        + " status VARCHAR(10)"
                        + " PRIMARY KEY (IdNumber))");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initializeDb(boolean show) {
        String sqlCustomer = "INSERT INTO customers VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmC = conn.prepareStatement(sqlCustomer)) {
            Scanner sc;

            try {
                if (show) {
                    System.out.println("\n--- Import Customer ---");
                    sc = new Scanner(new File("file/customers"));
                    String line;

                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmC.setLong(1, Long.parseLong(temp[0]));
                            stmC.setString(2, temp[1]);
                            stmC.setString(3, temp[2]);
                            stmC.setString(4, (temp[3]));
                            stmC.executeUpdate();
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

        //Pet
        String sqlPet = "INSERT INTO pet VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmP = conn.prepareStatement(sqlPet)) {
            Scanner sc;
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

        //Activity
        String sqlActivity = "INSERT INTO activites VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmAC = conn.prepareStatement(sqlActivity)) {
            Scanner sc;
            try {
                if (show) {
                    System.out.println("\n--- Import Activity ---");
                    sc = new Scanner(new File("file/pet"));
                    String line;

                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmAC.setLong(1, Long.parseLong(temp[0]));
                            stmAC.setString(2, temp[1]);
                            stmAC.setString(3, temp[2]);

                            stmAC.executeUpdate();
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
    
    
    //ReservedCustomer
    String sqlReservedCustomer = "INSERT INTO ReservedCustomer VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmRC = conn.prepareStatement(sqlReservedCustomer)) {
            Scanner sc;
            try {
                if (show) {
                    System.out.println("\n--- Import Pet ---");
                    sc = new Scanner(new File("file/pet"));
                    String line;
//IdNumber INT NOT NULL,"
//                        + " resRoom VARCHAR(20) "
//                        + " amount INT  "
//                        + " status VARCHAR(10)"
                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmRC.setLong(1, Long.parseLong(temp[0]));
                            stmRC.setString(2, temp[1]);
                            stmRC.setInt(3, Integer.parseInt(temp[2]));
                            stmRC.setString(4, temp[3]);
                            stmRC.executeUpdate();
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