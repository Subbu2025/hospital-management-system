<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>View Appointments</title>
</head>
<body>
<h1>Appointments</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Patient ID</th>
        <th>Doctor ID</th>
        <th>Date</th>
    </tr>
    <c:forEach var="appointment" items="${appointments}">
        <tr>
            <td>${appointment.id}</td>
            <td>${appointment.patientId}</td>
            <td>${appointment.doctorId}</td>
            <td>${appointment.date}</td>
        </tr>
    </c:forEach>
</table>
<a href="/">Home</a>
</body>
</html>

