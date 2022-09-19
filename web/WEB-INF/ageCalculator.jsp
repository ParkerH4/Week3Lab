<%-- 
    Document   : ageCalculator.jsp
    Created on : 18-Sep-2022, 10:12:52 PM
    Author     : parke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action = "age" method = "post">
            Enter your age: <input type ="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            
            Your age next birthday will be (${age} + 1 ) 
        </form>
            
            
    </body>
</html>
