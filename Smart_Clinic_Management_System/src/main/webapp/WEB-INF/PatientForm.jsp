<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Patient</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px; }
        form { background: #fff; padding: 20px; border-radius: 8px; max-width: 400px; margin: auto; box-shadow: 0 0 10px #ccc; }
        label { display: block; margin-top: 10px; }
        input { width: 100%; padding: 8px; margin-top: 5px; }
        button { margin-top: 15px; padding: 10px 20px; background-color: #28a745; color: #fff; border: none; border-radius: 5px; cursor: pointer; }
        button:hover { background-color: #218838; }
    </style>
</head>
<body>

<h2>Add New Patient</h2>

<form action="${pageContext.request.contextPath}/savePatient" method="post">
    <label>Username:</label>
    <input type="text" name="username" placeholder="Enter username" required />

    <label>Email:</label>
    <input type="email" name="email" placeholder="Enter email" required />

    <label>Phone:</label>
    <input type="text" name="phone" placeholder="Enter phone number" />

    <label>Role:</label>
    <input type="text" name="role" placeholder="Enter role" />

    <button type="submit">Save Patient</button>
</form>

</body>
</html>