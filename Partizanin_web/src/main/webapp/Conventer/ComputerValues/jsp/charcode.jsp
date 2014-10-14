<%--
  Created by IntelliJ IDEA.
  User: Partizanin
  Date: 26.08.2014
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaScript method</title>
</head>
<body>
Only numbers please:
<input type="text" name="someid" onkeypress="return isNumberKey(event)"/>

<script>
    function isNumberKey(evt) {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 && (charCode != 46 && (charCode < 48 || charCode > 57)))
            return false;
        return true;

    }
</script>

</body>
</html>
