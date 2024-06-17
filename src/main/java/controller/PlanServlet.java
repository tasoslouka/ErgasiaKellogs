package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.PlanDao;
import model.Plan;

@WebServlet("/viewPlans1")
public class PlanServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Plan> plans = PlanDao.getAllPlans();
        request.setAttribute("plans", plans);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view_plans.jsp");
        dispatcher.forward(request, response);
    }
}
