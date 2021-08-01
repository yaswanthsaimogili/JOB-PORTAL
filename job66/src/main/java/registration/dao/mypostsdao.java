package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import registration.model.search;
import registration.model.successstories;

public class mypostsdao {

	 public  ArrayList<search> myposts(String value) throws ClassNotFoundException {
	        ArrayList<search> result = new ArrayList<search>();
	        Class.forName("com.mysql.jdbc.Driver");
	  
	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from postjob where userid= ?")) {
	  
	        	 preparedStatement.setInt(1, 1);
	           	 preparedStatement.setString(1,value);
	        
	            // Step 3: Execute the query or update query
	        	 ResultSet rs = preparedStatement.executeQuery();
	        	 while(rs.next())
	        	 {
	        		 search role= new search();
	        		 role.setCname(rs.getString(1));
	        		 role.setLocation(rs.getString(2));
	        		 role.setRole(rs.getString(3));
	        		 role.setExperience(rs.getString(4));
	        		 role.setSalary(rs.getString(5));
	        		 role.setSkills(rs.getNString(6));
	        		 role.setShift(rs.getString(7));
	        		 role.setEmail(rs.getString(8));
	        		 role.setDetails(rs.getString(9));
	        		 role.setLinks(rs.getString(10));
	        		 result.add(role);
	        	 }

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }
	 public  ArrayList<successstories> myfeedbacks(String value) throws ClassNotFoundException {
	        ArrayList<successstories> result = new ArrayList<successstories>();

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?allowPublicKeyRetrieval=true&useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from userfeedback where userid = ?")) {
	        	
	       	 preparedStatement.setInt(1, 1);
           	 preparedStatement.setString(1,value);
	            
	            // Step 3: Execute the query or update query
	        	 ResultSet rs = preparedStatement.executeQuery();
	        	 while(rs.next())
	        	 {
	        		 successstories role= new successstories();
	        		 role.setFname(rs.getString(1));
	        		 role.setLname(rs.getString(2));
	        		 role.setEmail(rs.getString(3));
	        		 role.setCname(rs.getString(4));
	        		 role.setSubject(rs.getString(5));
	        		 result.add(role);
	        	 }

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return result;
	    }
}
