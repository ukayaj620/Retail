package interfaces;

import java.util.List;
import models.Kota;

public interface KotaInterface {
    public boolean insert(Kota kota);
    public boolean update(Kota kota);
    public boolean delete(Kota kota);

    public List<Kota> getAllKota();
    public Kota getByID_Kota(String ID_Kota);
}
