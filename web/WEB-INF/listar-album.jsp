<%@page import="lst02.Album"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Albuns</title>
    </head>
    <body>
        <h1>Lista de Albuns</h1>
        <ul>
            <% 
                Album a = (Album) request.getAttribute("albuns");
            %>
            <li>
                
                <a href="cromo.html?linha=<%=a.getNome()%>"> <%=a.getNome()%>
            
            </li>
        </ul>
    </body>
</html>
