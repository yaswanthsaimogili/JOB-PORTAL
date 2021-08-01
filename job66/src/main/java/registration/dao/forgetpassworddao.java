package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class forgetpassworddao {
	 public boolean validate(String username ,String Password) throws ClassNotFoundException {
	        
	        
	        
	    	
	   	 boolean result = false;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
	       		 
	            // Step 2:Create a statement using connection object
	  
	        	
	            ) {
	         PreparedStatement preparedStatement1 = connection.prepareStatement("select username from users where email= ? ");
	       	 preparedStatement1.setInt(1, 1);
	       	 preparedStatement1.setString(1,username);
	       	 ResultSet rs=  preparedStatement1.executeQuery();
	       	 result= rs.next();
	       	 if(result)
	       	 {
	       	 PreparedStatement preparedStatement = connection.prepareStatement("update users set passwords= ? where email=? ");
	       	 preparedStatement.setInt(1, 1);
	       	 preparedStatement.setString(1,Password);
	       	 preparedStatement.setString(2,username);
	       	 preparedStatement.executeUpdate();
	       	 }
	       	
	   }
	        catch(SQLException e)
	        {
	       	 System.out.print("Excception occured");
	       	 e.printStackTrace();
	        }
	        return result;
	   }
	    public boolean validate1(String username ,String Password) throws ClassNotFoundException {
	        
	        
	        
	    	
	    	 boolean result = false;

		        Class.forName("com.mysql.jdbc.Driver");

		        try (Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
		       		 
		            // Step 2:Create a statement using connection object
		  
		        	
		            ) {
		         PreparedStatement preparedStatement1 = connection.prepareStatement("select email from employers where email= ? ");
		       	 preparedStatement1.setInt(1, 1);
		       	 preparedStatement1.setString(1,username);
		       	 ResultSet rs=  preparedStatement1.executeQuery();
		       	 result= rs.next();
		       	 if(result)
		       	 {
		       	 PreparedStatement preparedStatement = connection.prepareStatement("update employers set passwords= ? where email=? ");
		       	 preparedStatement.setInt(1, 1);
		       	 preparedStatement.setString(1,Password);
		       	 preparedStatement.setString(2,username);
		       	 preparedStatement.executeUpdate();
		       	 }
		       	
		   }
		        catch(SQLException e)
		        {
		       	 System.out.print("Excception occured");
		       	 e.printStackTrace();
		        }
		        return result;
	      }
}
