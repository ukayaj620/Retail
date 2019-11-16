package models;
import java.sql.*;

public class Katagori {
    private String ID_Katagori;
    private String Nama_Katagori;
    
    public Katagori(String ID_Katagori, String Nama_Katagori){
        this.ID_Katagori = ID_Katagori;
        this.Nama_Katagori = Nama_Katagori;
    }
    
    public String getID_Katagori(){
        return ID_Katagori;
    }
    
    public void setID_Katagori(String ID_Katagori){
        this.ID_Katagori = ID_Katagori;
    }
    
    public String getNama_Katagori(){
        return Nama_Katagori;
    }
    
    public void setNama_Katagori(String Nama_Katagori){
        this.Nama_Katagori = Nama_Katagori;
    }
}
