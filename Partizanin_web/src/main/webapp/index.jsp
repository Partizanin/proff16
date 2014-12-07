<%--
  Created by IntelliJ IDEA.
  User: Partizanin
  Date: 05.12.2014
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="//cdn.jsdelivr.net/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>

<script>

    function fn_cross(c) {

        switch (c) {


        }
    }

    $(document).ready(function () {
        buyCours();
    });

    function changeCourse(buttonValue) {

        if (buttonValue == ("buyUAH")) {
            buyCours();
        } else {
            sellCours();
        }

    }

    function buyCours() {
        var myData = {"operation": "changeCourse", "exchangeCall": "buy"};
        $.ajax({
            type: "GET",
            url: "/ConventerServlet",
            data: {jsonData: JSON.stringify(myData)},
            dataType: "json",

            //if received a response from the server
            success: function (data) {
                document.getElementById('exchange1').value = data.exchangeUSD;
                document.getElementById('exchange2').value = data.exchangeRUB;
                document.getElementById('exchange3').value = data.exchangeEUR;
                count($("#inputValue").val());
            }
        });

    }

    function sellCours() {
        var myData = {"operation": "changeCourse", "exchangeCall": "sell"};
        $.ajax({
            type: "GET",
            url: "/ConventerServlet",
            data: {jsonData: JSON.stringify(myData)},
            dataType: "json",

            //if received a response from the server
            success: function (data) {

                document.getElementById('exchange1').value = data.exchangeUSD;
                document.getElementById('exchange2').value = data.exchangeRUB;
                document.getElementById('exchange3').value = data.exchangeEUR;
                count($("#inputValue").val());
            }
        });

    }

    function isNumberKey(evt) {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 && (charCode != 46 && charCode != 44 && (charCode < 48 || charCode > 57)))
            return false;
        return true;
    }

    function count(inputValue) {

        if (inputValue != "") {

            document.getElementById("conventUSD").value = ($("#exchange1").val() * inputValue);
            document.getElementById("conventEUR").value = ($("#exchange3").val() * inputValue);
            document.getElementById("conventRUB").value = ($("#exchange2").val() * inputValue);

        } else {
            var defaultValue = "0.00";
            document.getElementById("conventUSD").value = defaultValue;
            document.getElementById("conventEUR").value = defaultValue;
            document.getElementById("conventRUB").value = defaultValue;

        }

    }

</script>
<div class="USD">
    <h2 style="text-align: center">UAH</h2>
    Я хочу <input type="button" id="buyUAH" onclick="changeCourse(this.id)" value="Купить">

    <input type="button" id="sellUAH" onclick="changeCourse(this.id)" value="Подать">


    <label for="inputValue"></label><input type="text" value="0.00" onkeypress="return isNumberKey(event)"
                                           onkeyup="count(this.value)"
                                           onfocus="if (this.value == '0.00') this.value='';"
                                           onblur="if (this.value == '') {this.value = '0.00'; }" id="inputValue"
                                           style="width: 100px;margin-bottom: 30px">
    <select id="fn_c1" onchange="fn_cross(this.value)">
        <option value="840">USD</option>
        <option value="978">EUR</option>
        <option value="643">RUB</option>
        <option selected="" value="1">UAH</option>
    </select>
    <br/>
    Результат
    <ul style="margin-left: 35px;margin-top: -15px;list-style-type: none">
        <li><input type="text" readonly value="0.00" style="width:175px;height:25px;font-size:20px;margin-top: 5px;"
                   onblur="if (this.value == '') {this.value = '0.00'; }" id="conventUSD">
            <input type="text" id="value1" size="1" value="USD" style="color: #9c9c9c;border:none;font-family:Arial; ">
            <input style="width: 50px" readonly id="exchange1"></li>
        <li><input type="text" readonly value="0.00" style="width:175px;height:25px;font-size:20px;margin-top: 5px;"
                   onblur="if (this.value == '') {this.value = '0.00'; }" id="conventRUB">
            <input type="text" id="value2" size="1" value="RUB" style="color: #9c9c9c;border:none;font-family:Arial; ">
            <input style="width: 50px" readonly id="exchange2"></li>
        <li><input type="text" readonly value="0.00" style="width:175px;height:25px;font-size:20px;margin-top: 5px;"
                   onblur="if (this.value == '') {this.value = '0.00'; }" id="conventEUR">
            <input type="text" id="value3" size="1" value="EUR" style="color: #9c9c9c;border:none;font-family:Arial; ">
            <input style="width: 50px" readonly id="exchange3"></li>
    </ul>
</div>
</body>
</html>
