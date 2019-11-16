package models;
import java.sql.*;

public class Barang {
    private String ID_Barang;
    private String ID_Katagori;
    private String Nama_Barang;
    private int Harga_Barang;
    
    public Barang(String ID_Barang, String ID_Katagori, String Nama_Barang, int Harga_Barang){
        this.ID_Barang = ID_Barang;
        this.ID_Katagori = ID_Katagori;
        this.Nama_Barang = Nama_Barang;
        this.Harga_Barang = Harga_Barang;
    }
    
    public String getID_Barang(){
        return ID_Barang;
    }
    
    public void setID_Barang(String ID_Barang){
        this.ID_Barang = ID_Barang;
    }
    
    public String getID_Katagori(){
        return ID_Katagori;
    }
    
    public void setID_Katagori(String ID_Katagori){
        this.ID_Katagori = ID_Katagori;
    }
    
    public String getNama_Barang(){
        return Nama_Barang;
    }
    
    public void setNama_Barang(String Nama_Barang){
        this.Nama_Barang = Nama_Barang;
    }
    
    public int getHarga_Barang(){
        return Harga_Barang;
    }
    
    public void setHarga_Barang(int Harga_Barang){
        this.Harga_Barang = Harga_Barang;
    }
}
