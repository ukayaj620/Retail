package interfaces;

import java.util.List;
import models.Barang;

public interface BarangInterface {

    public boolean insert(Barang barang);

    public boolean update(Barang barang);

    public boolean delete(Barang barang);

    public List<Barang> getAllBarang();

    public Barang getByID_Barang(String ID_Barang);
}
