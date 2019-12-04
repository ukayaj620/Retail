package interfaces;

import java.util.List;
import models.Supplier;

public interface SupplierInterface {
    public boolean insert(Supplier supplier);
    public boolean update(Supplier supplier);
    public boolean delete(Supplier supplier);

    public List<Supplier> getAllSupplier();
    public Supplier getByID_Supplier(String ID_Supplier);
}
