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
                List<Album> albuns = (List<Album>) request.getAttribute("albuns");            
                for(int i = 0; i < albuns.size(); i++){                
            %>
            <li><a href="figurinha.html?linha=<%=i%>"><%=albuns.get(i).getNome()%></li>
            <%}%>
        </ul>
    </body>
</html>
