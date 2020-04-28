
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.GeneralList;
import model.dao.CustomerDao;



public class customerDaoImp {
    
public class CustomerDaoImp implements CustomerDao{

    @Override
    public int insert(Customer obj) {
        int rows=0;
        String sql = "INSERT INTO CUSTOMER VALUES(?,?)";
        
        try(Connection con = DBConnection.getConnection();
               
                PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.setInt(1, obj.getCus_id());
            pstm.setString(2, obj.getCus_name());
            pstm.executeUpdate();
        
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return rows;
    }

    @Override
    public int delete(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public int update(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeneralList<Customer> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeneralList<Customer> getAll() {
        
        GeneralList<Customer> cus = new GeneralList<Customer>();
        try(Connection con = DBConnection.getConnection();
                Statement stm = con.createStatement()){
            
            ResultSet rs = stm.executeQuery("SELECT * FROM CUSTOMER");
            while(rs.next()){
                cus.add(new Customer(rs.getInt("cus_id"),rs.getString("cus_name")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cus;
    }
    
}

}
