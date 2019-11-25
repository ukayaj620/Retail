package models;
import java.sql.*;

public class Petugas {
    private String ID_Petugas;
    private String Nama_Petugas;
    private String ID_Cabang;
    private String Shift;
    private Date Tanggal_Masuk;
    
    public Petugas(String ID_Petugas, String Nama_Petugas, String ID_Cabang, String Shift, Date Tanggal_Masuk){
        this.ID_Petugas = ID_Petugas;
        this.Nama_Petugas = Nama_Petugas;
        this.ID_Cabang = ID_Cabang;
        this.Shift = Shift;
        this.Tanggal_Masuk = Tanggal_Masuk;
    }
    
    public String getID_Petugas(){
        return ID_Petugas;
    }
    
    public void setID_Petugas(String ID_Petugas){
        this.ID_Petugas = ID_Petugas;
    }
    
    public String getNama_Petugas(){
        return Nama_Petugas;
    }
    
    public void setNama_Petugas(String Nama_Petugas){
        this.Nama_Petugas = Nama_Petugas;
    }
    
    public String getID_Cabang(){
        return ID_Cabang;
    }
    
    public void setID_Cabang(String ID_Cabang){
        this.ID_Cabang = ID_Cabang;
    }
    
    public String getShift(){
        return Shift;
    }
    
    public void setShift(String Shift){
        this.Shift = Shift;
    }
    
    public Date getTanggal_Masuk(){
        return Tanggal_Masuk;
    }
    
    public void setTanggal_Masuk(Date Tanggal_Masuk){
        this.Tanggal_Masuk = Tanggal_Masuk;
    }
}
