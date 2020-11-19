package com.example.testlawencon.database;

import com.j256.ormlite.dao.Dao;

public interface DaoCrud<T, ID> {
    void create(T model) throws Exception;
    void update(T model) throws Exception;
    void delete(T model) throws Exception;
    void createOrUpdate(T model) throws Exception;
    List<T> read() throws Exception;
    Dao<T, ID> getDao() throws Exception;
    long count() throws Exception;
    void deleteAll() throws Exception;
}
