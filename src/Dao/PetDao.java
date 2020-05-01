
package Dao;

import Customers.Customers;
import Customers.GeneralList;
import Customers.Pet;

public interface PetDao {
    int insert(Customers obj);
    int update(Pet obj);
    int delete(Customers obj);
    Pet findById(int id);
    GeneralList<Customers> findByName(String name);
    GeneralList<Customers> getAll();
    
}
