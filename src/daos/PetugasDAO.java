package daos;
import retail.Koneksi;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Petugas;
import interfaces.PetugasInterface;

public class PetugasDAO implements PetugasInterface {
    @Override
    public boolean insert(Petugas petugas) {
        String sql = "INSERT INTO petugas VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, petugas.getID_Petugas());
            statement.setString(2, petugas.getNama_Petugas());
            statement.setString(3, petugas.getID_Cabang());
            statement.setString(4, petugas.getShift());
            statement.setDate(5, petugas.getTanggal_Masuk());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean update(Petugas petugas) {
        String sql = "UPDATE petugas SET petugas.Nama_Petugas = ?, petugas.ID_Cabang = ?, petugas.Shift = ?, petugas.Tanggal_Masuk = ? WHERE petugas.ID_Petugas = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, petugas.getNama_Petugas());
            statement.setString(2, petugas.getID_Cabang());
            statement.setString(3, petugas.getShift());
            statement.setDate(4, petugas.getTanggal_Masuk());
            statement.setString(5, petugas.getID_Petugas());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean delete(Petugas petugas) {
        String sql = "DELETE FROM petugas WHERE petugas.ID_Petugas = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, petugas.getID_Petugas());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public List<Petugas> getAllPetugas() {
        List<Petugas> petugasList = new ArrayList<Petugas>();
        String sql = "SELECT * FROM petugas";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Petugas petugas = new Petugas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
                petugasList.add(petugas);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
        return petugasList;
    }

    @Override
    public Petugas getByID_Petugas(String ID_Petugas) {
        Petugas petugas = null;
        String sql = "SELECT * FROM petugas WHERE petugas.ID_Petugas = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Petugas);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                petugas = new Petugas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
            }
        } catch (Exception e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
        return petugas;
    }
}

