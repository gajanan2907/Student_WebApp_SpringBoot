<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web application</title>
</head>
<body>

 <body style='background-color: yellow;'>
	<h3>Student Registration Form</h3>
	<font color='red'>${msg}</font>
	<form:form action="save" modelAttribute="student" method="post">
		<table>
			<tr>
				<td style='font-weight:bold'>Name:</td>
				<td style='font-weight:bold'><form:input path="name" /></td>
			</tr>

			<tr>
				<td style='font-weight:bold'>Email:</td>
				<td style='font-weight:bold'><form:input path="email" /></td>
			</tr>

			<tr>
				<td style='font-weight:bold'>Gender:</td>
				<td style='font-weight:bold'><form:radiobutton path="gender" value="Male"/>Male 
				<form:radiobutton path="gender" value="Female" />Female</td>
			</tr>

			<tr>
				<td style='font-weight:bold'>Course:</td>
				<td style='font-weight:bold'><form:select path="course">
						<form:option value="">-select-</form:option>
						<form:options items="${courses}" />
					</form:select></td>
			</tr>

			<tr>
				<td style='font-weight:bold'>Timings:</td>
				<td style='font-weight:bold'><form:checkboxes items="${timings }" path="timings" /></td>
			</tr>

			<tr>
				<td style='font-weight:bold'><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>







