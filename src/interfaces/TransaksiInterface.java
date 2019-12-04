package interfaces;

import java.util.List;
import models.Transaksi;

public interface TransaksiInterface {
    public boolean insert(Transaksi transaksi);
    public boolean update(Transaksi transaksi);
    public boolean delete(Transaksi transaksi);

    public List<Transaksi> getAllTransaksi();
    public Transaksi getByID_Transaksi(String ID_Transaksi);
}
