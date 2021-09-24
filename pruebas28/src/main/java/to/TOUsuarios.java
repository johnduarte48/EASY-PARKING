/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package to;

import java.util.Date;

/**
 *
 * @author Pochito
 */
public class TOUsuarios {

    private int idUsuarios ;
    private String cedula ;
    private String nombre ;
    private String apellido ;
    private String tipoUsuario ;
    private String telefono ;
    private String email ;
    private String contraseña ;
    private String usuario ;
    private String estadoDelUsuario ;
    private Date fechaIngreso ;
    private Date fechaEgreso ;

    public TOUsuarios( String cedula, String nombre, String apellido, String tipoUsuario, String telefono, String email, String contraseña, String usuario, String estadoDelUsuario, Date fechaIngreso, Date fechaEgreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.estadoDelUsuario = estadoDelUsuario;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public TOUsuarios(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    
    
    public TOUsuarios() {
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstadoDelUsuario() {
        return estadoDelUsuario;
    }

    public void setEstadoDelUsuario(String estadoDelUsuario) {
        this.estadoDelUsuario = estadoDelUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
    
    
    
    
    

}
