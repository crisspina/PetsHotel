package Dao;

import Customers.Customers;
import Customers.GeneralList;


public interface CustomerDao { 
    int insert(Customers obj);
    int delete(Customers obj);
    Customers findById(int id);
    GeneralList<Customers> findByName(String name);
<<<<<<< HEAD

    public void insert(Customers C);

=======
    GeneralList<Customers> getAll();
>>>>>>> master
}
