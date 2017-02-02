/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.persistence.daos.contracts;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
import cat.iesjoaquimmir.geoapp.model.persistence.exception.PersistenceException;
import java.util.List;
/**
 *
 * @author daw2017
 */
public interface ColorDAO {
    
    public abstract AlphaColor getColorById(long id) throws PersistenceException;
    public abstract List<AlphaColor> getColors() throws PersistenceException;
    public abstract void saveColor(AlphaColor color) throws PersistenceException;
    public abstract void updateColor(AlphaColor color) throws PersistenceException;
    
}
