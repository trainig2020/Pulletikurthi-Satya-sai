<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${head}</h1>
 <h1>Student Engineering form </h1>
 <form action="submitAdmissionForm.html" method="post">
 <table>
 <tr>
<td> <p>
 student Name:
 <input type="text" name="studentName" />
 </p></td>
 </tr>
 <tr>
 <td><p>
 StudentHobby :
 <input type="text" name="studentHobby" />
 </p> </td>
 </tr>
 <tr>
 <td><p>
 StudentMobile :
 <input type="text" name="studentMobile" />
 </p></td>
 </tr>
  <tr> 
  <td>  <p>
 StudentDob :
 <input type="date" name="studentDob" />
 </p> </td>
 </tr> 
 
   <tr>
  <td> Student Address : <br> 
   Country:
 <input type="text" name="studentAddress.country" /> <br> <br>
 City:
 <input type="text" name="studentAddress.city" /><br> <br>
 Pincode:
 <input type="text" name="studentAddress.pincode" /><br> <br>
 State:
 <input type="text" name="studentAddress.state" /><br> <br>
 </td>
   </tr>
   
  <tr> 
<td> <input type="submit" value="Submit the form" /></td>
 </tr>
 </table>
 </form>
</body>
</html>