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
public class Square extends Shape { 
    //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        private double side; 
     
        /*private Color backgroundColor;
        private Color foregroundColor;*/
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportament: Mètodes">
        
    
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea() {
            return Math.pow(getSide(), 2);      
        }
        
        public double getPerimeter() {
            return getSide() *4;
        }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Square(double side, Color foregroundColor, Color backgroundColor) {
            super(backgroundColor, foregroundColor);
            this.setSide(side);
            // this.setForegroundColor(foregroundColor);
            // this.setBackgroundColor(backgroundColor);
        }

        public Square(double side) {
            this(side, null, null);
        }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">

        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            if(side <= 0.0) {
                throw new NullPointerException("Esto no vale");
            }
            this.side = side;
        }
      /*  public Color getBackgroundColor() {
            return backgroundColor;
        }
        public Color getForegroundColor() {
            return foregroundColor;
        }

        public void setBackgroundColor(Color backgroundColor) {
            if(backgroundColor == null) {
                throw new IllegalArgumentException(String.format("Valor %s no valid.", backgroundColor));
            }
            this.backgroundColor = backgroundColor;
        }
        
        public void setForegroundColor(Color foregroundColor) {
            if(foregroundColor == null) {
                throw new NullPointerException("Esto no vale");
            }
            this.foregroundColor = foregroundColor;
        }*/
    //</editor-fold>
    //</editor-fold>
}
