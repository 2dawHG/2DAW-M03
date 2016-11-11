/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnat.model.businesslayer.entities;

/**
 *
 * @author HG
 */
public class Domicili {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String carrer;
    private int numero;
    private String pis;
    private long codiPostal;
    private String poblacio;
    private String provincia;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getCarrer() {
        return carrer;
    }
    
    public void setCarrer(String carrer) {
            if(carrer == null) {
                throw new NullPointerException("Has d'indicar el carrer d'on vius");
            }
            this.carrer = carrer;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
            if(numero <= 0) {
                throw new IllegalArgumentException(String.format("Valor %d no valid.", numero));
            }
            this.numero = numero;
    }
    
    public String getPis() {
        return pis;
    }
    
    public void setPis(String pis) {
            if(pis == null) {
                throw new NullPointerException("Has d'indicar el pís d'on vius");
            }
            this.pis = pis;
    }
    
    public long getCodiPostal() {
        return codiPostal;
    }
    
    public void setCodiPostal(long codiPostal) {
        if(codiPostal <= 0) {
            throw new IllegalArgumentException(String.format("Valor %d no valid.", codiPostal));
        }
        this.codiPostal = codiPostal;
    }
    
    public String getPoblacio() {
        return poblacio;
    }
    
    public void setPoblacio(String poblacio) {
        if(poblacio == null) {
            throw new NullPointerException("Has d'indicar la teva poblacio");
        }
        this.poblacio = poblacio;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    public void setProvincia(String provincia) {
        if(provincia == null) {
            throw new NullPointerException("Has d'indicar la teva provincia");
        }
        this.provincia = provincia;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Domicili(String carrer, int numero, String pis, long codiPostal, String poblacio, String provincia){
        this.setCarrer(carrer);
        this.setNumero(numero);
        this.setPis(pis);
        this.setCodiPostal(codiPostal);
        this.setPoblacio(poblacio);
        this.setProvincia(provincia);
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public String getDomiciliAmigable() {
        return String.format("%s %d, %s, %d, %s (%s)", getCarrer(), getNumero(), getPis(), getCodiPostal(), getPoblacio(), getProvincia());
    }
//</editor-fold>
//</editor-fold>
    
}
