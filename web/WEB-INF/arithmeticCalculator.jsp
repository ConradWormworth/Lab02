<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 18, 2018, 12:07:19 PM
    Author     : 612944
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Super Cool Math Calculator</title>
    </head>
    <body>
        <h1>Punch in numbers to calculate</h1>
        <form method="post" action="arithmetic">
            First Number: <input type="text" name="firstNumber" value="${firstNumber}"><br>
            Second Number: <input tpye="text" name="secondNumber" value="${secondNumber}"><br>
            <input type="submit" name="mathType" value="+">
            <input type="submit" name="mathType" value="-">
            <input type="submit" name="mathType" value="*">
            <input type="submit" name="mathType" value="%">
            
        </form>
            <div name="messageArea">
                ${message}
            </div><br>
            <a href="age">~Age Calculator~</a>
    </body>
</html>
