package Dao;

import Customers.Customers;
import Customers.GeneralList;
import java.util.ArrayList;

public interface CustomerDao {

    public int createCustomer(Customers obj);
    public int deleteCustomer(Customers obj);
    public int updateCustomer(Customers obj);
    Customers findById(int CustomerID);
    GeneralList<Customers> getAll();
    
    GeneralList<Customers> findByName(String name);
}
