package com.example.testlawencon.database;

import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class BarangDao implements DaoCrud<Barang,Integer> {

    private static BarangDao singleton;

    public static BarangDao getInstance(){
        if(singleton == null){
            singleton = new BarangDao();
        }
        return singleton;
    }

    @Override
    public void create(Barang model) throws Exception {
        getDao().create(model);
    }

    @Override
    public void update(Barang model) throws Exception {
        getDao().update(model);
    }

    @Override
    public void delete(Barang model) throws Exception {
        getDao().delete(model);
    }

    @Override
    public void createOrUpdate(Barang model) throws Exception {
        getDao().createOrUpdate(model);
    }

    @Override
    public List<Barang> read() throws Exception {
        return getDao().queryForAll();
    }

    @Override
    public void deleteAll() throws Exception {
        ConnectionSource connectionSource = Db.getInstance().getDbHelper().getConnectionSource();
        TableUtils.clearTable(connectionSource, Barang.class);
    }

}
