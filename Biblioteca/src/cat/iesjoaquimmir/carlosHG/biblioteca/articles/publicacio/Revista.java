/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.carlosHG.biblioteca.articles.Categoria;

/**
 *
 * @author HG
 */
public class Revista extends Publicacio {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String issn;
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        if(issn == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.issn = issn;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Revista(String issn, int pagines, String titol, String autor, Categoria categoria, int opcio) {
        super(pagines,titol,autor,categoria,opcio);
        this.setIssn(issn);
    }
    
//</editor-fold>
    
//</editor-fold>
    
    
}
