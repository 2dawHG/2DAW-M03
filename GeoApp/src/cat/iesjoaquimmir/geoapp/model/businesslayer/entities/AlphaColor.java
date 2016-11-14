/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author HG
 */
public class AlphaColor extends Color {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private double alpha;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">

//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        if(alpha <= 0.0 || alpha >= 1.0) {
            throw new IllegalArgumentException("Has de posar un número entre el 0 i el 1 siusplau");
        }
        this.alpha = alpha;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public AlphaColor(double Alpha, int red, int green, int blue) {
        super(red, green, blue);
        this.setAlpha(alpha);
    }

//</editor-fold>
    
//</editor-fold>


    
    
}
