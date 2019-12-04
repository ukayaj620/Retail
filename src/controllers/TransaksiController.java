package controllers;

import java.util.List;
import java.util.Observable;
import daos.TransaksiDAO;
import models.Transaksi;
import interfaces.TransaksiInterface;
import models.OperasiCRUD;

public class TransaksiController extends Observable{
    private TransaksiInterface dao = new TransaksiDAO();
    private OperasiCRUD crud;
    
    public void setDAO(TransaksiInterface transaksi){
        dao = transaksi;
    }
    
    public void setDml(Transaksi transaksi, OperasiCRUD c){
        boolean hasil = false;
        this.crud = c;
        switch(c){
            case INSERT: hasil = dao.insert(transaksi); 
                break;
            case UPDATE: hasil = dao.update(transaksi); 
                break;
            case DELETE: hasil = dao.delete(transaksi); 
                break;
        }
        setChanged();
        
        if(hasil){
            notifyObservers(transaksi);
        }else{
            notifyObservers();
        }
    }
    
    public OperasiCRUD getCrudState(){
        return crud;
    }    
    
    public List<Transaksi> getAllTransaksi(){
        return dao.getAllTransaksi();
    }
    
    public Transaksi getByID_Transaksi(String ID_Transaksi){
        return dao.getByID_Transaksi(ID_Transaksi);
    }
}
