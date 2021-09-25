/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import to.TOParqueadero;

/**
 *
 * @author Pochito
 */
public class DAOParqueadero {
    private ConexionDb con;
    private final String nombreTabla = "Parqueadero";
    
    public DAOParqueadero(){
        try {
            con = new ConexionDb();
        } catch (Exception ex) {
            System.out.println("Error en DAOParqueadero.constructor: " + ex.getMessage());
        }
    }

    public int insertarParqueadero(TOParqueadero ToParqueadero) {
        String[] valores = {String.valueOf(ToParqueadero.getIdParqueadero()), Double.toString(ToParqueadero.getPrecioHoraCarro()), Double.toString(ToParqueadero.getPrecioHoraMoto()), Double.toString(ToParqueadero.getValorMinutoCarro()), Double.toString(ToParqueadero.getPrecioHoraBici()), Double.toString(ToParqueadero.getValorMinutoMoto()), Double.toString(ToParqueadero.getValorMinutoBici()), ToParqueadero.getFechaDeActualizacion().toString()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOParqueadero.insertarParqueadero: " + ex.getMessage());
            return 0;
        }

    }
    
    public boolean actualizarParqueadero(TOParqueadero ToParqueadero) {
        String[] valores = {String.valueOf(ToParqueadero.getIdParqueadero()), Double.toString(ToParqueadero.getPrecioHoraCarro()), Double.toString(ToParqueadero.getPrecioHoraMoto()), Double.toString(ToParqueadero.getValorMinutoCarro()), Double.toString(ToParqueadero.getPrecioHoraBici()), Double.toString(ToParqueadero.getValorMinutoMoto()), Double.toString(ToParqueadero.getValorMinutoBici()), ToParqueadero.getFechaDeActualizacion().toString()};
        try {
            return con.actualizar(nombreTabla, valores, 0);
        } catch (Exception ex) {
            System.out.println("Error en DAOParqueadero.actualizarParqueadero: " + ex.getMessage());
            return false;
        }

    }
    
    public boolean eliminarParqueadero(int idParqueadero) {  
        try {
            return con.borrar(nombreTabla, idParqueadero);
        } catch (Exception ex) {
            System.out.println("Error en DAOParqueadero.eliminaridParqueadero: " + ex.getMessage());
            return false;
        }

    }
    
    public ArrayList<TOParqueadero> listarParqueadero() {
        ArrayList<TOParqueadero> parqueaderos=new ArrayList<>();
        TOParqueadero parqueadero;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                parqueadero=new TOParqueadero();
                parqueadero.setIdParqueadero(rs.getInt("idParqueadero"));
                parqueadero.setPrecioHoraCarro(rs.getDouble("precioHoraCarro"));
                parqueadero.setPrecioHoraMoto(rs.getDouble("precioHoraMoto"));
                parqueadero.setValorMinutoCarro(rs.getDouble("valorMinutoCarro"));
                parqueadero.setPrecioHoraBici(rs.getDouble("precioHoraBici"));
                parqueadero.setValorMinutoMoto(rs.getDouble("valorMinutoMoto"));
                parqueadero.setValorMinutoBici(rs.getDouble("valorMinutoBici"));
                parqueadero.setFechaDeActualizacion(rs.getDate("fechaDeActualizacion"));
                parqueaderos.add(parqueadero);
            }
            return parqueaderos;
        } catch (Exception ex) {
            System.out.println("Error en DAOParqueadero.listarParqueadero: " + ex.getMessage());
            return null;
        }

    }
    
}
