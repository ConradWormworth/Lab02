<%-- 
    Document   : ageCalculator
    Created on : Sep 14, 2018, 3:20:52 PM
    Author     : 612944
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Super Cool Age Calculator</title>
    </head>
    <body>
        <h1>Please enter your current age</h1>
        <form method="post" action="age">
            Current Age: <input type="text" name="currentAge" value="${currentAge}"><br>
            <input type="submit" value="Submit">
        </form>
            <div name="messageArea">
                ${message}
            </div><br>
            <a href="arithmetic">~Arithmetic Calculator~</a>
    </body>
</html>
