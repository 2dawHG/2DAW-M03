/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.persistence.daos.impl.jdbc;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
import cat.iesjoaquimmir.geoapp.model.persistence.daos.contracts.ColorDAO;
import cat.iesjoaquimmir.geoapp.model.persistence.exception.PersistenceException;
import cat.iesjoaquimmir.geoapp.model.persistence.utilities.JDBCUtils;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author daw2017
 */
public class ColorMySQLDAO implements ColorDAO {
    
    @Override
    public AlphaColor getColorById(long id) throws PersistenceException {
    
        AlphaColor color = null;
        Connection conn = null;
        PreparedStatement sql = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/geoapp", "root", "root");
            sql =  conn.prepareStatement("SELECT id, red, green, blue, alpha FROM colors where id=?");
                sql.setLong(1, id);
                try(ResultSet reader = sql.executeQuery();) {
                    if(reader.next()) {
                        color = JDBCUtils.getAlphaColor(reader);
                    }
                }
            } catch (SQLException e) {
                throw new PersistenceException(e.getErrorCode());
        } finally {
            try {
                if(sql!=null) {
                    sql.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new PersistenceException(e.getErrorCode());
            }
            return color;
        }
    }

    @Override
    public List<AlphaColor> getColors() throws PersistenceException {
        
        AlphaColor color = null;
        Connection conn = null;
        PreparedStatement sql = null;
        List<AlphaColor> colors = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/geoapp", "root", "root");
            sql = conn.prepareStatement("SELECT id, red, green, blue, alpha FROM colors");
            try(ResultSet reader = sql.executeQuery();) {
                while (reader.next()) {
                    colors.add(JDBCUtils.getAlphaColor(reader));
                }
            }
        } catch (SQLException e) {
            throw new PersistenceException(e.getErrorCode());
        } finally {
            try {
                if(sql!=null) {
                    sql.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new PersistenceException(e.getErrorCode());
            }
            return colors;
        }
    }

    @Override
    public void saveColor(AlphaColor color) throws PersistenceException {
        
        Connection conn = null;
        PreparedStatement sql = null;
        
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/geoapp", "root", "root");
           sql = conn.prepareStatement("INSERT INTO colors (alpha, red, green, blue) VALUES (?,?,?,?)");
           
           sql.setDouble(1, color.getAlpha());
           sql.setInt(2, color.getRed());
           sql.setInt(3, color.getGreen());
           sql.setInt(4, color.getBlue());
           
           sql.executeUpdate();
           
        } catch (SQLException e) {
            throw new PersistenceException(e.getErrorCode());
        } finally {
            try {
                if(sql!=null) {
                    sql.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new PersistenceException(e.getErrorCode());
            }
        }
    }

    @Override
    public void updateColor(AlphaColor color) throws PersistenceException {
        
        Connection conn = null;
        PreparedStatement sql = null;
        
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/geoapp", "root", "root");
           sql = conn.prepareStatement("UPDATE colors SET alpha=?, red=?, green=?, blue=? WHERE id = ?");
           
           
           sql.setDouble(1, color.getAlpha());
           sql.setInt(2, color.getRed());
           sql.setInt(3, color.getGreen());
           sql.setInt(4, color.getBlue());
           sql.setLong(5, color.getId());
           
           sql.executeUpdate();
           
        } catch (SQLException e) {
            throw new PersistenceException(e.getErrorCode());
        } finally {
            try {
                if(sql!=null) {
                    sql.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new PersistenceException(e.getErrorCode());
            }
        }
        
    }
}
