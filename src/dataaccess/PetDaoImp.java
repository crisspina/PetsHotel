package dataaccess;

import Customers.GeneralList;
import Customers.Pet;
import Customers.PetType;
import Dao.PetDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PetDaoImp implements PetDao{

    @Override
    public int insert(Pet obj) {
int nRow = 0;
        String sql = "INSERT INTO Pet VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql)) {
           
            pstm.setString(1, obj.getName());
            pstm.setString(2, obj.getAge());
            pstm.setString(3, PetType.DOG.name());
            pstm.setString(3, PetType.CAT.name());
            pstm.setString(3, PetType.RABBIT.name());
            pstm.setString(3, PetType.RACOON.name());
           
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
