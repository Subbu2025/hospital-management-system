<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Doctor</title>
</head>
<body>
<h1>Add Doctor</h1>
<form action="" method="post">
    <input type="hidden" name="action" value="addDoctor">
    <label for="id">ID:</label>
    <input type="text" name="id" id="id">
    <br>
    <label for="name">Name:</label>
    <input type="text" name="name" id="name">
    <br>
    <label for="specialization">Specialization:</label>
    <input type="text" name="specialization" id="specialization">
    <br>
    <input type="submit" value="Add Doctor">
</form>
<a href="/">Home</a>
</body>
</html>
