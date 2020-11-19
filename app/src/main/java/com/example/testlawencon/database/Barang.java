package com.example.testlawencon.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by basofi on 25/05/16.
 */
@DatabaseTable(tableName = Barang.TBL_NAME)
public class Barang implements Serializable{
    public static final String TBL_NAME = "barang";

    public static final String ID = "id";
    public static final String NAMA = "code";
    public static final String QTY = "barcode";
    public static final String EXP_DATE = "name";
    public static final String HARGA = "itemgroup_id";




    @DatabaseField(columnName = ID, generatedId = true)
    private int id;
    @DatabaseField(columnName = NAMA)
    private String nama;
    @DatabaseField(columnName = QTY)
    private int qty;
    @DatabaseField(columnName = EXP_DATE)
    private Date exp_date;
    @DatabaseField(columnName = HARGA)
    private BigDecimal harga;


    public Barang(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }
}