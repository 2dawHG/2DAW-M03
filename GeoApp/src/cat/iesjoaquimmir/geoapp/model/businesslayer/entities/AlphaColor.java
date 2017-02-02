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
    
    private static final double MAX_OP = 1;
    private static final double MIN_OP = 0;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">

//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        if(alpha < MIN_OP || alpha > MAX_OP) {
            throw new IllegalArgumentException("Has de posar un número entre el 0 i el 1 siusplau");
        }
        this.alpha = alpha;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public AlphaColor(double alpha, int red, int green, int blue) {
        super(red, green, blue);
        this.setAlpha(alpha);
    }
    
    public AlphaColor(int red, int green, int blue) {
        this(MAX_OP, red, green, blue);
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
    /*@Override
    public String toHexString(boolean upper) {
        return String.format("%s i alpha %.2f", super.toHexString(upper), getAlpha());
    }
    
    @Override
    public String toHexString() {
        return String.format("%s i alpha %.2f", super.toHexString(true), getAlpha());
    }*/

    @Override
    public String toRGBString(boolean upper) {
        return String.format("%s i alpha %.2f", super.toRGBString(upper), getAlpha());
    }
    
    @Override
    public String toRGBString() {
        return String.format("%s i alpha %.2f", super.toRGBString(true), getAlpha());
    }

    /*@Override
    public String toString() {
        return String.format("%n%sOpacitat: %.2f%n%n", super.toHexString(), getAlpha()); 
    }*/
    
    
//</editor-fold>
//</editor-fold>



    

    
    
    

    
    

    
    
}
