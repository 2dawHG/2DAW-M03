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
public class Circle { 
    //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        private double radius = 8.0; 
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportament: Mètodes">
        
    
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea() {
            return Math.PI * Math.pow(getRadius(), 2);      
        }
        
        public double getPerimeter() {
            return 2 * Math.PI * getRadius();
        }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Circle(double radius) {
            this.setRadius(radius);
        }
        /*public Circle() {
            
        }*/
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">

        public double getRadius() {
            return radius;
        }


        public void setRadius(double radius) {
            if(radius <= 0.0) {
                throw new IllegalArgumentException(String.format("Valor %f no valid.", radius));
            }
            this.radius = radius;
        }
    //</editor-fold>
    //</editor-fold>
}
