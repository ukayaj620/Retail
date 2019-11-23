package models;
import java.sql.*;

public class Petugas {
    private String ID_Petugas;
    private String Nama_Petugas;
    private String ID_Cabang;
    private String Shift;
    private Date Tanggal_Masuk;
    private String Tempat;
    private Date Tanggal_Lahir;
    private String Alamat;
    private String No_Telepon;
    private String Jenis_Kelamin;
    
    public Petugas(String ID_Petugas, String Nama_Petugas, String ID_Cabang, String Shift, Date Tanggal_Masuk, String Tempat, Date Tanggal_Lahir, String Alamat, String No_Telepon, String Jenis_Kelamin){
        this.ID_Petugas = ID_Petugas;
        this.Nama_Petugas = Nama_Petugas;
        this.ID_Cabang = ID_Cabang;
        this.Shift = Shift;
        this.Tanggal_Masuk = Tanggal_Masuk;
        this.Tempat = Tempat;
        this.Tanggal_Lahir = Tanggal_Lahir;
        this.Alamat = Alamat;
        this.No_Telepon = No_Telepon;
        this.Jenis_Kelamin = Jenis_Kelamin;
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
    
    public String getTempat(){
        return Tempat;
    }
    
    public void setTempat(String Tempat){
        this.Tempat = Tempat;
    }
    
    public Date getTanggal_Lahir(){
        return Tanggal_Lahir;
    }
    
    public void setTanggal_Lahir(Date Tanggal_Lahir){
        this.Tanggal_Lahir = Tanggal_Lahir;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public String getNo_Telepon(){
        return No_Telepon;
    }
    
    public void setNo_Telepon(String No_Telepon){
        this.No_Telepon = No_Telepon;
    }
    
    public String getJenis_Kelamin(){
        return Jenis_Kelamin;
    }
    
    public void setJenis_Kelamin(String Jenis_Kelamin){
        this.Jenis_Kelamin = Jenis_Kelamin;
    }
}
