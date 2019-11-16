package daos;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Supplier;
import interfaces.SupplierInterface;

public class SupplierDAO implements SupplierInterface {
    @Override
    public boolean insert(Supplier supplier) {
        String sql = "INSERT INTO supplier VALUES(?, ?, ?)";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, supplier.getID_Supplier());
            statement.setString(2, supplier.getNama_Supplier());
            statement.setString(3, supplier.getID_Kota());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean update(Supplier supplier) {
        String sql = "UPDATE supplier SET supplier.Nama_Supplier = ?, supplier.ID_Kota = ? WHERE supplier.ID_Supplier = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, supplier.getNama_Supplier());
            statement.setString(2, supplier.getID_Kota());
            statement.setString(3, supplier.getID_Supplier());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean delete(Supplier supplier) {
        String sql = "DELETE FROM supplier WHERE supplier.ID_Supplier = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, supplier.getID_Supplier());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public List<Supplier> getAllSupplier() {
        List<Supplier> supplierList = new ArrayList<Supplier>();
        String sql = "SELECT * FROM supplier";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Supplier supplier = new Supplier(rs.getString(1), rs.getString(2), rs.getString(3));
                supplierList.add(supplier);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, e);
        }
        return supplierList;
    }

    @Override
    public Supplier getByID_Supplier(String ID_Supplier) {
        Supplier supplier = null;
        String sql = "SELECT * FROM supplier WHERE supplier.ID_Supplier = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Supplier);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                supplier = new Supplier(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, e);
        }
        return supplier;
    }
}

