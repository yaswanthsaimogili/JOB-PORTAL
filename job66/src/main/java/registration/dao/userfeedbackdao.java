package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.userfeedback;

public class userfeedbackdao {
	 public int userfeedbackdata(userfeedback employee,String value) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO userfeedback" +
	            " (fname , lname ,email , cname , subject ,userid ) VALUES " +
	        		" (?, ? , ? ,? ,? , ? );";
	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	preparedStatement.setInt(1,1);
	         
	            preparedStatement.setString(1, employee.getFname());
	            preparedStatement.setString(2, employee.getLname());
	            preparedStatement.setString(3, employee.getEmail());
	            preparedStatement.setString(4, employee.getCname());
	            preparedStatement.setString(5, employee.getSubject());
	            preparedStatement.setString(6, value);
	     
	            
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }

}
