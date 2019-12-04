package controllers;

import java.util.List;
import java.util.Observable;
import daos.PetugasDAO;
import models.Petugas;
import interfaces.PetugasInterface;
import models.OperasiCRUD;

public class PetugasController extends Observable
{
private PetugasInterface dao = new PetugasDAO();
private OperasiCRUD crud;
    
    public void setDAO(PetugasInterface petugas)
    {
        dao = petugas;
    }
    
    public void setDml(Petugas petugas, OperasiCRUD c)
    {
        boolean hasil = false;
        this.crud = c;
        
        switch(c)
        {
            case INSERT: 
            {
                hasil = dao.insert(petugas);
                break;
            } 
                
            case UPDATE: 
            {
                hasil = dao.update(petugas);
                break;
            } 
                
            case DELETE: 
            {
                hasil = dao.delete(petugas);
                break;
            }
        }
        setChanged();
        
        if(hasil)
        {
            notifyObservers(petugas);
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
    
    public List<Petugas> getAllPetugas()
    {
        return dao.getAllPetugas();
    }
    
    public Petugas getByID_Petugas(String ID_Petugas)
    {
        return dao.getByID_Petugas(ID_Petugas);
    }
}
