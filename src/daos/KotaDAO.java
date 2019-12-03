package daos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Kota;
import retail.Koneksi;
import interfaces.KotaInterface;

public class KotaDAO implements KotaInterface {

    @Override
    public boolean insert(Kota kota) {
        String sql = "INSERT INTO kota VALUES(?, ?)";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, kota.getID_Kota());
                statement.setString(2, kota.getNama_Kota());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Kota.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean update(Kota kota) {
        String sql = "UPDATE kota SET kota.Nama_Kota = ? "
                + "WHERE kota.ID_Kota = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, kota.getNama_Kota());
                statement.setString(2, kota.getID_Kota());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Kota.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean delete(Kota kota) {
        String sql = "DELETE FROM kota WHERE kota.ID_Kota = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, kota.getID_Kota());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Kota.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public List<Kota> getAllKota() {
        List<Kota> kotaList = new ArrayList<>();
        String sql = "SELECT * FROM kota";
        try {
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    Kota kota = new Kota(rs.getString(1), rs.getString(2));
                    kotaList.add(kota);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Kota.class.getName()).log(Level.SEVERE, null, e);
        }

        return kotaList;
    }

    @Override
    public Kota getByID_Kota(String ID_Kota) {
        Kota kota = null;
        String sql = "SELECT * FROM kota WHERE kota.ID_Kota = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Kota);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                kota = new Kota(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException e) {
            Logger.getLogger(Kota.class.getName()).log(Level.SEVERE, null, e);
        }

        return kota;
    }
}
