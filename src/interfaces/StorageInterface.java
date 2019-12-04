package interfaces;

import java.util.List;
import models.Storage;

public interface StorageInterface 
{
    public boolean insert(Storage storage);
    public boolean update(Storage storage);
    public boolean delete(Storage storage);

    public List<Storage> getAllStorage();
    public List<Storage> getByID_Barang(String ID_Barang);
    public List<Storage> getByNama_Barang(String Nama_Barang);
    public List<Storage> getByKataKunci(String KataKunci);
}
