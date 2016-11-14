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
public abstract class Shape {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private Color backgroundColor;
    private Color foregroundColor;
    
    // Atribut Estatic
    private static int counter=0;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Métodes estàtics">
    public static int getCounter() {
        return counter;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        if(backgroundColor == null) {
            throw new NullPointerException("Has d'indicar un color");
        }
        this.backgroundColor = backgroundColor;
    }
    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        if(foregroundColor == null) {
            throw new NullPointerException("Has d'indicar un color");
        }
        this.foregroundColor = foregroundColor;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Shape(Color backgroundColor, Color foregroundColor) {
        this.setBackgroundColor(backgroundColor);
        this.setForegroundColor(foregroundColor);
        counter++;
    }
//</editor-fold>
//</editor-fold>

    
    
}
