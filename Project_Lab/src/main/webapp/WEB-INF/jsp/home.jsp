<%-- 
    Document   : home
    Created on : Apr 5, 2023, 10:55:00 PM
    Author     : admin1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home</h1>
        ${list.size()}
        <c:forEach items="${list}" var="s" varStatus="index">
        </c:forEach> 
    </body>
</html>
