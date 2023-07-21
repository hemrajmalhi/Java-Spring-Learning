
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>Hello i am ${name}</h1>
<h1>Test to Check the jsp route.</h1>
<a href="about">take me towards the about page..</a>



<c:forEach var="friend" items="${f}">
    <p>${friend}</p>
</c:forEach>




</body>
</html>
