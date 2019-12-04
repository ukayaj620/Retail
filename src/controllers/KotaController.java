package controllers;

import java.util.List;
import java.util.Observable;
import daos.KotaDAO;
import models.Kota;
import interfaces.KotaInterface;
import models.OperasiCRUD;

public class KotaController extends Observable{
    private KotaInterface dao = new KotaDAO();
    private OperasiCRUD crud;
    
    public void setDAO(KotaInterface kota){
        dao = kota;
    }
    
    public void setDml(Kota kota, OperasiCRUD c){
        boolean hasil = false;
        this.crud = c;
        switch(c){
            case INSERT: hasil = dao.insert(kota); 
                break;
            case UPDATE: hasil = dao.update(kota); 
                break;
            case DELETE: hasil = dao.delete(kota); 
                break;
        }
        setChanged();
        
        if(hasil){
            notifyObservers(kota);
        }else{
            notifyObservers();
        }
    }
    
    public OperasiCRUD getCrudState(){
        return crud;
    }    
    
    public List<Kota> getAllKota(){
        return dao.getAllKota();
    }
    
    public Kota getByID_Kota(String ID_Kota){
        return dao.getByID_Kota(ID_Kota);
    }
}
