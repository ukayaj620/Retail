package models;

public class Storage {
    private Barang barang;
    private Katagori katagori;
    private int stok;
    private Supplier supplier;
    
    public Storage(Barang barang, Katagori katagori, int stok, Supplier supplier){
        this.barang = barang;
        this.katagori = katagori;
        this.stok = stok;
        this.supplier = supplier;
    }
    
    public String getID_Barang(){
        return barang.getID_Barang();
    }
    
    public void setID_Barang(String ID_Barang){
        barang.setID_Barang(ID_Barang);
    }
    
    public String getNama_Barang(){
        return barang.getNama_Barang();
    }
    
    public void setNama_Barang(String Nama_Barang){
        barang.setNama_Barang(Nama_Barang);
    }
    
    public String getID_Katagori(){
        return katagori.getID_Katagori();
    }
    
    public void setID_Katagori(String ID_Katagori){
        katagori.setID_Katagori(ID_Katagori);
    }
    
    public String getNama_Katagori(){
        return katagori.getNama_Katagori();
    }
    
    public void setNama_Katagori(String Nama_Katagori){
        katagori.setNama_Katagori(Nama_Katagori);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public String getID_Supplier(){
        return supplier.getID_Supplier();
    }
    
    public void setID_Supplier(String ID_Supplier){
        supplier.setID_Supplier(ID_Supplier);
    }
    
    public String getNama_Supplier(){
        return supplier.getNama_Supplier();
    }
    
    public void setNama_Supplier(String Nama_Supplier){
        supplier.setNama_Supplier(Nama_Supplier);
    }
}
