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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="/ressources/headerAndfooter.css">
        <title>Accueil</title>
    </head>
    <body>
        <h1 class="text-center">Accueil</h1>
        <header>
            <jsp:include page="/WEB-INF/header.jsp" />
        </header>
        <footer class="footer">
                    <jsp:include page="/WEB-INF/footer.jsp" />
        </footer>
        <%--<p><s:a action="multiplicationTable">Table de multiplication </s:a></p>--%>
    </body>
</html>
