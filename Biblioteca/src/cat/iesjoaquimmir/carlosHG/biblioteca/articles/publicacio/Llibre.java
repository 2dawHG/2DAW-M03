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
public class Llibre extends Publicacio {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String isbn;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.isbn = isbn;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Llibre(String isbn, int pagines, String titol, String autor, Categoria categoria, int opcio) {
        super(pagines,titol,autor,categoria,opcio);
        this.setIsbn(isbn);
    }
//</editor-fold>
    
    
//</editor-fold>

    
    
    
}
