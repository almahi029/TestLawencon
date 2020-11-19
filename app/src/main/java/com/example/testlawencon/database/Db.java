package com.example.testlawencon.database;

import android.content.Context;

public class Db {
    private static Db singleton;
    private DbHelper mDbHelper;

    public static Db getInstance(){
        if(singleton == null){
            singleton = new Db();
        }
        return  singleton;
    }

    public void init(Context context){
        mDbHelper = new DbHelper(context);
        try {
            mDbHelper.getWritableDatabase();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clearAllDb(){
        try {
            BarangDao.getInstance().deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public DbHelper getDbHelper(){
        return mDbHelper;
    }
}
