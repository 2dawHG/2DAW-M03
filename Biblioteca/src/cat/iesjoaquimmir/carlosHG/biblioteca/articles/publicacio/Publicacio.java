/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.carlosHG.biblioteca.articles.AbstractArticle;
import cat.iesjoaquimmir.carlosHG.biblioteca.articles.Categoria;

/**
 *
 * @author HG
 */
public abstract class Publicacio extends AbstractArticle {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private int pagines;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getPagines() {
        return pagines;
    }

    private void setPagines(int pagines) {
        if(pagines <= 0) {
            throw new IllegalArgumentException("Número de pagines no valid, insereix un número acceptable");
        }
        this.pagines = pagines;
    } 
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Publicacio(int pagines, String titol, String autor, Categoria categoria, int opcio) {
        super(titol, autor, categoria, opcio);
        this.setPagines(pagines);
    }
//</editor-fold>
 
    
//</editor-fold>
    
    
}
