<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Assign Plan</title>
</head>
<body>
    <h2>Assign Plan to Customer</h2>
    <form action="<%= request.getContextPath() %>/AssignPlanServlet" method="post">
        <table>
            <tr>
                <td>Customer ID</td>
                <td><input type="text" name="customerId"></td>
            </tr>
            <tr>
                <td>Plan ID</td>
                <td><input type="text" name="planId"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Assign Plan"></td>
            </tr>
        </table>
    </form>
</body>
</html>
