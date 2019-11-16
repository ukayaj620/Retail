package daos;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Transaksi;
import interfaces.TransaksiInterface;

public class TransaksiDAO implements TransaksiInterface {
    @Override
    public boolean insert(Transaksi transaksi) {
        String sql = "INSERT INTO transaksi VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, transaksi.getID_Transaksi());
            statement.setString(2, transaksi.getID_Barang());
            statement.setInt(3, transaksi.getJumlah_Barang());
            statement.setBigint(4, transaksi.getHarga_Total());
            statement.setString(5, transaksi.getID_Bon());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean update(Transaksi transaksi) {
        String sql = "UPDATE transaksi SET transaksi.ID_Barang = ?, transaksi.Jumlah_Barang = ?, transaksi.Harga_Total = ?, transaksi.ID_Bon = ? WHERE transaksi.ID_Transaksi = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, transaksi.getID_Barang());
            statement.setInt(2, transaksi.getJumlah_Barang());
            statement.setBigint(3, transaksi.getHarga_Total());
            statement.setString(4, transaksi.getID_Bon());
            statement.setString(5, transaksi.getID_Transaksi());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean delete(Transaksi transaksi) {
        String sql = "DELETE FROM transaksi WHERE transaksi.ID_Transaksi = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, transaksi.getID_Transaksi());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        List<Transaksi> transaksiList = new ArrayList<Transaksi>();
        String sql = "SELECT * FROM transaksi";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Transaksi transaksi = new Transaksi(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBigint(4), rs.getString(5));
                transaksiList.add(transaksi);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return transaksiList;
    }

    @Override
    public Transaksi getByID_Transaksi(String ID_Transaksi) {
        Transaksi transaksi = null;
        String sql = "SELECT * FROM transaksi WHERE transaksi.ID_Transaksi = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Transaksi);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                transaksi = new Transaksi(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBigint(4), rs.getString(5));
            }
        } catch (Exception e) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
        return transaksi;
    }
}

