package interfaces;

import java.util.List;
import models.Bon;

public interface BonInterface {

    public boolean insert(Bon bon);

    public boolean update(Bon bon);

    public boolean delete(Bon bon);

    public List<Bon> getAllBon();

    public Bon getByID_Bon(String ID_Bon);
}
