/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;
//import java.util.Random;
/**
 *
 * @author HG
 */
public abstract class Color {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private int red;
    private int green;
    private int blue;
       
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getRed() {
        return red;
    }


    public void setRed(int red) {
        if(red < 0 || red > 255) {
            throw new IllegalArgumentException(String.format("Valor %d no válido para coordenada R", red));
        }
        this.red = red;
    }


    public int getGreen() {
        return green;
    }


    public void setGreen(int green) {
        if(green < 0 || green > 255) {
            throw new IllegalArgumentException(String.format("Valor %d no válido para coordenada R", red));
        }
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }


    public void setBlue(int blue) {
        if(blue < 0 || blue > 255) {
            throw new IllegalArgumentException(String.format("Valor %d no válido para coordenada R", red));
        }
        this.blue = blue;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Color(int red, int green, int blue) {
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
    
    //<editor-fold defaultstate="collapsed" desc="Cons. toHexString">
    
    public String toHexString(boolean upper) {
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", getRed(), getGreen(), getBlue());
    }
    
    public String toHexString() {
        return toHexString(false);
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Cons. toRGBString">
    

    
    public String toRGBString(boolean upper) {
        return String.format(upper ? "RGB(%03d, %03d, %03d)" : "rgb(%03d, %03d, %03d)", getRed(), getGreen(), getBlue());
    }
    public String toRGBString() {
        return toRGBString(true);
    }
    
    //</editor-fold>
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes estàtics">
    public static int getCounter() {
        return counter;
    }
    /*public static int Random(int red, int green, int blue) {
        return 
    }*/
    public static Color fromHexString(String color) {
        return new AlphaColor (Integer.parseInt(color.substring(1, 3), 16),
                    Integer.parseInt(color.substring(3, 5), 16),
                    Integer.parseInt(color.substring(5, 7), 16)) {};
    }
    
   /* @Override
    public String toString() {
        return String.format("Color HEX: %s%n"
                + "Color RGB: %s%n",toHexString(),toRGBString());
    }*/
//</editor-fold>
    
    //</editor-fold>

    


    
}
