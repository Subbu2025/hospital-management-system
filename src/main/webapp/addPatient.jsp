<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Patient</title>
</head>
<body>
<h1>Add Patient</h1>
<form action="" method="post">
    <input type="hidden" name="action" value="addPatient">
    <label for="id">ID:</label>
    <input type="text" name="id" id="id">
    <br>
    <label for="name">Name:</label>
    <input type="text" name="name" id="name">
    <br>
    <label for="age">Age:</label>
    <input type="number" name="age" id="age">
    <br>
    <input type="submit" value="Add Patient">
</form>
<a href="/">Home</a>
</body>
</html>
