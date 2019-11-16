package models;
import java.sql.*;

public class Kota {
    private String ID_Kota;
    private String Nama_Kota;
    
    public Kota(String ID_Kota, String Nama_Kota){
        this.ID_Kota = ID_Kota;
        this.Nama_Kota = Nama_Kota;
    }
    
    public String getID_Kota(){
        return ID_Kota;
    }
    
    public void setID_Kota(String ID_Kota){
        this.ID_Kota = ID_Kota;
    }
    
    public String getNama_Kota(){
        return Nama_Kota;
    }
    
    public void setNama_Kota(String Nama_Kota){
        this.Nama_Kota = Nama_Kota;
    }
}
