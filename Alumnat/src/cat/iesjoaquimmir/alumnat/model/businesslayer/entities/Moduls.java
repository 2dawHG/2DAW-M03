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
public class Moduls {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String nom;
    private String desc;
    private int hores;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        if (nom == null) {
            throw new NullPointerException("Has d'indicar el nom del teu módul");
        }
        this.nom = nom;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if (desc == null) {
            throw new NullPointerException("Has d'indicar una breu descripció del módul");
        }
        this.desc = desc;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        if (hores <= 0) {
            throw new IllegalArgumentException("El valor %d no es valid");
        }
        this.hores = hores;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Moduls(String nom, String desc, int hores) {
        this.setNom(nom);
        this.setDesc(desc);
        this.setHores(hores);
    }
    
//</editor-fold>
    
//</editor-fold>

    
}
