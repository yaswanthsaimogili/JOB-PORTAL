package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.employerfeedback;

public class emplyerfeedbackdao {
	 public int employerfeedbackdata(employerfeedback employee,String value) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO employeefeedback" +
	            " (email , cname , subject ,userid ) VALUES " +
	        		" (?, ? , ? ,?);";
	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	preparedStatement.setInt(1,1);
	          
	            preparedStatement.setString(1, employee.getEmail());
	            preparedStatement.setString(2, employee.getCname());
	            preparedStatement.setString(3, employee.getSubject());
	            preparedStatement.setString(4, value);
	   	     
	            
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }
}
