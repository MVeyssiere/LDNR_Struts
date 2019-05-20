<%-- 
    Document   : about
    Created on : 8 avr. 2019, 11:27:31
    Author     : Herbert Caffarel <herbert.caffarel@cicef.pro>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A propos</title>
    </head>
    <body>
        <header>
            <jsp:include page="/WEB-INF/header.jsp" />
        </header>
        <h1>Objectif</h1>
        <p>Prendre le framework Struts en main</p>
        <h1>Equipe de développement</h1>
        <ul><li>Marine Veyssiere</li></ul>        
        <a href="<s:url value='index' />">Accueil </a>
        <p>Nous sommes le <s:property value="today"/></p>
        <p>Cette page a été affichée <s:property value="visits"/> fois</p>
    </body>
</html>
