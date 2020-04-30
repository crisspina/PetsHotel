
package dataaccess;

import Dao.CustomerDao;
import Customers.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomerDaoImp implements CustomerDao {

    private final Connection conn = DBConnection.getConnection();
    private final String SQL_CREATE_CUSTOMER = "INSERT INTO customer (CustomerID,fName, lName,phoneNumber,name) VALUES ( ?, ?, ?, ?)";
    private final String SQL_GET_ALL_CUSTOMER = "SELECT * FROM customer";
    private final String SQL_GET_CUSTOMER_BY_PETNAME = "SELECT * FROM name=?";   //name is petname
    private final String SQL_UPDATE_CUSTOMER = "UPDATE customer SET fName=?, lName=?, phoneNumber=? WHERE name=?";  //ยังไม่ชัวร์เดี๋ยวดูอีกที
    private final String SQL_DELETE_CUSTOMER = "DELETE FROM customer WHERE CustomerID=? ";
    @Override
    public int createCustomer(Customers obj) {
        int row = 0;
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_CUSTOMER, Statement.RETURN_GENERATED_KEYS)) 
            pstmt.setString(1, obj.getfName());
            pstmt.setString(2, obj.getlName());
            pstmt.setString(3, obj.getPhoneNumber());
            pstmt.setString(4, obj.getPet());
            row = pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    customer.setCustomerID(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    @Override
    public int updateCustomer(Customers obj) {
       int row = 0;
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_CUSTOMER)) {
            pstmt.setString(1, customer.getFirstname());
            pstmt.setString(2, customer.getLastname());
            pstmt.setString(3, customer.getEmail());
            pstmt.setInt(4, customer.getAge());
            pstmt.setString(5, customer.getPhone());
            row = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    @Override
    public int deleteCustomer(Customers obj) {
         int row = 0;
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE_CUSTOMER)) {
            pstmt.setInt(1, customerId);
            row = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    @Override
    public ArrayList<Customers> getAllCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
