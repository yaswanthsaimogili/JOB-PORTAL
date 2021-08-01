package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logindao {

    public boolean validate(String username ,String Password) throws ClassNotFoundException {
        
        
        
    	
   	 boolean result = false;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
       		 
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select username from users where username= ?  and passwords = ? ")) {
       	 preparedStatement.setInt(1, 1);
       	 preparedStatement.setString(1,username);
       	 preparedStatement.setString(2, Password);
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
    public boolean validate1(String username ,String Password) throws ClassNotFoundException {
        
        
        
    	
      	 boolean result = false;

           Class.forName("com.mysql.jdbc.Driver");

           try (Connection connection = DriverManager
               .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");
          		 
               // Step 2:Create a statement using connection object
               PreparedStatement preparedStatement = connection.prepareStatement("select email from employers where email= ?  and passwords = ? ")) {
          	 preparedStatement.setInt(1, 1);
          	 preparedStatement.setString(1,username);
          	 preparedStatement.setString(2, Password);
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
