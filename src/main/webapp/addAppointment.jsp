<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Appointment</title>
</head>
<body>
<h1>Add Appointment</h1>
<form action="" method="post">
    <input type="hidden" name="action" value="addAppointment">
    <label for="id">ID:</label>
    <input type="text" name="id" id="id">
    <br>
    <label for="patientId">Patient ID:</label>
    <input type="text" name="patientId" id="patientId">
    <br>
    <label for="doctorId">Doctor ID:</label>
    <input type="text" name="doctorId" id="doctorId">
    <br>
    <label for="date">Date:</label>
    <input type="text" name="date" id="date">
    <br>
    <input type="submit" value="Add Appointment">
</form>
<a href="/">Home</a>
</body>
</html>

