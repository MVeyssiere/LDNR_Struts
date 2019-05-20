<%-- 
    Document   : accueil
    Created on : 8 avr. 2019, 11:25:21
    Author     : Herbert Caffarel <herbert.caffarel@cicef.pro>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        <h1>Accueil</h1>
        <p>Bonjour</p>
        <header>
            <jsp:include page="/WEB-INF/header.jsp" />
        </header>
        <footer>
            <jsp:include page="/WEB-INF/footer.jsp" />
        </footer>
        <%--<p><s:a action="multiplicationTable">Table de multiplication </s:a></p>--%>
    </body>
</html>
