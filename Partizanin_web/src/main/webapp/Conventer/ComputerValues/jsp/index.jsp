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
    <title>Единицы измерения объема информации</title>
</head>
<body>

<form action="/serv" method="post">


    <% if (request.getAttribute("EksabyteResult") != null) {

    %>  Ексайбайт:<input type="text" onkeypress="return isNumberKey(event)"
                         value="<%=request.getAttribute("EksabyteResult")%>" name="Eksabyte"/> <br/><%
} else {%>Ексайбайт:<input type="text" onkeypress="return isNumberKey(event)" name="Eksabyte"/> <br/>

    <% } %>


    <% if (request.getAttribute("PetabyteResult") != null) {

    %>   Пентайбайт:<input id="Petabyte" type="text" onkeypress="return isNumberKey(event)"
                           value="<%=request.getAttribute("PetabyteResult")%>" name="Petabyte"/><br/><%
} else {%>Пентайбайт:<input id="Petabyte" type="text" onkeypress="return isNumberKey(event)" name="Petabyte"/><br/>

    <% } %>

    <% if (request.getAttribute("TerabyteResult") != null) {

    %> Терабайт:<input id="Terabyte" type="text" onkeypress="return isNumberKey(event)"
                       value="<%=request.getAttribute("TerabyteResult")%>" name="Terabyte"/><br/><%
} else {%>Терабайт:<input id="Terabyte" type="text" onkeypress="return isNumberKey(event)" name="Terabyte"/><br/><% } %>


    <% if (request.getAttribute("GigabyteResult") != null) {

    %>  Гигабайт:<input id="Gigabyte" type="text" onkeypress="return isNumberKey(event)"
                        value="<%=request.getAttribute("GigabyteResult")%>" name="Gigabyte"/><br/><%
} else {%> Гигабайт:<input id="Gigabyte" type="text" onkeypress="return isNumberKey(event)" name="Gigabyte"/><br/>

    <% } %>


    <% if (request.getAttribute("MegabyteResult") != null) {

    %>  Мегабайт:<input id="Megabyte" type="text" onkeypress="return isNumberKey(event)"
                        value="<%=request.getAttribute("MegabyteResult")%>" name="Megabyte"/><br/><%
} else {%>Мегабайт:<input id="Megabyte" type="text" onkeypress="return isNumberKey(event)" name="Megabyte"/><br/>

    <% } %>


    <% if (request.getAttribute("KilobyteResult") != null) {

    %>  Килобайт:<input id="Kilobyte" type="text" onkeypress="return isNumberKey(event)"
                        value="<%=request.getAttribute("KilobyteResult")%>" name="Kilobyte"/><br/><%
} else {%>Килобайт:<input id="Kilobyte" type="text" onkeypress="return isNumberKey(event)" name="Kilobyte"/><br/>

    <% } %>


    <% if (request.getAttribute("ByteResult") != null) {

    %>     Байт:<input id="Byte" type="text" onkeypress="return isNumberKey(event)"
                       value="<%=request.getAttribute("ByteResult")%>" name="Byte"/><br/><%
} else {%>    Байт:<input id="Byte" type="text" onkeypress="return isNumberKey(event)" name="Byte"/><br/>

    <% } %>

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
