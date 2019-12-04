package controllers;

import java.util.List;
import java.util.Observable;
import daos.SupplierDAO;
import models.Supplier;
import interfaces.SupplierInterface;
import models.OperasiCRUD;

public class SupplierController extends Observable{
    private SupplierInterface dao = new SupplierDAO();
    private OperasiCRUD crud;
    
    public void setDAO(SupplierInterface supplier){
        dao = supplier;
    }
    
    public void setDml(Supplier supplier, OperasiCRUD c){
        boolean hasil = false;
        this.crud = c;
        switch(c){
            case INSERT: hasil = dao.insert(supplier); 
                break;
            case UPDATE: hasil = dao.update(supplier); 
                break;
            case DELETE: hasil = dao.delete(supplier); 
                break;
        }
        setChanged();
        
        if(hasil){
            notifyObservers(supplier);
        }else{
            notifyObservers();
        }
    }
    
    public OperasiCRUD getCrudState(){
        return crud;
    }    
    
    public List<Supplier> getAllSupplier(){
        return dao.getAllSupplier();
    }
    
    public Supplier getByID_Supplier(String ID_Supplier){
        return dao.getByID_Supplier(ID_Supplier);
    }
}
