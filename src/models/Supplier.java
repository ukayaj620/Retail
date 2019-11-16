package models;
import java.sql.*;

public class Supplier {
    private String ID_Supplier;
    private String Nama_Supplier;
    private String ID_Kota;
    
    public Supplier(String ID_Supplier, String Nama_Supplier, String ID_Kota){
        this.ID_Supplier = ID_Supplier;
        this.Nama_Supplier = Nama_Supplier;
        this.ID_Kota = ID_Kota;
    }
    
    public String getID_Supplier(){
        return ID_Supplier;
    }
    
    public void setID_Supplier(String ID_Supplier){
        this.ID_Supplier = ID_Supplier;
    }
    
    public String getNama_Supplier(){
        return Nama_Supplier;
    }
    
    public void setNama_Supplier(String Nama_Supplier){
        this.Nama_Supplier = Nama_Supplier;
    }
    
    public String getID_Kota(){
        return ID_Kota;
    }
    
    public void setID_Kota(String ID_Kota){
        this.ID_Kota = ID_Kota;
    }
}
