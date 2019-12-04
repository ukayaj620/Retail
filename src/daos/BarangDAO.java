package daos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Barang;
import retail.Koneksi;
import interfaces.BarangInterface;

public class BarangDAO implements BarangInterface 
{
    @Override
    public boolean insert(Barang barang) 
    {
        String sql = "INSERT INTO barang VALUES(?, ?, ?, ?, ?, ?)";
        try
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                statement.setString(1, barang.getID_Barang());
                statement.setString(2, barang.getID_Katagori());
                statement.setString(3, barang.getNama_Barang());
                statement.setInt(4, barang.getHarga_Barang());
                statement.setDate(5, barang.getTanggal_Masuk());
                statement.setDate(6, barang.getTanggal_Kadaluarsa());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public boolean update(Barang barang) 
    {
        String sql = "UPDATE barang SET barang.ID_Katagori = ?, "
                    + "barang.Nama_Barang = ?, "
                    + "barang.Harga_Barang = ?, "
                    + "barang.Tanggal_Masuk = ?, "
                    + "barang.Tanggal_Kadaluarsa = ? "
                    + "WHERE barang.ID_Barang = ?";
        try 
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                statement.setString(1, barang.getID_Katagori());
                statement.setString(2, barang.getNama_Barang());
                statement.setInt(3, barang.getHarga_Barang());
                statement.setDate(4, barang.getTanggal_Masuk());
                statement.setDate(5, barang.getTanggal_Kadaluarsa());
                statement.setString(6, barang.getID_Barang());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public boolean delete(Barang barang) 
    {
        String sql = "DELETE FROM barang WHERE barang.ID_Barang = ?";
        try
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                statement.setString(1, barang.getID_Barang());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public List<Barang> getAllBarang() {
        List<Barang> barangList = new ArrayList<>();
        String sql = "SELECT * FROM barang";
        try 
        {
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql))
            {
                ResultSet rs = statement.executeQuery();
                
                while (rs.next()) 
                {
                    Barang barang = new Barang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getDate(6));
                    barangList.add(barang);
                }
            }
        } 
            catch (SQLException e)
            {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, e);
            }

        return barangList;
    }

    @Override
    public Barang getByID_Barang(String ID_Barang) 
    {
        Barang barang = null;
        String sql = "SELECT * FROM barang WHERE barang.ID_Barang = ?";
        try 
        {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Barang);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) 
            {
                barang = new Barang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getDate(6));
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return barang;
    }
}

