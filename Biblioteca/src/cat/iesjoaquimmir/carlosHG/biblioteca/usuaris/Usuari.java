/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.usuaris;

/**
 *
 * @author HG
 */
public abstract class Usuari {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String nom;
    private String primerCognom;
    private String segonCognom;

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        if(nom == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.nom = nom;
    }

    public String getPrimerCognom() {
        return primerCognom;
    }

    private void setPrimerCognom(String primerCognom) {
        if(primerCognom == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.primerCognom = primerCognom;
    }

    public String getSegonCognom() {
        return segonCognom;
    }

    private void setSegonCognom(String segonCognom) {
        if(segonCognom == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.segonCognom = segonCognom;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Usuari(String nom, String primerCognom, String segonCognom) {
        this.setNom(nom);
        this.setPrimerCognom(primerCognom);
        this.setSegonCognom(segonCognom);
    }
//</editor-fold>
    
//</editor-fold>

    
}
