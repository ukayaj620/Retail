package controllers;

import daos.StorageDAO;
import interfaces.StorageInterface;
import java.util.List;
import java.util.Observable;
import models.OperasiCRUD;
import models.Storage;

public class StorageController extends Observable{
    private StorageInterface dao = new StorageDAO();
    private OperasiCRUD crud;
    
    public void setDAO(StorageInterface petugas){
        dao = petugas;
    }
    
    public void setDml(Storage storage, OperasiCRUD c){
        boolean hasil = false;
        this.crud = c;
        switch(c){
            case INSERT: hasil = dao.insert(storage); 
                break;
            case UPDATE: hasil = dao.update(storage); 
                break;
            case DELETE: hasil = dao.delete(storage); 
                break;
        }
        setChanged();
        
        if(hasil){
            notifyObservers(storage);
        }else{
            notifyObservers();
        }
    }
    
    public OperasiCRUD getCrudState(){
        return crud;
    }    
    
    public List<Storage> getAllStorage(){
        return dao.getAllStorage();
    }
    
    public List<Storage> getByID_Barang(String ID_Barang){
        return dao.getByID_Barang(ID_Barang);
    }
    
    public List<Storage> getByNama_Barang(String Nama_Barang){
        return dao.getByNama_Barang(Nama_Barang);
    }
    
    public List<Storage> getByKataKunci(String KataKunci){
        return dao.getByKataKunci(KataKunci);
    }
}
