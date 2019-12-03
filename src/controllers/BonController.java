package controllers;

import java.util.List;
import java.util.Observable;
import daos.BonDAO;
import models.Bon;
import interfaces.BonInterface;
import models.OperasiCRUD;

public class BonController extends Observable {

    private BonInterface dao = new BonDAO();
    private OperasiCRUD crud;

    public void setDAO(BonInterface bon) {
        dao = bon;
    }

    public void setDml(Bon bon, OperasiCRUD c) {
        boolean hasil = false;
        this.crud = c;
        switch (c) {
            case INSERT: {
                hasil = dao.insert(bon);
                break;
            }

            case UPDATE: {
                hasil = dao.update(bon);
                break;
            }

            case DELETE: {
                hasil = dao.delete(bon);
                break;
            }
        }
        setChanged();

        if (hasil) {
            notifyObservers(bon);
        } else {
            notifyObservers();
        }
    }

    public OperasiCRUD getCrudState() {
        return crud;
    }

    public List<Bon> getAllBon() {
        return dao.getAllBon();
    }

    public Bon getByID_Bon(String ID_Bon) {
        return dao.getByID_Bon(ID_Bon);
    }
}
