package controllers;

import java.util.List;
import java.util.Observable;
import daos.KatagoriDAO;
import models.Katagori;
import interfaces.KatagoriInterface;
import models.OperasiCRUD;

public class KatagoriController extends Observable {

    private KatagoriInterface dao = new KatagoriDAO();
    private OperasiCRUD crud;

    public void setDAO(KatagoriInterface katagori) {
        dao = katagori;
    }

    public void setDml(Katagori katagori, OperasiCRUD c) {
        boolean hasil = false;
        this.crud = c;

        switch (c) {
            case INSERT: {
                hasil = dao.insert(katagori);
                break;
            }

            case UPDATE: {
                hasil = dao.update(katagori);
                break;
            }

            case DELETE: {
                hasil = dao.delete(katagori);
                break;
            }
        }
        setChanged();

        if (hasil) {
            notifyObservers(katagori);
        } else {
            notifyObservers();
        }
    }

    public OperasiCRUD getCrudState() {
        return crud;
    }

    public List<Katagori> getAllKatagori() {
        return dao.getAllKatagori();
    }

    public Katagori getByID_Katagori(String ID_Katagori) {
        return dao.getByID_Katagori(ID_Katagori);
    }
}
