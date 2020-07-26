<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/SpringMap/admissionForm?siteLanguage=en">English</a>
<a href="/SpringMap/admissionForm?siteLanguage=fr">French</a>
<h1>STUDEN ADMISSION FORM FOR ENGINEERING COURSES</h1>
<h2>${headerMessage}</h2>

<form:errors path="student1.*"/>
<form action="submitAdmissionForm" method="post">
<table>
<tr>
<td><spring:message code="label.studentName"/>  </td><td><input type="text" name="studentName"></td>
</tr><tr>
<td><spring:message code="label.studentHobby"/></td><td><input type="text" name="studentHobby"></td>
</tr><tr>
<td><spring:message code="label.studentMobile"/></td><td><input type="text" name="studentMobile"></td>
</tr><tr>
<td><spring:message code="label.studentDOB"/></td><td><input type="text" name="studentDOB"></td>
</tr><tr>

   </tr>                   

<tr><td><input type="submit" value="<spring:message code="label.submitForm"/>"></td></tr>

</table>
</form>

</body>
</html>