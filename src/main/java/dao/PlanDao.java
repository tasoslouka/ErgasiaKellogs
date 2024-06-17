package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; // Εισαγωγή για τη λίστα

import model.Plan; // Εισαγωγή για το Plan 

public class PlanDao {
    public static List<Plan> getAllPlans() {
        List<Plan> plans = new ArrayList<>();  // Χρησιμοποιώντας το σωστό τύπο λίστας
        String SELECT_ALL_PLANS_SQL = "SELECT * FROM plans";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB?useSSL=false", "root", "12345");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_PLANS_SQL)) {

            while (resultSet.next()) {
                Plan plan = new Plan();
                plan.setId(resultSet.getInt("id"));
                plan.setName(resultSet.getString("name"));
                plan.setPrice(resultSet.getBigDecimal("price"));
                plans.add(plan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return plans;
    }
}
