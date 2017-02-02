/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author daw2017
 */
public abstract class Entity {
    private long id = -1;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        if(this.getId()!=-1) {
            throw new UnsupportedOperationException("No se puede cambiar el ID");
        }
        if(id<=0) {
            throw new IllegalArgumentException("Valor del ID no válido");
        }
        this.id = id;
    }
}
