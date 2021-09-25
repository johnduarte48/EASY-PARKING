/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to;

import java.util.Date;

/**
 *
 * @author Pochito
 */
public class TOParqueadero {
    private int idParqueadero ;
    private double precioHoraCarro ;
    private double precioHoraMoto ;
    private double precioHoraBici ;
    private double valorMinutoCarro ;
    private double valorMinutoMoto ;
    private double valorMinutoBici ;
    private Date fechaDeActualizacion ;

    public TOParqueadero() {
    }

    public TOParqueadero(double precioHoraCarro, double precioHoraMoto, double precioHoraBici, double valorMinutoCarro, double valorMinutoMoto, double valorMinutoBici, Date fechaDeActualizacion) {
        this.precioHoraCarro = precioHoraCarro;
        this.precioHoraMoto = precioHoraMoto;
        this.precioHoraBici = precioHoraBici;
        this.valorMinutoCarro = valorMinutoCarro;
        this.valorMinutoMoto = valorMinutoMoto;
        this.valorMinutoBici = valorMinutoBici;
        this.fechaDeActualizacion = fechaDeActualizacion;
    }

    public int getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(int idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public double getPrecioHoraCarro() {
        return precioHoraCarro;
    }

    public void setPrecioHoraCarro(double precioHoraCarro) {
        this.precioHoraCarro = precioHoraCarro;
    }

    public double getPrecioHoraMoto() {
        return precioHoraMoto;
    }

    public void setPrecioHoraMoto(double precioHoraMoto) {
        this.precioHoraMoto = precioHoraMoto;
    }

    public double getPrecioHoraBici() {
        return precioHoraBici;
    }

    public void setPrecioHoraBici(double precioHoraBici) {
        this.precioHoraBici = precioHoraBici;
    }

    public double getValorMinutoCarro() {
        return valorMinutoCarro;
    }

    public void setValorMinutoCarro(double valorMinutoCarro) {
        this.valorMinutoCarro = valorMinutoCarro;
    }

    public double getValorMinutoMoto() {
        return valorMinutoMoto;
    }

    public void setValorMinutoMoto(double valorMinutoMoto) {
        this.valorMinutoMoto = valorMinutoMoto;
    }

    public double getValorMinutoBici() {
        return valorMinutoBici;
    }

    public void setValorMinutoBici(double valorMinutoBici) {
        this.valorMinutoBici = valorMinutoBici;
    }

    public Date getFechaDeActualizacion() {
        return fechaDeActualizacion;
    }

    public void setFechaDeActualizacion(Date fechaDeActualizacion) {
        this.fechaDeActualizacion = fechaDeActualizacion;
    }
    
    
    
    
}
