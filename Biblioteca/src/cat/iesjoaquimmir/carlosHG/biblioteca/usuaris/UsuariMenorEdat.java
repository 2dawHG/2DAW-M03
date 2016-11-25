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
public class UsuariMenorEdat extends Usuari {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private UsuariAdult tutor;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public UsuariAdult getTutor() {
        return tutor;
    }

    private void setTutor(UsuariAdult tutor) {
        if(tutor == null) {
            throw new NullPointerException("Els menors necessiten tenir un tutor adult");
        }
        this.tutor = tutor;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">

    public UsuariMenorEdat(UsuariAdult tutor, String nom, String primerCognom, String segonCognom) {
        super(nom, primerCognom, segonCognom);
        this.setTutor(tutor);
    }
    
//</editor-fold>
    
    
//</editor-fold>
    
}
