<%--
  Created by IntelliJ IDEA.
  User: Partizanin
  Date: 16.08.2014
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="Conventer/css/conventer.css">
    <title>Конвентер Валют</title>
</head>
<body>

<form action="Cash" method="post">

    <% if (request.getAttribute("UAHResult") != null) {

    %>  UAH Buy:<input type="text" onkeypress="return isNumberKey(event)" value="<%=request.getAttribute("UAHResult")%>"
                       name="UAH"/> <br/><%
} else {%>UAH:<input type="text" onkeypress="return isNumberKey(event)" name="UAH"/> <br/>

    <% } %>
    <% if (request.getAttribute("USDResult") != null) {

    %>  USD:<input type="text" readonly onkeypress="return isNumberKey(event)"
                   value="<%=request.getAttribute("USDResult")%>" name="USD"/> <br/><%
} else {%>USD:<input type="text" readonly onkeypress="return isNumberKey(event)" name="USD"/> <br/>

    <% } %>


    <% if (request.getAttribute("EURResult") != null) {

    %>   EUR:<input type="text" readonly onkeypress="return isNumberKey(event)"
                    value="<%=request.getAttribute("EURResult")%>" name="EUR"/><br/><%
} else {%>EUR:<input type="text" readonly onkeypress="return isNumberKey(event)" name="EUR"/><br/>

    <% } %>

    <% if (request.getAttribute("RUBResult") != null) {

    %>RUB:<input type="text" readonly onkeypress="return isNumberKey(event)"
                 value="<%=request.getAttribute("RUBResult")%>" name="RUB"/><br/><%
} else {%>RUB:<input type="text" readonly onkeypress="return isNumberKey(event)" name="RUB"/><br/><% } %>


    <input type="submit" name="Count" value="Посчитать"/>

    <script>
        function isNumberKey(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode
            if (charCode > 31 && (charCode != 46 && charCode != 44 && (charCode < 48 || charCode > 57)))
                return false;
            return true;
        }
    </script>

</form>
</body>
</html>
