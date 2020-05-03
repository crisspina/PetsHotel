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

    //ได้แล้ว
    @Override
    public int insert(Customers obj) {
        int nRow = 0;
        String sql = "INSERT INTO customers VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setLong(1, obj.getIdNumber());
            pstm.setString(2, obj.getfName());
            pstm.setString(3, obj.getlName());
            pstm.setString(4, obj.getPhoneNumber());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return nRow;
    }

    //ได้แล้ว
    @Override
    public int delete(Customers obj) {
        int row = 0;
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            String sql = "DELETE FROM customers WHERE cus_id=" + obj.getIdNumber();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }

    //ได้แล้ว
    public GeneralList<Customers> getAll() {
        GeneralList<Customers> custs = new GeneralList<>();
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            String sql = "SELECT * FROM customers AND pet ";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                custs.add(new Customers(rs.getLong("IdNumber"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("phonNumber")));
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
            String sql = "SELECT * FROM customers WHERE IdNumber=" + id;
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return new Customers(rs.getInt("IdNumber"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("phoneNumber"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cust;
    }

    @Override
    public GeneralList<Customers> findByName(String name) {
        GeneralList<Customers> custList = new GeneralList<>();
        String sql = "SELECT * FROM customers WHERE cus_name like ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, "%" + name + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                custList.add(new Customers(rs.getInt("CustomerID"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("phoneNumber")));
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
}
