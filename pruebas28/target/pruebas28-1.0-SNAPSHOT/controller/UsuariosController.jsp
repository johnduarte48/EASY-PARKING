<%-- 
    Document   : UsuariosController
    Created on : 23/09/2021, 09:24:55 a. m.
    Author     : Pochito
--%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="to.TOUsuarios"%>
<%@page import="Controller.ControllerUsuarios"%>
<%-- ACA SE PONE EL CODIGO LLAMANDO AL CONTROLADOR --%>
<% ControllerUsuarios controladorUsuarios = new ControllerUsuarios();
//Ahora se definen los parametros con los que se hace la busqueda en el campo de URL de la página
    String opcion = request.getParameter("opcion");
//opciones como insertar, eliminar, consultar,listar, etc
    if ("listar".equals(opcion)) {
        ArrayList<TOUsuarios> usuarios = controladorUsuarios.listarUsuarios();
        out.print(new Gson().toJson(usuarios));
    } else if ("insertar".equals(opcion)) {
        
    } else if ("actualizar".equals(opcion)) {
        
    } else if ("eliminar".equals(opcion)) {
        
    } else {
        out.print("Esta opción no está disponible");
    }
%>
