<%-- 
    Document   : template
    Created on : 20 mai 2019, 14:21:33
    Author     : Marine Veyssiere
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>${param.title}</title>
    </head>
    <body>
         <header>
            <jsp:include page="/WEB-INF/header.jsp" />
        </header>
        <section id="content">
            <jsp:include page="/WEB-INF/views/${param.content}.jsp" />
        </section>
        <footer>
            <jsp:include page="/WEB-INF/footer.jsp" />
        </footer>
    </body>
</html>
