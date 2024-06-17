<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Plan" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Plans</title>
</head>
<body>
    <h2>Available Plans</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <%
            List<Plan> plans = (List<Plan>) request.getAttribute("plans");
            for (Plan plan : plans) {
        %>
        <tr>
            <td><%= plan.getId() %></td>
            <td><%= plan.getName() %></td>
            <td><%= plan.getPrice() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
