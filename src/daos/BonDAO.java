package daos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Bon;
import retail.Koneksi;
import interfaces.BonInterface;

public class BonDAO implements BonInterface {

    @Override
    public boolean insert(Bon bon) {
        String sql = "INSERT INTO bon VALUES(?, ?, ?)";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, bon.getID_Bon());
                statement.setDate(2, bon.getTanggal_Transaksi());
                statement.setLong(3, bon.getSubtotal());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean update(Bon bon) {
        String sql = "UPDATE bon SET bon.Tanggal_Transaksi = ?, "
                + "bon.Subtotal = ? "
                + "WHERE bon.ID_Bon = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setDate(1, bon.getTanggal_Transaksi());
                statement.setLong(2, bon.getSubtotal());
                statement.setString(3, bon.getID_Bon());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public boolean delete(Bon bon) {
        String sql = "DELETE FROM bon WHERE bon.ID_Bon = ?";
        try {
            int row;
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                statement.setString(1, bon.getID_Bon());
                row = statement.executeUpdate();
            }

            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    @Override
    public List<Bon> getAllBon() {
        List<Bon> bonList = new ArrayList<>();
        String sql = "SELECT * FROM bon";
        try {
            try ( PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) {
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    Bon bon = new Bon(rs.getString(1), rs.getDate(2), rs.getLong(3));
                    bonList.add(bon);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, e);
        }

        return bonList;
    }

    @Override
    public Bon getByID_Bon(String ID_Bon) {
        Bon bon = null;
        String sql = "SELECT * FROM bon WHERE bon.ID_Bon = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Bon);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                bon = new Bon(rs.getString(1), rs.getDate(2), rs.getLong(3));
            }
        } catch (SQLException e) {
            Logger.getLogger(Bon.class.getName()).log(Level.SEVERE, null, e);
        }

        return bon;
    }
}
