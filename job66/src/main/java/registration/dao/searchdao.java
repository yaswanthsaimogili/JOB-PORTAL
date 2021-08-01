package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import registration.model.search;


public class searchdao {
	
	
	
	 public  ArrayList<search> searchrole(String value ,String location ,String company ) throws ClassNotFoundException {
	        ArrayList<search> result = new ArrayList<search>();
	        Class.forName("com.mysql.jdbc.Driver");
	     
	         
	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from postjob where role like ? And location like ? And  comapanyname like ?")) {
	  
	        	 preparedStatement.setInt(1, 1);
	           	 preparedStatement.setString(1,"%"+value+"%");
	        	 preparedStatement.setString(2,"%"+location+"%");
	        	 preparedStatement.setString(3,"%"+company+"%");
	        	
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
	
	
	 public  static ArrayList<search> recentjobs() throws ClassNotFoundException {
		 ArrayList<search> result = new ArrayList<search>();

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject? allowPublicKeyRetrieval=true&useSSL=false", "root", "1234");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from postjob LIMIT 3 ;")) 
	        {
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
}
