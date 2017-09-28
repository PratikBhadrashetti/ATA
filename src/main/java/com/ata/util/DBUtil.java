package com.ata.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;


public class DBUtil {
	
	@Autowired
	static Connection con ;
	
	static
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ata","root","root");
			System.out.println(" SUCCESS...!!! ");
		   } 
		    catch (SQLException | ClassNotFoundException   e ) 
	    	{
		    	System.out.println(" Error : " + e);
			    e.printStackTrace();
		    }
	}
	
	
	public static Connection getDBConnection(String driverType)
	{
		return con;
	}
}
