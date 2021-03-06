/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.articles.multimedia;
import cat.iesjoaquimmir.carlosHG.biblioteca.articles.AbstractArticle;
import cat.iesjoaquimmir.carlosHG.biblioteca.articles.Categoria;

/**
 *
 * @author HG
 */
public abstract class Multimedia extends AbstractArticle {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private int durada;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getDurada() {
        return durada;
    }

    private void setDurada(int durada) {
        if(durada <= 0) {
            throw new IllegalArgumentException("Valor de durada no valida, introdueix una acceptable");
        }
        this.durada = durada;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constuctors">
    public Multimedia(int durada, String titol, String autor, Categoria categoria, int opcio) {
        super(titol, autor, categoria, opcio);
        this.setDurada(durada);
    }
//</editor-fold>
    
    
//</editor-fold>

    
    
    
}
