package interfaces;

import java.util.List;
import models.Katagori;

public interface KatagoriInterface {

    public boolean insert(Katagori katagori);

    public boolean update(Katagori katagori);

    public boolean delete(Katagori katagori);

    public List<Katagori> getAllKatagori();

    public Katagori getByID_Katagori(String ID_Katagori);
}
