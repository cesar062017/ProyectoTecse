<%-- 
    Document   : frmUsuario
    Created on : 23-ago-2017, 21:39:28
    Author     : Ricardo Cutimbo
--%>

<html>
    <head>
        <link rel="StyleSheet" type="Text/css" href="CSS/r_columnas.css">
        
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div id="fondo">
            <div id="hoja1">
                <h1>Este es el index</h1>
                <table border="1" id="tabla">
                    <tr>
                        <th>Soy titulo</th>
                        <th>Soy titulo</th>
                    </tr>
                    <%for(int i=0;i<10;i++){%>
                    <tr>
                        <td>Soy elemento<%=i%></td>
                        <td>Soy elemento<%=i%></td>
                        <td>Soy elemento<%=i%></td>
                        <td><input id="identificador_<%=i%>" type="button" value="Modificar" onclick="javascript:CargaModificar('frmUsuarioModificar.html','hoja2',this.id)"></td>
                        <td><input type="button" value="Eliminar"></td>
                    </tr>
                    <%}%>
                </table>
            </div>
            <div id="hoja2">
                <h1>Seleccione usuario...</h1>
            </div>
        </div>
    </body>
</html>