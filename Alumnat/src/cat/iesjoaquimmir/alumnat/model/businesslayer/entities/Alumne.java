/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnat.model.businesslayer.entities;

import java.util.ArrayList;

/**
 *
 * @author HG
 */
public class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private String dni;
    private ArrayList<String> telefon;
    private int edat;
    private Domicili domicili;
    private ArrayList<Moduls> moduls;
    
    // Atributs estàtics
    /*public static final int edatDefault=99;
    public static final String nomDefault="Anonymous";
    public static final String dniDefault="00000000A";*/
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        if(edat <= 0) {
            throw new IllegalArgumentException(String.format("Valor %d no valid.", edat));
        }
        this.edat = edat;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if(nom == null) {
            throw new NullPointerException("Has d'indicar el teu nom");
        }
        this.nom = nom;
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni) {
        if(dni == null) {
            throw new NullPointerException("Has d'indicar el teu DNI");
        }
        this.dni = dni;
    }
    
    public String getPrimerCognom() {
        return primerCognom;
    }
    public void setPrimerCognom(String primerCognom) {
        if(primerCognom == null) {
            throw new NullPointerException("Has d'indicar el teu primer cognom");
        }
        this.primerCognom = primerCognom;
    }
    
    public String getSegonCognom() {
        return segonCognom;
    }
    public void setSegonCognom(String segonCognom) {
        if(segonCognom == null) {
            throw new NullPointerException("Has d'indicar el teu segon cognom");
        }
        this.segonCognom = segonCognom;
    }
    
 
    public ArrayList<String> getTelefon() {
        return telefon;
    }


    public void setTelefon(ArrayList<String> telefon) {
        if(telefon == null) {
            throw new NullPointerException("Has d'indicar el teu telefon");
        }
        this.telefon = telefon;
    }
    
    public Domicili getDomicili() {
        return domicili;
    }
    public void setDomicili(Domicili domicili){
       if(domicili == null) {
            throw new NullPointerException("Has d'indicar el teu domicili");
        }
        this.domicili = domicili; 
    }
    
    public ArrayList<Moduls> getModuls() {
        return moduls;
    }
    
    public void setModuls(ArrayList<Moduls> moduls) {
        if (moduls == null) {
            throw new NullPointerException("No has indicat modul?");
        }
        this.moduls = moduls;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Alumne(String nom, String primerCognom, String segonCognom, String dni, int edat, ArrayList<String> telefon, ArrayList<Moduls> moduls) {  
        this.setNom(nom);
        this.setPrimerCognom(primerCognom);
        this.setSegonCognom(segonCognom);
        this.setDni(dni);
        this.setEdat(edat);
        this.setTelefon(telefon);
        this.setModuls(moduls);
    }
   /* public Alumne(String nom, String dni) {
        this(nom, dni, edatDefault);
    }
    public Alumne(String nom) {
        this(nom, dniDefault);
    }
    
    public Alumne() {
        this(nomDefault);
    }*/
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Objectes">
    public String getSalutacio() {
       return String.format("Hola, soc en/la %s amb la identificació %s i tinc %d anys.", getNom(), getDni(), getEdat());
    }
    
    //</editor-fold>
//</editor-fold>


}
