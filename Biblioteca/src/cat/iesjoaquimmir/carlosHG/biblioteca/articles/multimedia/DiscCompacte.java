/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.carlosHG.biblioteca.articles.Categoria;

/**
 *
 * @author HG
 */
public class DiscCompacte extends Multimedia {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String ismn;
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String Ismn) {
        if(ismn == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.ismn = Ismn;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Costructors">
    public DiscCompacte(String ismn, int durada, String titol, String autor, Categoria categoria, int opcio) {
        super(durada,titol,autor,categoria,opcio);
        this.setIsmn(ismn);
    }
//</editor-fold>
    
    
//</editor-fold>

    
}
