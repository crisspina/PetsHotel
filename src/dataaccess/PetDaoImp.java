package dataaccess;

import Customers.GeneralList;
import Customers.Pet;
import Customers.PetType;
import Dao.PetDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PetDaoImp implements PetDao {

    @Override
    public int insert(Pet obj) {
        int nRow = 0;
        String sql = "INSERT INTO Pet VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, obj.getName());
            pstm.setString(2, obj.getAge());
            pstm.setString(3, obj.getType().name());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return nRow;
    }

    @Override
    public int update(Pet obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Pet obj) {
        int row = 0;
        String sql = "DELETE FROM pet WHERE pet_name ='"+obj.getName()+"'AND petage='"+obj.getAge()+"'AND pettype ='"+obj.getType().name()+"'";
        try (Connection conn = DBConnection.getConnection();
                Statement stm = conn.createStatement()) {
            System.out.println("Name : " + obj.getName());
            System.out.println("Age : " + obj.getAge());
            System.out.println("Pettype : " + obj.getType());
            row = stm.executeUpdate(sql);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }

    @Override
    public Pet findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeneralList<Pet> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeneralList<Pet> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
