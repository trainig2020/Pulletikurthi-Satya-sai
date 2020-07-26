<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>STUDEN ADMISSION FORM FOR ENGINEERING COURSES</h1>
<h2>${headerMessage}</h2>

<form:errors path="student1.*"/>
<form action="submitAdmissionForm" method="post">
<table>
<tr>
<td>Student Name:</td><td><input type="text" name="studentName"></td>
</tr><tr>
<td>Student Hobby:</td><td><input type="text" name="studentHobby"></td>
</tr><tr>
<td>Student Mobile:</td><td><input type="text" name="studentMobile"></td>
</tr><tr>
<td>Student DOB:</td><td><input type="text" name="studentDOB"></td>
</tr><tr>

   </tr>                     
<tr><td><input type="submit" value="submit this form"></td></tr>
</table>
</form>

</body>
</html>