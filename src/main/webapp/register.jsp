<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<form action="/ErgasiaKellogs/registerCustomer" method="post">
<table style="width: 80px;">
<tr>
    <td>First Name</td>
    <td><input type="text" name="firstname"></td>
</tr>

<tr>
    <td>Last Name</td>
    <td><input type="text" name="lastname"></td>
</tr>

<tr>
    <td>Username</td>
    <td><input type="text" name="username"></td>
</tr>

<tr>
    <td>Password</td>
    <td><input type="password" name="password"></td>
</tr>

<tr>
    <td>Address</td>
    <td><input type="text" name="address"></td>
</tr>

<tr>
    <td>Contact</td>
    <td><input type="text" name="contact"></td>
</tr>

<tr>
    <td colspan="2"><input type="submit" name="Submit" value="Submit"></td>
</tr>

</table>
</form>
</body>
</html>
