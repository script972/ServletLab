<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 12.02.2017
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Laba 2</title>
  </head>
  <body>
  <h1>Решение уровнения</h1>
  <form action="MyServlet" method="get">
    <h3>Начельные значения</h3>
    <label >Значение a <input type="text" name="valueA"></label>
    <label >Значение b <input type="text" name="valueB"></label>
    <label >Значение c <input type="text" name="valueC"></label>
    <h3>Диапазон значений X</h3>
    <label >Значения от <input type="text" name="valueFrom"></label>
    <label >Значения до <input type="text" name="valueTo"></label>
    <label >Значения шага <input type="text" name="valueStep"></label>
    <input type="submit" value="Отправить" >
  </form>

  </body>
</html>
