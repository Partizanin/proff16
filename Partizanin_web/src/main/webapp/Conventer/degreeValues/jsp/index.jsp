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
    <title>Единицы измерения температуры</title>
</head>
<body>

<form action="/degrees" method="post">


    <% if (request.getAttribute("СelsiyResult") != null) {

    %>  Градусов цельсия:<input type="text" onkeypress="return isNumberKey(event)"
                                value="<%=request.getAttribute("СelsiyResult")%>" name="Celsiy"/> <br/><%
} else {%>Градус цельсия:<input type="text" onkeypress="return isNumberKey(event)" name="Celsiy"/> <br/>

    <% } %>


    <% if (request.getAttribute("CelvinResult") != null) {

    %>   Градус кельвина:<input type="text" onkeypress="return isNumberKey(event)"
                                value="<%=request.getAttribute("CelvinResult")%>" name="Celvin"/><br/><%
} else {%>Градус кельвина:<input type="text" onkeypress="return isNumberKey(event)" name="Celvin"/><br/>

    <% } %>

    <% if (request.getAttribute("ReomurResult") != null) {

    %> Градус реомюра:<input type="text" onkeypress="return isNumberKey(event)"
                             value="<%=request.getAttribute("ReomurResult")%>" name="Reomur"/><br/><%
} else {%>Градус реомюра:<input type="text" onkeypress="return isNumberKey(event)" name="Reomur"/><br/><% } %>


    <% if (request.getAttribute("FarengeitResult") != null) {

    %>  Градус фаренгейта:<input type="text" onkeypress="return isNumberKey(event)"
                                 value="<%=request.getAttribute("FarengeitResult")%>" name="Farengeit"/><br/><%
} else {%> Градус фаренгейта:<input type="text" onkeypress="return isNumberKey(event)" name="Farengeit"/><br/>

    <% } %>


    <% if (request.getAttribute("RankinResult") != null) {

    %>  Градус ранкина:<input type="text" onkeypress="return isNumberKey(event)"
                              value="<%=request.getAttribute("RankinResult")%>" name="Rankin"/><br/><%
} else {%>Градус ранкина:<input type="text" onkeypress="return isNumberKey(event)" name="Rankin"/><br/>

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
