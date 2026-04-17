<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container mt-5">

    <h3>Available Doctors</h3>

    <table class="table table-bordered">
        <thead class="table-dark">
            <tr>
                <th>Name</th>
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
                        <a href="${pageContext.request.contextPath}/book-appointment?doctorId=${doc.id}"
                           class="btn btn-primary">
                           Book Appointment
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</div>