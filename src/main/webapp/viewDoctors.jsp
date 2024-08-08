<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>View Doctors</title>
</head>
<body>
<h1>Doctors</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Specialization</th>
    </tr>
    <c:forEach var="doctor" items="${doctors}">
        <tr>
            <td>${doctor.id}</td>
            <td>${doctor.name}</td>
            <td>${doctor.specialization}</td>
        </tr>
    </c:forEach>
</table>
<a href="/">Home</a>
</body>
</html>
