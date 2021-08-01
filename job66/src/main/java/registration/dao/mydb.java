package registration.dao;

import java.sql.*;

public class mydb {
	Connection con =null;
	public Connection getCon()
	{
		try {
			
			Class.forName("com.sql.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jobproject","root","1234"); 
		
		     } 
		catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
							}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return con ;
	}
	
}