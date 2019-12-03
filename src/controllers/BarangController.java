package controllers;

import java.util.List;
import java.util.Observable;
import daos.BarangDAO;
import models.Barang;
import interfaces.BarangInterface;
import models.OperasiCRUD;

public class BarangController extends Observable
{
private BarangInterface dao = new BarangDAO();
private OperasiCRUD crud;
    
    public void setDAO(BarangInterface barang)
    {
        dao = barang;
    }
    
    public void setDml(Barang barang, OperasiCRUD c)
    {
        boolean hasil = false;
        this.crud = c;
        switch(c)
        {
            case INSERT: 
            {
                hasil = dao.insert(barang);
                break;
            } 
                
            case UPDATE: 
            {
                hasil = dao.update(barang);
                break;
            } 
                
            case DELETE: 
            {
                hasil = dao.delete(barang);
                break;
            }
        }
        setChanged();
        
        if(hasil)
        {
            notifyObservers(barang);
        }
            else
            {
                notifyObservers();
            }
    }
    
    public OperasiCRUD getCrudState()
    {
        return crud;
    }    
    
    public List<Barang> getAllBarang()
    {
        return dao.getAllBarang();
    }
    
    public Barang getByID_Barang(String ID_Barang)
    {
        return dao.getByID_Barang(ID_Barang);
    }
}
