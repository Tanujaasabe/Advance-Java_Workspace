<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Appointment</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">

    <div class="card p-4 mx-auto" style="max-width: 500px;">
        <h4 class="mb-3">Book New Appointment</h4>

		<form action="${pageContext.request.contextPath}/add-appointment" method="post">

		    <input type="hidden" name="doctorId" value="${doctorId}">

		    <div class="mb-3">
		        <label class="form-label">Appointment Date</label>
		        <input type="date" class="form-control" name="date" required>
		    </div>

		    <div class="mb-3">
		        <label class="form-label">Appointment Time</label>
		        <input type="time" class="form-control" name="time" required>
		    </div>

		    <button type="submit" class="btn btn-primary w-100">
		        Book Appointment
		    </button>
		</form>

    </div>

</div>
</body>
</html>