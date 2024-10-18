<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>res</title>
</head>
<body>

<h1>Response page of .jsp</h1>
    <h1>${message}</h1>

    <c:forEach items="${names}" var="name">
       <h1> ${name}</h1>
    </c:forEach>
</body>
</html>
