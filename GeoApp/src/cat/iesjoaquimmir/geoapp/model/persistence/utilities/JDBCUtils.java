/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.persistence.utilities;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author daw2017
 */
public class JDBCUtils {
    
    private JDBCUtils() {
        
    }
    
    public static AlphaColor getAlphaColor(ResultSet reader) throws SQLException {
        AlphaColor color = new AlphaColor(  reader.getDouble("alpha"),
                                            reader.getInt("red"),
                                            reader.getInt("green"),
                                            reader.getInt("blue"));
        color.setId(reader.getLong("id"));
        return color;
    }   
    
}
