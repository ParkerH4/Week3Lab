<%-- 
    Document   : arithmeticCalculator.jsp
    Created on : 18-Sep-2022, 10:13:14 PM
    Author     : parke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action = "arithmetic" method = "post">
            First: <input type ="text" name="first" value="${first}"><br>
            Second: <input type ="text" name="second" value="${second}"><br>
            <input type="submit"name ="op" value="+" >
            <input type="submit"name ="op" value="-">
            <input type="submit"name ="op" value="*">
            <input type="submit"name ="op" value="%"><br>

            <p>Result: ${answer} </p>
            <a href="age">Age Calculator</a>
        </form>

    </body>
</html>
