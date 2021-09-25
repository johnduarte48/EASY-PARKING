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
import to.TOVehiculos;

/**
 *
 * @author Pochito
 */
public class DAOVehiculos {
    
    private ConexionDb con;
    private final String nombreTabla = "Vehiculos";

    
    public DAOVehiculos(){
        try {
            con = new ConexionDb();
        } catch (Exception ex) {
            System.out.println("Error en DAOVehiculos.constructor: " + ex.getMessage());
        }
    }

    public int insertarVehiculo(TOVehiculos ToVehiculo) {
        String[] valores = {ToVehiculo.getPlaca(), ToVehiculo.getTipoVehiculo(), ToVehiculo.getFechaEntrada().toString(), ToVehiculo.getFechaSalida().toString(),Double.toString(ToVehiculo.getTotalPago())};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOVehiculos.insertarVehiculo: " + ex.getMessage());
            return 0;
        }

    }
    
    public boolean actualizarVehiculo(TOVehiculos ToVehiculo) {
        String[] valores = {ToVehiculo.getPlaca(), ToVehiculo.getTipoVehiculo(), ToVehiculo.getFechaEntrada().toString(), ToVehiculo.getFechaSalida().toString(),Double.toString(ToVehiculo.getTotalPago())};
        try {
            return con.actualizar(nombreTabla, valores, 0);
        } catch (Exception ex) {
            System.out.println("Error en DAOVehiculos.actualizarVehiculo: " + ex.getMessage());
            return false;
        }

    }
    
    public boolean eliminarVehiculo(int idVehiculo) {  
        try {
            return con.borrar(nombreTabla, idVehiculo);
        } catch (Exception ex) {
            System.out.println("Error en DAOVehiculos.eliminaridVehiculo: " + ex.getMessage());
            return false;
        }

    }
    
    public ArrayList<TOVehiculos> listarVehiculos() {
        ArrayList<TOVehiculos> vehiculos=new ArrayList<>();
        TOVehiculos vehiculo;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                vehiculo=new TOVehiculos();
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setTipoVehiculo(rs.getString("tipoVehiculo"));
                vehiculo.setFechaEntrada(rs.getDate("fechaEntrada"));
                vehiculo.setFechaSalida(rs.getDate("fechaSalida"));
                vehiculo.setTotalPago(rs.getDouble("totalPago"));
                vehiculos.add(vehiculo);
            }
            return vehiculos;
        } catch (Exception ex) {
            System.out.println("Error en DAOVehiculos.listarVehiculo: " + ex.getMessage());
            return null;
        }

    }
}
