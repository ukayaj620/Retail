package models;
import java.sql.*;

public class Bon {
    private String ID_Bon;
    private Date Tanggal_Transaksi;
    private long Subtotal;
    private String ID_Petugas;
    
    public Bon(String ID_Bon, Date Tanggal_Transaksi, long Subtotal, String ID_Petugas){
        this.ID_Bon = ID_Bon;
        this.Tanggal_Transaksi = Tanggal_Transaksi;
        this.Subtotal = Subtotal;
        this.ID_Petugas = ID_Petugas;
    }
    
    public String getID_Bon(){
        return ID_Bon;
    }
    
    public void setID_Bon(String ID_Bon){
        this.ID_Bon = ID_Bon;
    }
    
    public Date getTanggal_Transaksi(){
        return Tanggal_Transaksi;
    }
    
    public void setTanggal_Transaksi(Date Tanggal_Transaksi){
        this.Tanggal_Transaksi = Tanggal_Transaksi;
    }
    
    public long getSubtotal(){
        return Subtotal;
    }
    
    public void setSubtotal(long Subtotal){
        this.Subtotal = Subtotal;
    }
    
    public String getID_Petugas(){
        return ID_Petugas;
    }
    
    public void setID_Petugas(String ID_Petugas){
        this.ID_Petugas = ID_Petugas;
    }
}
