<%-- 
    Document   : multiplicationTableContent
    Created on : 20 mai 2019, 14:55:02
    Author     : Marine Veyssiere
--%>

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
