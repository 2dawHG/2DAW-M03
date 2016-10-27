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
public final class Rectangle { 
    //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        private double base = 5.0; 
        private double height = 10.0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportament: Mètodes">
        
    
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea() {
            return getBase()*getHeight();      
        }
        
        public double getPerimeter() {
            return (2*getBase())*(2*getHeight());
        }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Rectangle(double base, double height) {
            this.setBase(base);
            this.setHeight(height);
        }
        
        public Rectangle(double base) {
            this(base,1.0);
        }
        public Rectangle() {
            this(1.0);
        }
        /*public Rectangle() {
            
        }*/

        
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">

        public double getBase() {
            return base;
        }
         public double getHeight() {
            return height;
        }

        public void setBase(double base) {
            if(base <= 0.0) {
                throw new IllegalArgumentException(String.format("Valor %f no valid.", base));
            }
            this.base = base;
        }
        public void setHeight(double height) {
            if(height <= 0.0) {
                throw new IllegalArgumentException(String.format("Valor %f no valid.", height));
            }
            this.height = height;
        }
    //</editor-fold>
    //</editor-fold>
}
