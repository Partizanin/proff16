<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false" %>
<html>
<head>
    <title>Вход</title>
    <link rel="stylesheet" href="/hw11/css/Login.css" type="text/css"/>
    <link rel="shortcut icon" href="/images/favicon.ico" type="image/ico">
</head>

<body>
<form class="form-container" action="/Enter" method="post">

    <h2 class="form-title" style="font-size: 30px">Login Successful</h2>
    <input type="submit" value="Ok">
    <input type="text" name="MyValu">

    <script>
        var val = document.createElement("INPUT");
        val.setAttribute("MyValue", "Partizanin Javascript")
    </script>
</form>
</body>
</html>
