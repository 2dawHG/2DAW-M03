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
public class UsuariAdult extends Usuari {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String dni;    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodes">
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getDni() {
        return dni;
    }
    
    private void setDni(String dni) {
        if(dni == null) {
            throw new NullPointerException("Els adults requereixen la identificacio del DNI");
        }
        this.dni = dni;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructors">

    public UsuariAdult(String dni, String nom, String primerCognom, String segonCognom) {
        super(nom, primerCognom, segonCognom);
        this.setDni(dni);
    }
    
//</editor-fold>
    
//</editor-fold>
    
}
