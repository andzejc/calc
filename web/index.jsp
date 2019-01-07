<%-- 
    Document   : index
    Created on : Jan 7, 2019, 10:10:02 PM
    Author     : HP
--%>


<%@page import="com.calc.Calc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Itree task</title>
    </head>
    <body>
        <fieldset style="width: 530px; margin: 0 auto";>
            <legend>iTree task: Calculator </legend>
            <form  action="Calc" method="POST""> 
                <br><br>
                <input type="number" name="variableA" placeholder="Enter first digit" required="required">
                <br><br>
                <span>
                    <label for="sum">Sum</label>
                    <input id="sum" type="radio" name="action" value="sum" required="required">
                    <label for="mult">Mult</label>
                    <input id="mult" type="radio" name="action" value="mult" required="required">
                </span>
                <br><br>
                <input type="number" name="variableB" placeholder="Enter second digit" required="required">
                <br><br>
                <input type="submit" value="Submit">
                <br><br>
                <%
                    if (Calc.getSum() != null) {%>
                <h2>The correct answer is:
                    <%= Calc.getSum()%>
                </h2>
                <%}%>
            </form>
    </body>
</html>
