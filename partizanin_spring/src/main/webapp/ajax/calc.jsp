<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Partizanin
  Date: 16.09.2014
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>heavyTable.js : jQuery plugin</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <script src="JavaScripts/jquery-1.9.1.min.js" type="text/javascript"></script>

</head>
<body>
<h3>Please enter a number to Square : </h3>
<input style="width: 33px; margin-left: 2px; " type="text" id="number1">
<input style="width: 33px; margin-left: 2px; " type="text" id="number2">
<input type="button" onclick="callServlet();" value="Click To Square">
<input style="font-family: cursive; border:none" type="text" id="result"/>

</body>
<script>
    function callServlet() {
        var xmlhttp;
        var input1 = document.getElementById('number1').value;
        var input2 = document.getElementById('number2').value;
        if (window.XMLHttpRequest) {
            // This part is mainly for the latest browsers which have XMLHttpRequest object
            // like Chrome,Firefox,Safari and IE7+
            xmlhttp = new XMLHttpRequest();
        }
        else {
            // This should take care of the older browsers
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = function () {
            /*
             readyState has four different states :
             0: request not initialized
             1: server connection established
             2: request received
             3: processing request
             4: request finished and response is ready
             status is ranging between 200 - Ok and 404 - Page Not Found
             */
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("result").value = (xmlhttp.responseText);
            }
        };
        xmlhttp.open("GET", "ServletTest?val1=" + input1
                + "&val2=" + input2

                , true);
        xmlhttp.send();
    }
</script>
</html>
