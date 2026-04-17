<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Doctor Dashboard</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }
        .sidebar {
            height: 100vh;
            background-color: #2c3e50;
            color: white;
        }
        .sidebar a {
            color: white;
            text-decoration: none;
            display: block;
            padding: 15px;
        }
        .sidebar a:hover {
            background-color: #34495e;
        }
    </style>
</head>

<body>

<div class="container-fluid">
    <div class="row">

        <!-- Sidebar -->
        <div class="col-md-2 sidebar">
            <h4 class="text-center mt-4">Doctor Panel</h4>
            <hr>
			<a href="${pageContext.request.contextPath}/doctor-dashboard">Dashboard</a>
            <a href="${pageContext.request.contextPath}/viewAppointments">Appointments</a>
            <a href="${pageContext.request.contextPath}/viewPatients">Patients</a>
            <a href="${pageContext.request.contextPath}/logout">Logout</a>
        </div>

        <!-- Main Content -->
        <div class="col-md-10 p-4">

			
			
			<c:if test="${not empty successMsg}">
			    <div class="alert alert-success alert-dismissible fade show" role="alert">
			        ${successMsg}
			        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
			    </div>
			</c:if>
			
			
            <!-- Welcome Card -->
            <div class="card p-3 mb-4">
				<h3>Welcome Dr. ${doctor.username}</h3>
				<p>Role: ${doctor.role}</p>
            </div>

            <!-- Statistics -->
            <div class="row mb-4">

                <div class="col-md-4">
                    <div class="card text-center p-4 bg-primary text-white">
                        <h4>${todayAppointments}</h4>
                        <p>Today's Appointments</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="card text-center p-4 bg-success text-white">
                        <h4>${totalPatients}</h4>
                        <p>Total Patients</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="card text-center p-4 bg-warning text-white">
                        <h4>${pendingReports}</h4>
                        <p>Pending Reports</p>
                    </div>
                </div>

            </div>

            <!-- Today's Appointment Table -->
            <div class="card p-3 mb-5">
                <h4>Today's Appointments</h4>

                <table class="table table-bordered mt-3">
                    <thead class="table-dark">
                        <tr>
                            <th>Patient Name</th>
                            <th>Time</th>
                            <th>Status</th>
                        </tr>
						
						
                    </thead>
                    <tbody>
                        <c:forEach var="app" items="${appointmentList}">
                            <tr>
                                <td>${app.patientName}</td>
                                <td>${app.time}</td>
                                <td>${app.status}</td>
                            </tr>
                        </c:forEach>
					
                        <c:if test="${empty appointmentList}">
                            <tr>
                                <td colspan="3" class="text-center">No Appointments Today</td>
                            </tr>
                        </c:if>
                    </tbody>
                </table>
            </div>

            <!-- Add Prescription Form -->
            <div class="card p-4">
                <h4>Add Prescription</h4>

                <form action="${pageContext.request.contextPath}/savePrescription" method="post">

                    <div class="mb-3">
                        <label class="form-label">Patient Name</label>
                        <input type="text" name="patientName" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Diagnosis</label>
                        <textarea name="diagnosis" class="form-control" rows="3" required></textarea>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Medicines</label>
                        <textarea name="medicines" class="form-control" rows="3" required></textarea>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Notes</label>
                        <textarea name="notes" class="form-control" rows="2"></textarea>
                    </div>

                    <button type="submit" class="btn btn-primary w-100">
                        Save Prescription
                    </button>

                </form>
            </div>

        </div>
    </div>
</div>

</body>
</html>