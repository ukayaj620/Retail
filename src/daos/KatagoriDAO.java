package daos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Katagori;
import retail.Koneksi;
import interfaces.KatagoriInterface;

public class KatagoriDAO implements KatagoriInterface {

    @Override
    public boolean insert(Katagori katagori) {
        String sql = "INSERT INTO katagori VALUES(?, ?)";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, katagori.getID_Katagori());
                statement.setString(2, katagori.getNama_Katagori());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Katagori.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean update(Katagori katagori) {
        String sql = "UPDATE katagori SET katagori.Nama_Katagori = ? "
                + "WHERE katagori.ID_Katagori = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, katagori.getNama_Katagori());
                statement.setString(2, katagori.getID_Katagori());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Katagori.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean delete(Katagori katagori) {
        String sql = "DELETE FROM katagori WHERE katagori.ID_Katagori = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, katagori.getID_Katagori());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Katagori.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public List<Katagori> getAllKatagori() {
        List<Katagori> katagoriList = new ArrayList<>();
        String sql = "SELECT * FROM katagori";
        try {
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    Katagori katagori = new Katagori(rs.getString(1), rs.getString(2));
                    katagoriList.add(katagori);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Katagori.class.getName()).log(Level.SEVERE, null, e);
        }

        return katagoriList;
    }

    @Override
    public Katagori getByID_Katagori(String ID_Katagori) {
        Katagori katagori = null;
        String sql = "SELECT * FROM katagori WHERE katagori.ID_Katagori = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Katagori);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                katagori = new Katagori(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException e) {
            Logger.getLogger(Katagori.class.getName()).log(Level.SEVERE, null, e);
        }

        return katagori;
    }
}
