package interfaces;

import java.util.List;
import models.Cabang;

public interface CabangInterface {

    public boolean insert(Cabang cabang);

    public boolean update(Cabang cabang);

    public boolean delete(Cabang cabang);

    public List<Cabang> getAllCabang();

    public Cabang getByID_Cabang(String ID_Cabang);
}
