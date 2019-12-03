package models;

public class Transaksi 
{
private String ID_Transaksi;
private String ID_Barang;
private int Jumlah_Barang;
private long Harga_Total;
private String ID_Bon;
    
    public Transaksi(String ID_Transaksi, String ID_Barang, int Jumlah_Barang, long Harga_Total, String ID_Bon)
    {
        this.ID_Transaksi = ID_Transaksi;
        this.ID_Barang = ID_Barang;
        this.Jumlah_Barang = Jumlah_Barang;
        this.Harga_Total = Harga_Total;
        this.ID_Bon = ID_Bon;
    }
    
    public String getID_Transaksi()
    {
        return ID_Transaksi;
    }
    
    public void setID_Transaksi(String ID_Transaksi)
    {
        this.ID_Transaksi = ID_Transaksi;
    }
    
    public String getID_Barang(){
        return ID_Barang;
    }
    
    public void setID_Barang(String ID_Barang)
    {
        this.ID_Barang = ID_Barang;
    }
    
    public int getJumlah_Barang()
    {
        return Jumlah_Barang;
    }
    
    public void setJumlah_Barang(int Jumlah_Barang)
    {
        this.Jumlah_Barang = Jumlah_Barang;
    }
    
    public long getHarga_Total()
    {
        return Harga_Total;
    }
    
    public void setHarga_Total(long Harga_Total)
    {
        this.Harga_Total = Harga_Total;
    }
    
    public String getID_Bon(){
        return ID_Bon;
    }
    
    public void setID_Bon(String ID_Bon)
    {
        this.ID_Bon = ID_Bon;
    }
}
