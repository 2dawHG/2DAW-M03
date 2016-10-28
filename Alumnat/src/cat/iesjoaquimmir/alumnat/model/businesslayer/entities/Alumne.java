/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnat.model.businesslayer.entities;

/**
 *
 * @author HG
 */
public class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String dni;
    private int edat; 
    
    // Atributs estàtics
    public static final int edatDefault=99;
    public static final String nomDefault="Anonymous";
    public static final String dniDefault="00000000A";
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Alumne(String nom, String dni, int edat) {  
        this.setNom(nom);
        this.setDni(dni);
        this.setEdat(edat);
    }
    public Alumne(String nom, String dni) {
        this(nom, dni, edatDefault);
    }
    public Alumne(String nom) {
        this(nom, dniDefault);
    }
    
    public Alumne() {
        this(nomDefault);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Objectes">
    public String getSalutacio() {
       return String.format("Hola, soc en/la %s amb la identificació %s i tinc %d anys.", getNom(), getDni(), getEdat());
    }
    
    //</editor-fold>
//</editor-fold>
}
