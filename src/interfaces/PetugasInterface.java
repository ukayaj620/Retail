package interfaces;

import java.util.List;
import models.Petugas;

public interface PetugasInterface {

    public boolean insert(Petugas petugas);

    public boolean update(Petugas petugas);

    public boolean delete(Petugas petugas);

    public List<Petugas> getAllPetugas();

    public Petugas getByID_Petugas(String ID_Petugas);
}
