package dao;

import Customers.GeneralList;

public interface GeneralDao<T> {
    int insert(T obj);
    int update(T obj);
    int delete(T obj);
    GeneralList<T> getAll();
    T findById(int id);
    GeneralList<T> findByName(String name);
}