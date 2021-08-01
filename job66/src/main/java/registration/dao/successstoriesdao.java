package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import registration.model.successstories;

public class successstoriesdao {
	public static  ArrayList<successstories> feedback() throws ClassNotFoundException {
        ArrayList<successstories> result = new ArrayList<successstories>();

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jobproject?allowPublicKeyRetrieval=true&useSSL=false", "root", "1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from userfeedback LIMIT 3")) {
   
            
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
