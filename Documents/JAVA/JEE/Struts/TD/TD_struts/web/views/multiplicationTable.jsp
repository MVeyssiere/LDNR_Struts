<%-- 
    Document   : multiplicationTable
    Created on : 20 mai 2019, 11:39:27
    Author     : Marine Veyssiere
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table de multiplication par <s:property value="factor"/></title>
    </head>
    <body>
        <header>
            <jsp:include page="/WEB-INF/header.jsp" />
        </header>
        <table>
            <s:iterator begin="1" end="10" var="i" step="1" status="status">
                <tr>
                    <td><s:property value="factor"/></td>
                    <td>*</td>
                    <td><s:property value="%{#status.count}"/></td> <%-- pour savoir à quelle valeur d'incrémentation on en est --%>
                    <td>=</td>
                    <td><s:property value="%{top*factor}"/></td>
                </tr>
            </s:iterator>
        </table>
    <s:a action="index"> Retour à l'accueil </s:a>
    </body>
</html>
