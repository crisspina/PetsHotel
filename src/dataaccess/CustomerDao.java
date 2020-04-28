package dataaccess;

import Customers.Customers;
import java.util.ArrayList;

public interface CustomerDao {

    public int createCustomer(Customers obj);

    public int updateCustomer(Customers obj);

    public int deleteCustomer(Customers obj);

    public ArrayList<Customers> getAllCustomer();
    
//    GeneralList<Customer> findByName(String name);
}
