package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.postjob;

public class postjobdao {

	 public int postjob(postjob employee,String value) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO postjob" +
	            " (comapanyname,location,role,experience,salary,skills,shift,email,details,link,userid) VALUES " +
	        		" (?, ? , ? ,? ,? ,? ,? ,? ,? ,?, ?);";
	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	preparedStatement.setInt(1,1);
	            preparedStatement.setString(1, employee.getCname());
	            preparedStatement.setString(2, employee.getLocation());
	            preparedStatement.setString(3, employee.getRole());
	            preparedStatement.setString(4, employee.getExperience());
	            preparedStatement.setString(5, employee.getSalary());
	            preparedStatement.setString(6, employee.getSkills());
	            preparedStatement.setString(7, employee.getShift());
	            preparedStatement.setString(8, employee.getEmail());
	            preparedStatement.setString(9, employee.getDetails());
	            preparedStatement.setString(10, employee.getLink());
	            preparedStatement.setString(11, value);

	            
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }
	
	
	
}
