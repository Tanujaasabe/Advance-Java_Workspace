<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient List</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4">

        <div class="d-flex justify-content-between mb-3">
            <h2>Patient List</h2>
            <a href="addPatient" class="btn btn-success">+ Add Patient</a>
        </div>

        <table class="table table-bordered table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Role</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${patients}" var="p">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.username}</td>
                        <td>${p.email}</td>
                        <td>${p.phone}</td>
                        <td>${p.role}</td>
                        <td>
                            <a href="editPatient/${p.id}" class="btn btn-warning btn-sm">Edit</a>
                            <a href="deletePatient/${p.id}" 
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('Are you sure?')">
                               Delete
                            </a>
                        </td>
                    </tr>
                </c:forEach>

                <c:if test="${empty patients}">
                    <tr>
                        <td colspan="6" class="text-center text-muted">
                            No Patients Found
                        </td>
                    </tr>
                </c:if>
            </tbody>
        </table>

    </div>
</div>

</body>
</html>