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

    $(document).ready(function () {
        callServeToChangeExchange("uah", "sell");
    });

    function changeExchange(exchange) {

        changeShowLable(exchange);
        callServeToChangeExchange(exchange, $('#operation').val());

    }

    function changeShowLable(exchange) {

        if (exchange == "usd") {

            document.getElementById("value1").value = "UAH";
            document.getElementById("value2").value = "RUB";
            document.getElementById("value3").value = "EUR";

        } else if (exchange == "eur") {

            document.getElementById("value1").value = "UAH";
            document.getElementById("value2").value = "RUB";
            document.getElementById("value3").value = "USD";

        } else if (exchange == "rub") {

            document.getElementById("value1").value = "UAH";
            document.getElementById("value2").value = "USD";
            document.getElementById("value3").value = "EUR";

        } else {
            /*uah*/
            document.getElementById("value1").value = "USD";
            document.getElementById("value2").value = "RUB";
            document.getElementById("value3").value = "EUR";
        }
    }

    function changeOperation(changeValue) {

        changeExchange($('#selectUnit').val(), changeValue);

    }

    function callServeToChangeExchange(exchange, operation) {

        var myData = {"operationCall": operation, "exchange": exchange};

        $.ajax({
            type: "GET",
            url: "/ConventerServlet",
            data: {jsonData: JSON.stringify(myData)},
            dataType: "json",

            //if received a response from the server
            success: function (data) {
                document.getElementById('exchange1').value = data.exchange1;
                document.getElementById('exchange2').value = data.exchange2;
                document.getElementById('exchange3').value = data.exchange3;
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
    Я хочу <select id="operation" onchange="changeOperation(this.value)">
    <option value="buy">Купить</option>
    <option selected="" value="sell">Продать</option>
</select>


    <label for="inputValue"></label><input type="text" value="0.00" onkeypress="return isNumberKey(event)"
                                           onkeyup="count(this.value)"
                                           onfocus="if (this.value == '0.00') this.value='';"
                                           onblur="if (this.value == '') {this.value = '0.00'; }" id="inputValue"
                                           style="width: 100px;margin-bottom: 30px">
    <select id="selectExchange" onchange="changeExchange(this.value)">
        <option value="usd">USD</option>
        <option value="eur">EUR</option>
        <option value="rub">RUB</option>
        <option selected="" value="uah">UAH</option>
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
