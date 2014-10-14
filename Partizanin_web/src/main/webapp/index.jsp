<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false" %>
<html>
<head>
    <script src="JavaScripts/search.js"></script>
</head>

<body>
<form action="<c:url value="/Search"/>" method="post">
    <section class="container">

        <h2>Light Javascript Table Filter</h2>

        <h2 style="color: #028af9">INDEX.JSP</h2>

        <input type="search" class="light-table-filter" data-table="order-table" placeholder="Filter">

        <table class="order-table table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>John Doe</td>
                <td>john.doe@gmail.com</td>
                <td>0123456789</td>
                <td>99</td>
            </tr>
            <tr>
                <td>Jane Vanda</td>
                <td>jane@vanda.org</td>
                <td>9876543210</td>
                <td>349</td>
            </tr>
            <tr>
                <td>Alferd Penyworth</td>
                <td>alfred@batman.com</td>
                <td>6754328901</td>
                <td>199</td>
            </tr>
            </tbody>
        </table>

    </section>
</form>
</body>
</html>