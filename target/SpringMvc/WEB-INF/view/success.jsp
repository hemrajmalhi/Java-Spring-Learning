<%--
  Created by IntelliJ IDEA.
  User: Hemraj
  Date: 7/18/2023
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hr>
<hr>
<h1 style="text-align: center; color: green" >${header1}</h1>
<h3 style="text-align: center;color: blue">${Desc}</h3>
<h3 style="text-align: center;color: darkblue">Student id No:  ${id}</h3>

<hr>
<hr>


<h1> ${user.name}</h1>
<h1> ${user.lname} </h1>
<h1> ${user.email}</h1>
</body>
</html>
