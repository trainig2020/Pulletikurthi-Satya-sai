<%@page import="java.util.ArrayList"%>
<%@page import="com.hcl.dto.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Getting All Departments</title>
</head>
<body>
<a href="NewDepartment">Insert New Department</a>

 

    <c:if test="${Register eq 'newform'}">
        <form action="CreateDepartment" method="post">
            <table border="1" >
                <thead>
                    <tr bgcolor="violet">
                        <th>DeptID</th>
                        <th>DeptName</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${getalldept1}" var="dept">
                        <tr bgcolor="orange">
                            <td><c:out value="${dept.deptID}" /></td>
                            <td><c:out value="${dept.deptName}" /></td>
                            <td><a href="UpdateDepartment?DeptID=${dept.deptID}">Update</a></td>
                            <td><a href="DeleteDepartment?DeptID=${dept.deptID}">Delete</a></td>
                        </tr>
                    </c:forEach>
                    <tr bgcolor="orange">
                        <td><input type="text" name="DeptID" /></td>
                        <td><input type="text" name="DeptName" /></td>
                   <td colspan="1" align="center"><input type="submit"value="save" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </c:if>
    <c:if test="${Register ne 'newform'}">
        <form action="UpdateDepartment" method="post">
            <table border="2" >
                <thead>
                    <tr bgcolor=violet >
                        <th>DeptID</th>
                        <th>DeptName</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${getalldept1}" var="dept">
                    
                          <c:if test="${department.deptID eq dept.deptID}">
                        <tr bgcolor="orange">
                            <td><input type="text" name="DeptID"
                                value="${department.deptID}" readonly="readonly" /></td>
                            <td><input type="text" name="DeptName"
                                value="${department.deptName}" /></td>
                            <td><input type="submit" value="update" /></td>
                        </tr>
                    </c:if>
                    <c:if test="${department.deptID ne dept.deptID}">
                        <tr bgcolor="orange">
                            <td><c:out value="${dept.deptID}" /></td>
                            <td><c:out value="${dept.deptName}" /></td>
                            <td><a href="GetDepartment?DeptID=${dept.deptID}">Update</a></td> 
                            <td><a href="DeleteDepartment?DeptID=${dept.deptID}">Delete</a></td>
                        </tr>
                    </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </form>
    </c:if>
</body>
</html>