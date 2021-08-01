package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import registration.model.employerregistration;

public class employerregistrationdao {

	
	 public int registerEmployee(employerregistration employee) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO employers" +
	            " (Company,country,state,city,area,domain,email,socialmedia,representativename,representativeemail,representativeposition,representativenumber,companydescription,passwords) VALUES " +
	        		" (?, ? , ? ,? ,? ,? ,? ,? ,? , ? , ? , ? , ? ,?);";
	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	preparedStatement.setInt(1,1);
	            preparedStatement.setString(1, employee.getCompanyname());
	            preparedStatement.setString(2, employee.getCountry());
	            preparedStatement.setString(3, employee.getState());
	            preparedStatement.setString(4, employee.getCity());
	            preparedStatement.setString(5, employee.getArea());
	            preparedStatement.setString(6, employee.getDomain());
	            preparedStatement.setString(7, employee.getEmail());
	            preparedStatement.setString(8, employee.getWebsite());
	            preparedStatement.setString(9, employee.getRepresentativename());
	            preparedStatement.setString(10, employee.getRepresentativeemail());
	            preparedStatement.setString(11, employee. getRepresentativeposition());
	            preparedStatement.setString(12, employee.getPhoneno());
	            preparedStatement.setString(13, employee.getDescription());
	            preparedStatement.setString(14, employee.getPassword());
	    
	            
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }
	    public boolean validate(String username) throws ClassNotFoundException {
	    
	    
	    
	    	
	    	 boolean result = false;

	         Class.forName("com.mysql.jdbc.Driver");

	         try (Connection connection = DriverManager
	             .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
	        		 
	             // Step 2:Create a statement using connection object
	             PreparedStatement preparedStatement = connection.prepareStatement("select Company from employers where Company= ? ;")) {
	        	 preparedStatement.setInt(1, 1);
	        	 preparedStatement.setString(1,username);
	        	 ResultSet rs=  preparedStatement.executeQuery();
	        	 result= rs.next();
	        	 
	                     
	    
	    }
	         catch(SQLException e)
	         {
	        	 System.out.print("Excception occured");
	        	 e.printStackTrace();
	         }
	         return result;
	    }
	   
	    
	}
