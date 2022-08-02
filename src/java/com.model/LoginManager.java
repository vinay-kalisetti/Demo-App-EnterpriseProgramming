package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginManager 
{
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String dbuser = "root";
	String dbpwd = "Vinay@17";
	
	Connection con = null;
	PreparedStatement ps = null;
	
	public boolean validate(String uname, String pwd) throws Exception
	{
		con = DriverManager.getConnection(url, dbuser, dbpwd);
		ps = con.prepareStatement("select count(*) from login1 where uname='"+ uname +"' and pwd='"+ pwd +"'");
		ResultSet rs = ps.executeQuery();
		
		int status = 0;
		while(rs.next())
		{
			status = rs.getInt(1);
		}
		con.close();
		if(status == 1)
			return true;
		else
			return false;
	}
}
