package Dao;

import Customers.Customers;
import Customers.GeneralList;


public interface CustomerDao { 
    int insert(Customers obj);
    int delete(Customers obj);
    Customers findById(int id);
    GeneralList<Customers> findByName(String name);
    GeneralList<Customers> getAll();
}