<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
h1 {
	color: red;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 15px;
	text-align: left;
}
</style>
<title>Getting All Department</title>
</head>
<body>
    <a href="/SpringMVCProject/?siteLanguage=en">English</a>
    <a href="/SpringMVCProject/?siteLanguage=fr">French</a>
    <a href="/SpringMVCProject/?siteLanguage=jp">Japanese</a>
	<a href="newDepartment"><h2>Insert New Department</h2></a>
	
	<c:if test="${Register eq 'NewForm'}">
		<form action="saveDepartment" method="post">
	</c:if>
	<c:if test="${Register ne 'NewForm'}">
		<form action="saveDepartment" method="post">
	</c:if>

	<table border="2" style="width: 100%"background-color:#eee;>
		<thead>
			<tr bgcolor="orange">
				<th><spring:message code="label.DeptID"/></th>
				<th><spring:message code="label.DeptName"/></th>
				<th><spring:message code="label.Update"/></th>
				<th><spring:message code="label.Delete"/></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${DepartmentList}" var="dep">
			      		
				<c:if test="${departmentid eq dep.deptID}">
					<tr>
						<td><input type="text" name="DeptID"
							value="${dep.deptID}" readonly="readonly" /></td>
						<td><input type="text" name="DeptName"
							value="${dep.deptName}" /></td>
						<td><input type="submit" value="<spring:message code="label.Update"/>" /></td>
					</tr>
				</c:if>
				<c:if test="${departmentid ne dep.deptID}">
					<tr>
						
                    <td>${dep.deptID}</td>
                    <td>${dep.deptName}</td>
                    <td><a href="getDepartment?id=${dep.deptID}">Update</a></td>
                     <td><a href="deleteDepartment?id=${dep.deptID}">Delete</a></td>
					</tr>
				</c:if>
				</c:forEach>
					<c:if test="${insertDepartment eq 'newdepartment'}">
						<tr>
							<td><input type="text" name="DeptID" /></td>
							<td><input type="text" name="DeptName" /></td>
							<td colspan="2"><input type="submit" value="<spring:message code="label.Save"/>"/></td>
						</tr>
					</c:if>	
		</tbody>
	</table>
</form>
</body>
</html>