package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;

import registration.model.registration;

public class registrationdao 

{

    public int registerEmployee(registration employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO users" +
            " (email , fname , lname , username , Phoneno, passwords, country , city, recent , collegename , percentage ,qualification,specialization,skills,Ecperienceyears ,gender ) VALUES " +
        		" (?, ? , ? ,? ,? ,? ,? ,? ,? , ? , ? , ? , ? , ? , ? , ? );";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jobproject?useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	preparedStatement.setInt(1,1);
            preparedStatement.setString(1, employee.getEmail());
            preparedStatement.setString(2, employee.getFname());
            preparedStatement.setString(3, employee.getLname());
            preparedStatement.setString(4, employee.getUsername());
            preparedStatement.setString(5, employee.getPhoneno());
            preparedStatement.setString(6, employee.getPassword());
            preparedStatement.setString(7, employee.getCountry());
            preparedStatement.setString(8, employee.getCity());
            preparedStatement.setString(9, employee.getJobtitle());
            preparedStatement.setString(10, employee.getCollegename());
            preparedStatement.setString(11, employee. getPercentage());
            preparedStatement.setString(12, employee.getQualification());
            preparedStatement.setString(13, employee.getSpecilization());
            preparedStatement.setString(14, employee.getSkills());
            preparedStatement.setString(15, employee.getExperience());
            preparedStatement.setString(16, employee.getGender());
     
            
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
             PreparedStatement preparedStatement = connection.prepareStatement("select username from users where username= ? ;")) {
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