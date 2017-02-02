/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.persistence.exception;

/**
 *
 * @author daw2017
 */
public class PersistenceException extends Exception {
    private Integer codiError;
    public PersistenceException (int codi) {
        codiError = codi;
    }
    public String toString() {
        String missatge="";
        StringBuilder sb = new StringBuilder();
        sb.append("Excepció provocada en accedir a la base de dades geoapp. ");
        sb.append("Codi Error");
        sb.append(codiError.toString());
        missatge=sb.toString();
        return missatge;
    }
}
