package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;    
import java.sql.SQLException;

import model.Customer;

public class CustomerDao {
    public int registerCustomer(Customer customer) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customers(first_name,last_name,username,password,address,contact) VALUES( ?, ?, ?, ?, ?, ?);";
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB?useSSL=false", "root", "12345");
        
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
            
        
       
        preparedStatement.setString(1, customer.getFirstName());
        preparedStatement.setString(2, customer.getLastName());
        preparedStatement.setString(3, customer.getUsername());
        preparedStatement.setString(4, customer.getPassword());
        preparedStatement.setString(5, customer.getAddress());
        preparedStatement.setString(6, customer.getContact());
        
        System.out.println(preparedStatement);
        
        result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
              
    }
    
    public static void assignPlanToCustomer(int customerId, int planId) throws SQLException {
        String ASSIGN_PLAN_SQL = "UPDATE customers SET plan_id = ? WHERE id = ?;";
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB?useSSL=false", "root", "12345");
             PreparedStatement preparedStatement = connection.prepareStatement(ASSIGN_PLAN_SQL)) {
            preparedStatement.setInt(1, planId);
            preparedStatement.setInt(2, customerId);
            preparedStatement.executeUpdate();
        }
    }

}