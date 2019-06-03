<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate Email</title>
</head>
<body>
<h1>Validate Email</h1>
<form method="post">
    <table>
        <tr>
            <td>Input Email:</td>
            <td><input type="text" name="email" value="${email}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Check Validate Email"></td>
        </tr>
    </table>
</form>
</body>
</html>
