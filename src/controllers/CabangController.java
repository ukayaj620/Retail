package controllers;

import java.util.List;
import java.util.Observable;
import daos.CabangDAO;
import models.Cabang;
import interfaces.CabangInterface;
import models.OperasiCRUD;

public class CabangController extends Observable {

    private CabangInterface dao = new CabangDAO();
    private OperasiCRUD crud;

    public void setDAO(CabangInterface cabang) {
        dao = cabang;
    }

    public void setDml(Cabang cabang, OperasiCRUD c) {
        boolean hasil = false;
        this.crud = c;

        switch (c) {
            case INSERT: {
                hasil = dao.insert(cabang);
                break;
            }

            case UPDATE: {
                hasil = dao.update(cabang);
                break;
            }

            case DELETE: {
                hasil = dao.delete(cabang);
                break;
            }
        }
        setChanged();

        if (hasil) {
            notifyObservers(cabang);
        } else {
            notifyObservers();
        }
    }

    public OperasiCRUD getCrudState() {
        return crud;
    }

    public List<Cabang> getAllCabang() {
        return dao.getAllCabang();
    }

    public Cabang getByID_Cabang(String ID_Cabang) {
        return dao.getByID_Cabang(ID_Cabang);
    }
}
