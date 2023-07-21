<%--
  Created by IntelliJ IDEA.
  User: Hemraj
  Date: 7/17/2023
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<%--%>
<%--    String name =(String) request.getAttribute("name");--%>
<%--    Integer id =(Integer) request.getAttribute("id");--%>
<%--    LocalDateTime time =(LocalDateTime) request.getAttribute("time");--%>
<%--%>--%>
<a href="home">take me towards home page.</a>
<h1>my name is ${name}</h1>
<h1>my id number is ${id}}</h1>
<h1>my id number is ${time}</h1>

</body>
</html>
