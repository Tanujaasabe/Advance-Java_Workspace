<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Employee List</title>

<style>
    body{
        font-family: Arial;
        text-align: center;
        background: #f2f2f2;
    }

    table{
        margin: auto;
        border-collapse: collapse;
        width: 80%;
        background: white;
    }

    th{
        background: #4CAF50;
        color: white;
        padding: 10px;
    }

    td{
        padding: 8px;
    }

    tr:nth-child(even){
        background: #f9f9f9;
    }

	.btn-edit{
	    background: orange;
	    padding: 5px 10px;
	    text-decoration: none;
	    color: white;
	    border-radius: 5px;
	    margin-right: 8px;   /* 👈 space add */
	}

    .btn-delete{
        background: red;
        padding: 5px 10px;
        text-decoration: none;
        color: white;
        border-radius: 5px;
    }

</style>
</head>
<body>

<h2>Employee List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Role</th>
    <th>Salary</th>
    <th>Action</th>
</tr>

<c:forEach var="emp" items="${employees}">
<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.role}</td>
    <td>${emp.salary}</td>

	<td>
	    <a href="/edit/${emp.id}" class="btn-edit">Edit</a>
		
	    <a href="/delete/${emp.id}" class="btn-delete"
	       onclick="return confirm('Are you sure?')" >Delete</a>
	</td>
</tr>
</c:forEach>

</table>

</body>
</html>