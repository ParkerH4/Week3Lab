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
            First: <input type ="number" name="first" value="${first}"><br>
             Second: <input type ="number" name="second" value="${second}"><br>
             <input type="submit" value="+">
             <input type="submit" value="-">
             <input type="submit" value="*">
             <input type="submit" value="%"><br>
               
             Result: f
             <a href=""></a>
             </form>
    </body>
</html>
