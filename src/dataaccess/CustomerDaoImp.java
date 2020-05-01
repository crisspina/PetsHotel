package dataaccess;

import Dao.CustomerDao;
import Customers.Customers;
import Customers.GeneralList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDaoImp implements CustomerDao {

     @Override
    public int insert(Customers obj) {
        int nRow = 0;
        String sql = "INSERT INTO customer VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, obj.getCustomerID());
            pstm.setString(2, obj.getfName());
            pstm.setString(3, obj.getlName());
            pstm.setString(4, obj.getPhoneNumber());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return nRow;
    }
    
     @Override
    public int delete(Customers obj) {
        int row = 0;
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            String sql = "DELETE FROM customer WHERE cus_id=" + obj.getCustomerID();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }
 
     @Override
    public int update(Customers cust) {
        int row = 0;
        String sql = "UPDATE pet SET cus_name=? WHERE cus_id=?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, cust.getfName());
            stm.setString(2, cust.getlName());
            stm.setInt(3, cust.getCustomerID());
            row = stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }
    
    
    public GeneralList<Customers> getAll() {
        GeneralList<Customers> custs = new GeneralList<>();
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            String sql = "SELECT * FROM customer";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                custs.add(new Customers(rs.getInt("cus_id"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("phonenummber")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return custs;
    }
    
 @Override
    public Customers findById(int id) {
        Customers cust = null;
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            String sql = "SELECT * FROM customer WHERE CustomerID=" + id;
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return new Customers(rs.getInt("CustomerID"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("phoneNumber"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cust;
    }

 @Override
    public GeneralList<Customers> findByName(String name) {
        GeneralList<Customers> custList = new GeneralList<>();
        String sql = "SELECT * FROM customer WHERE cus_name like ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, "%" + name + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                custList.add(new Customers(rs.getInt("CustomerID"), rs.getString("Firstname"), rs.getString("lName"), rs.getString("phoneNumber")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return custList;
    }
    
    
// อันนี้ไม่เกี่ยวแค่ เทส แต่ขอเก็บไว้ก่อน
//    public static void main(String[] args) {
//        CustomerDao cd = new CustomerDaoImp();
//        GeneralList<Customers> c = cd.getAll();
//        Customers newCust = new Customers(25952, "EDOK","Thong","0635836191");
//        cd.insert(newCust);
//        for (Customers customers : c) {
//            System.out.println(customers.toString());
//        }
//        cd.delete(newCust);
//        for (Customers customers : c) {
//            System.out.println(customers.toString());
//        }
//       
//    }
}
