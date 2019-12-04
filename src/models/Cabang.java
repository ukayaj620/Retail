package models;

public class Cabang 
{
private String ID_Cabang;
private String ID_Kota;
    
    public Cabang(String ID_Cabang, String ID_Kota)
    {
        this.ID_Cabang = ID_Cabang;
        this.ID_Kota = ID_Kota;
    }
    
    public String getID_Cabang()
    {
        return ID_Cabang;
    }
    
    public void setID_Cabang(String ID_Cabang)
    {
        this.ID_Cabang = ID_Cabang;
    }
    
    public String getID_Kota()
    {
        return ID_Kota;
    }
    
    public void setID_Kota(String ID_Kota)
    {
        this.ID_Kota = ID_Kota;
    }
    
    @Override
    public String toString() 
    {
        return ID_Cabang; //To change body of generated methods, choose Tools | Templates.
    }
}
