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
public class DiscVersatilDigital extends Multimedia {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">

    private String isan;
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getIsan() {
        return isan;
    }
    
    public void setIsan(String isan) {
        if(isan == null) {
            throw new NullPointerException("Aquest camp no pot estar buit");
        }
        this.isan = isan;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public DiscVersatilDigital(String isan, int durada, String titol, String autor, Categoria categoria, int opcio) {
        super(durada,titol,autor,categoria,opcio);
        this.setIsan(isan);
    }
    
//</editor-fold>
    
//</editor-fold>
    
}
