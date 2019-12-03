package models;

import java.sql.*;

public class Barang {

    private String ID_Barang;
    private String ID_Katagori;
    private String Nama_Barang;
    private int Harga_Barang;
    private Date Tanggal_Masuk;
    private Date Tanggal_Kadaluarsa;

    public Barang(String ID_Barang, String ID_Katagori, String Nama_Barang, int Harga_Barang, Date Tanggal_Masuk, Date Tanggal_Kadaluarsa) {
        this.ID_Barang = ID_Barang;
        this.ID_Katagori = ID_Katagori;
        this.Nama_Barang = Nama_Barang;
        this.Harga_Barang = Harga_Barang;
        this.Tanggal_Masuk = Tanggal_Masuk;
        this.Tanggal_Kadaluarsa = Tanggal_Kadaluarsa;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public String getID_Katagori() {
        return ID_Katagori;
    }

    public void setID_Katagori(String ID_Katagori) {
        this.ID_Katagori = ID_Katagori;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String Nama_Barang) {
        this.Nama_Barang = Nama_Barang;
    }

    public int getHarga_Barang() {
        return Harga_Barang;
    }

    public void setHarga_Barang(int Harga_Barang) {
        this.Harga_Barang = Harga_Barang;
    }

    public Date getTanggal_Masuk() {
        return Tanggal_Masuk;
    }

    public void setTanggal_Masuk(Date Tanggal_Masuk) {
        this.Tanggal_Masuk = Tanggal_Masuk;
    }

    public Date getTanggal_Kadaluarsa() {
        return Tanggal_Kadaluarsa;
    }

    public void setTanggal_Kadaluarsa(Date Tanggal_Kadaluarsa) {
        this.Tanggal_Kadaluarsa = Tanggal_Kadaluarsa;
    }

    @Override
    public String toString() {
        return Nama_Barang;
    }
}
