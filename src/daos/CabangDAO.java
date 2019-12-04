package daos;
import retail.Koneksi;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cabang;
import interfaces.CabangInterface;

public class CabangDAO implements CabangInterface {
    @Override
    public boolean insert(Cabang cabang) {
        String sql = "INSERT INTO cabang VALUES(?, ?)";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, cabang.getID_Cabang());
            statement.setString(2, cabang.getID_Kota());
            
            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Cabang.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean update(Cabang cabang) {
        String sql = "UPDATE cabang SET cabang.ID_Kota = ? WHERE cabang.ID_Cabang = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, cabang.getID_Kota());
            statement.setString(2, cabang.getID_Cabang());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Cabang.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean delete(Cabang cabang) {
        String sql = "DELETE FROM cabang WHERE cabang.ID_Cabang = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, cabang.getID_Cabang());

            int row = statement.executeUpdate();
            statement.close();
            
            if (row > 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Cabang.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public List<Cabang> getAllCabang() {
        List<Cabang> cabangList = new ArrayList<Cabang>();
        String sql = "SELECT * FROM cabang";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Cabang cabang = new Cabang(rs.getString(1), rs.getString(2));
                cabangList.add(cabang);
            }
            statement.close();
        } catch (Exception e) {
            Logger.getLogger(Cabang.class.getName()).log(Level.SEVERE, null, e);
        }
        return cabangList;
    }

    @Override
    public Cabang getByID_Cabang(String ID_Cabang) {
        Cabang cabang = null;
        String sql = "SELECT * FROM cabang WHERE cabang.ID_Cabang = ?";
        try {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Cabang);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                cabang = new Cabang(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            Logger.getLogger(Cabang.class.getName()).log(Level.SEVERE, null, e);
        }
        return cabang;
    }
}

