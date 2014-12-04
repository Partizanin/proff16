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
    <script src="//cdn.jsdelivr.net/jquery/2.1.1/jquery.min.js"></script>
    <script src="<c:url value="//cdn.jsdelivr.net/jquery/2.1.1/jquery.min.js"/>"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value="/js/jquery-1.2.6.min.js"/>"></script>
    <script language="JavaScript" type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>


</head>
<body>
<h3>Please enter a number to Square : </h3>
<input style="width: 33px; margin-left: 2px; " type="text" id="number1" name="number1">
<input style="width: 33px; margin-left: 2px;" type="text" id="number2" name="number2">
<input type="button" onclick="callServlet();" id="calcBtn" value="Calc">
<input style="font-family: cursive; border:none" type="text" id="result"/>
<input style="font-family: cursive; border:none; width: 100%" type="text" value="" id="resultText"/>

</body>
<script>
    function callServlet() {
        var input1 = document.getElementById('number1').value;
        var input2 = document.getElementById('number2').value;
        var myData = {"mydata": {"number1": $("#number1").val(), "number2": $("#number2").val()}};
        $.ajax({
            type: "GET",
            url: "/AjaxServletCalculator",
            data: {jsonData: JSON.stringify(myData)},
            dataType: "json",

            //if received a response from the server
            success: function (data) {
                //our country code was correct so we have some information to display

                //  var json = JSON.parse(data);

                document.getElementById('result').value = data.results;
                document.getElementById('resultText').value = data.resultText;


            }
        });
    }
</script>
</html>
