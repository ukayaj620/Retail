package daos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import retail.Koneksi;
import models.Petugas;
import interfaces.PetugasInterface;

public class PetugasDAO implements PetugasInterface 
{
    @Override
    public boolean insert(Petugas petugas) 
    {
        String sql = "INSERT INTO petugas VALUES(?, ?, ?, ?, ?)";
        try 
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                statement.setString(1, petugas.getID_Petugas());
                statement.setString(2, petugas.getNama_Petugas());
                statement.setString(3, petugas.getID_Cabang());
                statement.setString(4, petugas.getShift());
                statement.setDate(5, petugas.getTanggal_Masuk());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public boolean update(Petugas petugas) 
    {
        String sql = "UPDATE petugas SET petugas.Nama_Petugas = ?,"
                    + "petugas.ID_Cabang = ?, "
                    + "petugas.Shift = ?, "
                    + "petugas.Tanggal_Masuk = ? "
                    + "WHERE petugas.ID_Petugas = ?";
        try 
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql))
            {
                statement.setString(1, petugas.getNama_Petugas());
                statement.setString(2, petugas.getID_Cabang());
                statement.setString(3, petugas.getShift());
                statement.setDate(4, petugas.getTanggal_Masuk());
                statement.setString(5, petugas.getID_Petugas());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public boolean delete(Petugas petugas)
    {
        String sql = "DELETE FROM petugas WHERE petugas.ID_Petugas = ?";
        try 
        {
            int row;
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                statement.setString(1, petugas.getID_Petugas());
                row = statement.executeUpdate();
            }
            
            if (row > 0) 
            {
                return true;
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return false;
    }

    @Override
    public List<Petugas> getAllPetugas() 
    {
        List<Petugas> petugasList = new ArrayList<>();
        String sql = "SELECT * FROM petugas";
        try 
        {
            try (PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql)) 
            {
                ResultSet rs = statement.executeQuery();
                
                while (rs.next()) 
                {
                    Petugas petugas = new Petugas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
                    petugasList.add(petugas);
                }
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return petugasList;
    }

    @Override
    public Petugas getByID_Petugas(String ID_Petugas) 
    {
        Petugas petugas = null;
        String sql = "SELECT * FROM petugas WHERE petugas.ID_Petugas = ?";
        try 
        {
            PreparedStatement statement = Koneksi.openConnection().prepareStatement(sql);
            statement.setString(1, ID_Petugas);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) 
            {
                petugas = new Petugas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
            }
        } 
            catch (SQLException e) 
            {
                Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
            }
        
        return petugas;
    }
}

