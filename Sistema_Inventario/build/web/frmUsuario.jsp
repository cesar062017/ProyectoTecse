<%-- 
    Document   : frmUsuario
    Created on : 21-ago-2017, 21:49:45
    Author     : Ricardo Cutimbo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pag     e</title>
    </head>
    <body>
        <form name="frmUsuario" method = "post" action="crearUsuario.jsp">
            <div>
                <input name="nombre" placeholder="Nombre">
                <input name="usuario" placeholder="Usuario">
                <input name="password" placeholder="Contraseña">
                <input name="direccion" placeholder="Nivel">
                <input name="nivel" placeholder="Direccion">
                <input type="submit" value="Guardar">
            </div>
        </form>
    </body>
</html>
