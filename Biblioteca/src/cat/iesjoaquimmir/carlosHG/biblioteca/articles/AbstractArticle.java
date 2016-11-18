/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.carlosHG.biblioteca.articles;

/**
 *
 * @author HG
 */
public abstract class AbstractArticle {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String titol;
    private String autor;
    private enum Categoria{INFANTIL, JUVENIL, ADULT};
    private Categoria categoria;
    private int opcio;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getTitol() {
        return titol;
    }

    private void setTitol(String titol) {
        if(titol == null) {
            throw new IllegalArgumentException("Aquest camp no pot estar vuit");
        }
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        if(autor == null) {
            throw new NullPointerException("Aquest camp no pot estar vuit");
        }
        this.autor = autor;
    } 

    public int getOpcio() {
        return opcio;
    }

    public void setOpcio(int opcio) {
        if (opcio < 1 || opcio > 3) {
            throw new IllegalArgumentException("Valor de opcio %d no valida");
        }
        this.opcio = opcio;

        switch(opcio) {
            case 1:
                categoria = Categoria.INFANTIL;
                break;
            case 2:
                categoria = Categoria.JUVENIL;
                break;
            case 3: 
                categoria = Categoria.ADULT;
                break;
        }

    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;

    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public AbstractArticle(String titol, String autor, int opcio, Categoria categoria) {
        this.setTitol(titol);
        this.setAutor(autor);
        this.setOpcio(opcio);
        this.setCategoria(categoria);
    }
//</editor-fold>
    
//</editor-fold>
    
}
