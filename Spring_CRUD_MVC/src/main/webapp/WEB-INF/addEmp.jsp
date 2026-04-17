<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #00c6ff, #0072ff);
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background: #ffffff;
    padding: 40px;
    border-radius: 20px;
    width: 400px;
    box-shadow: 0 15px 35px rgba(0,0,0,0.2);
    text-align: center;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}

input {
    width: 100%;
    padding: 12px;
    margin: 12px 0;
    border-radius: 25px;
    border: 1px solid #ccc;
    outline: none;
    font-size: 14px;
    transition: 0.3s;
}

input:focus {
    border-color: #0072ff;
    box-shadow: 0 0 8px rgba(0,114,255,0.3);
}

button {
    width: 100%;
    padding: 12px;
    border-radius: 25px;
    border: none;
    background: #0072ff;
    color: white;
    font-size: 16px;
    cursor: pointer;
    transition: 0.3s;
}

button:hover {
    background: #00c6ff;
    transform: scale(1.05);
}
</style>

</head>
<body>

<div class="container">
    <h2>Add Employee</h2>

    <form action="addEmp" method="post">

        <input type="text" name="name" 
               placeholder="Enter Employee Name" required>

        <input type="text" name="role" 
               placeholder="Enter Employee Role" required>

        <input type="number" name="salary" 
               placeholder="Enter Salary" required min="0">

        <button type="submit">Save Employee</button>

    </form>
</div>

</body>
</html>