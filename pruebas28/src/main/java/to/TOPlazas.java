/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to;

/**
 *
 * @author Pochito
 */
public class TOPlazas {
    private int idPlazas ;
    private String tipoPlaza ;
    private String estadoDePlaza ;

    public TOPlazas(int idPlazas, String tipoPlaza, String estadoDePlaza) {
        this.idPlazas = idPlazas;
        this.tipoPlaza = tipoPlaza;
        this.estadoDePlaza = estadoDePlaza;
    }

    public TOPlazas(String tipoPlaza, String estadoDePlaza) {
        this.tipoPlaza = tipoPlaza;
        this.estadoDePlaza = estadoDePlaza;
    }

    public TOPlazas() {
    }

    public int getIdPlazas() {
        return idPlazas;
    }

    public void setIdPlazas(int idPlazas) {
        this.idPlazas = idPlazas;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public String getEstadoDePlaza() {
        return estadoDePlaza;
    }

    public void setEstadoDePlaza(String estadoDePlaza) {
        this.estadoDePlaza = estadoDePlaza;
    }
    
       
    
    
}
