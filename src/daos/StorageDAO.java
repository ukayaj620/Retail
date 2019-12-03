package daos;

import interfaces.StorageInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Barang;
import models.Katagori;
import models.Storage;
import models.Supplier;
import retail.Koneksi;

public class StorageDAO implements StorageInterface{

    @Override
    public boolean insert(Storage storage) {
        String sql = "INSERT INTO storage VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, storage.getID_Barang());
            statement.setString(2, storage.getID_Katagori());
            statement.setInt(3, storage.getStok());
            statement.setString(4, storage.getID_Supplier());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean update(Storage storage) {
        String sql = "UPDATE storage SET storage.ID_Katagori = ?, storage.Stock = ?, storage.ID_Supplier = ? WHERE storage.ID_Barang = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, storage.getID_Katagori());
            statement.setInt(2, storage.getStok());
            statement.setString(3, storage.getID_Supplier());
            statement.setString(4, storage.getID_Barang());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean delete(Storage storage) {
        String sql = "DELETE FROM storage WHERE storage.ID_Barang = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, storage.getID_Barang());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public List<Storage> getAllStorage() {
        List<Storage> storageList = new ArrayList<Storage>();
        String sql = "SELECT storage.ID_Barang, Barang.Nama_Barang, storage.ID_Katagori, Katagori.Nama_Katagori, Stock, storage.ID_Supplier, Supplier.Nama_Supplier FROM storage \n" +
                     "inner join Barang on storage.ID_Barang = Barang.ID_Barang \n" +
                     "inner join Katagori on storage.ID_Katagori = Katagori.ID_Katagori \n" +
                     "inner join Supplier on storage.ID_Supplier =  Supplier.ID_Supplier;";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Storage s = new Storage(
                        new Barang(rs.getString(1), null, rs.getString(2), 0, null, null), 
                        new Katagori(rs.getString(3), rs.getString(4)),
                        rs.getInt(5),
                        new Supplier(rs.getString(6), rs.getString(7), null)
                );
                storageList.add(s);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return storageList;}

    @Override
    public List<Storage> getByID_Barang(String ID_Barang) {
        List<Storage> storageList = new ArrayList<Storage>();
        String sql = "SELECT storage.ID_Barang, Barang.Nama_Barang, storage.ID_Katagori, Katagori.Nama_Katagori, Stock, storage.ID_Supplier, Supplier.Nama_Supplier FROM storage \n" +
                     "inner join Barang on storage.ID_Barang = Barang.ID_Barang \n" +
                     "inner join Katagori on storage.ID_Katagori = Katagori.ID_Katagori \n" +
                     "inner join Supplier on storage.ID_Supplier = Supplier.ID_Supplier " + 
                     "where storage.ID_Barang = ?;";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Barang);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Storage s = new Storage(
                        new Barang(rs.getString(1), null, rs.getString(2), 0, null, null), 
                        new Katagori(rs.getString(3), rs.getString(4)),
                        rs.getInt(5),
                        new Supplier(rs.getString(6), rs.getString(7), null)
                );
                storageList.add(s);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return storageList;
    }

    @Override
    public List<Storage> getByNama_Barang(String Nama_Barang) {
        List<Storage> storageList = new ArrayList<Storage>();
        String sql = "SELECT storage.ID_Barang, Barang.Nama_Barang, storage.ID_Katagori, Katagori.Nama_Katagori, Stock, storage.ID_Supplier, Supplier.Nama_Supplier FROM storage \n" +
                     "inner join Barang on storage.ID_Barang = Barang.ID_Barang \n" +
                     "inner join Katagori on storage.ID_Katagori = Katagori.ID_Katagori \n" +
                     "inner join Supplier on storage.ID_Supplier = Supplier.ID_Supplier " + 
                     "where Barang.Nama_Barang LIKE ?;";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, Nama_Barang+"%");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Storage s = new Storage(
                        new Barang(rs.getString(1), null, rs.getString(2), 0, null, null), 
                        new Katagori(rs.getString(3), rs.getString(4)),
                        rs.getInt(5),
                        new Supplier(rs.getString(6), rs.getString(7), null)
                );
                storageList.add(s);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return storageList;
    }

    @Override
    public List<Storage> getByKataKunci(String KataKunci) {
        List<Storage> storageList = new ArrayList<Storage>();
        String sql = "SELECT storage.ID_Barang, Barang.Nama_Barang, storage.ID_Katagori, Katagori.Nama_Katagori, Stock, storage.ID_Supplier, Supplier.Nama_Supplier FROM storage \n" +
                     "inner join Barang on storage.ID_Barang = Barang.ID_Barang \n" +
                     "inner join Katagori on storage.ID_Katagori = Katagori.ID_Katagori \n" +
                     "inner join Supplier on storage.ID_Supplier = Supplier.ID_Supplier " + 
                     "where Barang.Nama_Barang LIKE ?;";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, "%"+KataKunci+"%");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Storage s = new Storage(
                        new Barang(rs.getString(1), null, rs.getString(2), 0, null, null), 
                        new Katagori(rs.getString(3), rs.getString(4)),
                        rs.getInt(5),
                        new Supplier(rs.getString(6), rs.getString(7), null)
                );
                storageList.add(s);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, e);
        }
        return storageList;
    }
    
}
