<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Patient Dashboard</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Student Dashboard</a>
        <div class="d-flex">
			<a href="${pageContext.request.contextPath}/doctor-list"
			   class="btn btn-success">
			   View Doctors
			</a>
            <a href="${pageContext.request.contextPath}/add-appointment" class="btn btn-danger">Add Appoinment</a>

			<a href="${pageContext.request.contextPath}/logout" class="btn btn-danger">Logout</a>
			
        </div>
    </div>
</nav>

<div class="container mt-4">

    <!-- Patient Info -->
    <div class="card p-3 mb-4">
		<h3>Welcome ${patient.username}</h3>
		<p>Email: ${patient.email}</p>
		<p>Phone: ${patient.phone}</p>
		<p>Role: ${patient.role}</p>
		
		
		<div class="card p-4">
		    <h4>Available Doctors</h4>

		    <!-- Doctor List Table -->
		    <table class="table table-bordered">
		        <thead class="table-dark">
		            <tr>
		                <th>Doctor Name</th>
		                <th>Specialization</th>
		                <th>Action</th>
		            </tr>
		        </thead>

		        <tbody>
		            <c:forEach var="doc" items="${doctorList}">
		                <tr>
		                    <td>${doc.username}</td>
		                    <td>${doc.specialization}</td>
		                    <td>
		                        <form action="add-appointment" method="post">
		                            <input type="hidden" name="doctorId" value="${doc.id}">
		                            <button type="submit" class="btn btn-primary">
		                                Book Appointment
		                            </button>
		                        </form>
		                    </td>
		                </tr>
		            </c:forEach>

		            <c:if test="${empty doctorList}">
		                <tr>
		                    <td colspan="3" class="text-center">No Doctors Available</td>
		                </tr>
		            </c:if>
		        </tbody>
		    </table>
		</div>s
        
        <c:if test="${not empty patient.medicalHistory}">
            <p>Medical History:</p>
            <ul>
                <c:forEach var="item" items="${patient.medicalHistory}">
                    <li>${item}</li>
                </c:forEach>
            </ul>
        </c:if>
        <c:if test="${not empty patient.prescriptions}">
            <p>Prescriptions:</p>
            <ul>
                <c:forEach var="item" items="${patient.prescriptions}">
                    <li>${item}</li>
                </c:forEach>
            </ul>
        </c:if>
    </div>

    <!-- Stats Cards -->
    <div class="row mb-4">
        <div class="col-md-4">
			<div class="card p-3 bg-light mt-3">
			    <h5>Upcoming Appointments</h5>
			    <c:forEach var="appt" items="${patient.upcomingAppointments}">
			        <p>${appt.date} at ${appt.time}</p>
			    </c:forEach>
			</div>
        </div>
        <div class="col-md-4">
            <div class="card p-3 bg-light">
                <h5>Medical History</h5>
                <c:forEach var="item" items="${patient.medicalHistory}">
                    ${item} <br/>
                </c:forEach>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card p-3 bg-light">
                <h5>Prescriptions</h5>
                <c:forEach var="item" items="${patient.prescriptions}">
                    ${item} <br/>
                </c:forEach>
            </div>
        </div>
    </div>


    

</div>
</body>
</html>