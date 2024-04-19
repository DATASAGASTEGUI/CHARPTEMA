<%@page import="misrc.Principal"%>
<%@page import="java.util.List"%>
<%@page import="misrc.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                margin: 0 auto;
            } 
            
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <th>NOMBRE</th>
                <%
                    List<Persona> personas_al = Principal.obtenerListaPersonasFromMongodb();
                    for (Persona p : personas_al) {
                %>

            <tr> 
                <td> <%= p.getNombre()%> </td> 
            </tr>
                                
                <%        
                    }
                %>
        </table>

    </body>
</html>
