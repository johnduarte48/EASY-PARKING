/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import to.TOUsuarios;
import java.util.Date;

/**
 *
 * @author Pochito ACA SE DEFINEN LAS FUNCIONALIDADES RELACIONADAS CON LA
 * ENTIDAD
 */
public class DAOUsuarios {

    private ConexionDb con;
    private final String nombreTabla = "usuarios";//MODIFIQUÉ LA PRIMERA LETRA QUE ESTABA EN MAYUSCULA
    //private final String[] columnas = {"cedula", "nombre", "apellido", "tipoUsuario", "telefono", "email", "contrasena", "usuario", "estadoDelUsuario", "fechaIngreso", "fechaEgreso"};

    public DAOUsuarios() {
        try {
            con = new ConexionDb();
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.constructor: " + ex.getMessage());
        }
    }

    public int insertarUsuario(TOUsuarios ToUsuario) {
        /*if(ToUsuario.getFechaIngreso()==null)
            ToUsuario.setFechaIngreso();*/
        
        String[] valores = {ToUsuario.getCedula(), ToUsuario.getNombre(), ToUsuario.getApellido(), ToUsuario.getTipoUsuario(), ToUsuario.getTelefono(), ToUsuario.getEmail(), ToUsuario.getContrasena(), ToUsuario.getUsuario(), ToUsuario.getEstadoDelUsuario(), ToUsuario.getFechaIngreso().toString(), ToUsuario.getFechaEgreso().toString()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.insertarUsuario: " + ex.getMessage());
            return 0;
        }

    }

    public boolean actualizarUsuario(TOUsuarios ToUsuario) {
        String[] valores = {ToUsuario.getCedula(), ToUsuario.getNombre(), ToUsuario.getApellido(), ToUsuario.getTipoUsuario(), ToUsuario.getTelefono(), ToUsuario.getEmail(), ToUsuario.getContrasena(), ToUsuario.getUsuario(), ToUsuario.getEstadoDelUsuario(), ToUsuario.getFechaIngreso().toString(), ToUsuario.getFechaEgreso().toString()};
        try {
            return con.actualizar(nombreTabla, valores, 0);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.actualizarUsuario: " + ex.getMessage());
            return false;
        }

    }

    public boolean eliminarUsuario(int idUsuario) {
        try {
            return con.borrar(nombreTabla, idUsuario);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.eliminarUsuario: " + ex.getMessage());
            return false;
        }

    }

    public ArrayList<TOUsuarios> listarUsuarios() {
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        TOUsuarios usuario;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while (rs.next()) {
                usuario = new TOUsuarios();
                usuario.setCedula(rs.getString("cedula"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setEmail(rs.getString("email"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setEstadoDelUsuario(rs.getString("estadoDelUsuario"));
                usuario.setFechaIngreso(rs.getDate("fechaIngreso"));
                usuario.setFechaEgreso(rs.getDate("fechaEgreso"));
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.listarUsuario: " + ex.getMessage());
            return null;
        }

    }

    public TOUsuarios verificarUsuario(String usuario, String clave) {
        String condicion = " usuario = '" + usuario + "' AND contrasena= '" + clave + "'";
        //alert("El susuario y/o contrasena utilizados son incorrectos, favor verificar");
        TOUsuarios usuarioTO = new TOUsuarios();
        try {
            ResultSet rs = con.consultarWhere(nombreTabla, condicion);
            while (rs.next()) {
                usuarioTO.setCedula(rs.getString("cedula"));
                usuarioTO.setNombre(rs.getString("nombre"));
                usuarioTO.setApellido(rs.getString("apellido"));
                usuarioTO.setTipoUsuario(rs.getString("tipoUsuario"));
                usuarioTO.setTelefono(rs.getString("telefono"));
                usuarioTO.setEmail(rs.getString("email"));
                usuarioTO.setContrasena(rs.getString("contrasena"));
                usuarioTO.setUsuario(rs.getString("usuario"));
                usuarioTO.setEstadoDelUsuario(rs.getString("estadoDelUsuario"));
                usuarioTO.setFechaIngreso(rs.getDate("fechaIngreso"));
                usuarioTO.setFechaEgreso(rs.getDate("fechaEgreso"));
            }
            return usuarioTO;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuarios.verificarUsuario: " + ex.getMessage());
            return null;
        }catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.verificarUsuario: " + ex.getMessage());
            return null;
        }
    }

}
