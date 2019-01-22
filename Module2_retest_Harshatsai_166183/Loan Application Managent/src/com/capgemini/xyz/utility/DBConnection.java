package com.capgemini.xyz.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DBConnection {
	
private static Connection conn=null;
	
  	
	public static Connection getConnection() throws Exception
	
	{
		  System.out.println("success");
		  Properties p=new Properties();
		  File f1=new File("Resources/db.Properties");
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(f1);
		}
		catch(FileNotFoundException fe)
		{
			
		}
		try
		{
			p.load(fis);
		     String driver=p.getProperty("driver");
		     String url=p.getProperty("url");
		     String username=p.getProperty("username");
		     String password=p.getProperty("password");
		     
		     
		 
			  Class.forName(driver);
			  conn=DriverManager.getConnection(url,username,password);
		  }
	
		  catch(SQLException se)
		  {
			  
		  }
		return conn;
		
		
	}


	public static DBConnection getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
