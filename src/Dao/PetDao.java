
package Dao;

import Customers.Customers;
import Customers.GeneralList;
import Customers.Pet;

public interface PetDao {
    int insert(Pet obj);
    int update(Pet obj);
    int delete(Pet obj);
    Pet findById(int id);
    GeneralList<Pet> findByName(String name);
    GeneralList<Pet> getAll();
    
}
