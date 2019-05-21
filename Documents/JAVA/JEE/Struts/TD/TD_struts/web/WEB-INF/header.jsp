<%@taglib prefix="s" uri="/struts-tags" %>
<nav>
    <ul class="list-group">
        <li class="list-group-item"><a href="<s:url action='index' />">Accueil</a></li>
        <li class="list-group-item"><a href="<s:url action='about' />">&Agrave; propos</a></li>
        <li class="list-group-item"><a href="<s:url action='multiplicationTable' />">Table de multiplication</a></li>
        <li><s:a action="test"> tests </s:a></li>
    </ul>
</nav>
