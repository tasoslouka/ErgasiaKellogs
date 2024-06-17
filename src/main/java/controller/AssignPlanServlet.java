package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;

@WebServlet("/AssignPlanServlet")
public class AssignPlanServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int planId = Integer.parseInt(request.getParameter("planId"));

        try {
            CustomerDao.assignPlanToCustomer(customerId, planId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("assign_plan.jsp");
    }
}
