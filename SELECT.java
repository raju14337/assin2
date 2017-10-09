package com.data;

import java.sql.*;

public class SELECT {

	public static void main(String args[]){  

		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/triffilid","root","root");  
		    Statement st =con.createStatement();
		    ResultSet rs = st.executeQuery("SELECT * FROM Login");
		    while (rs.next())
		    {
		        String username = rs.getString("username");
		        String password=rs.getString("password");
		        System.out.format("%s , %s\n", username, password);
		      }
		}catch(Exception e){
			
			System.out.println("not selected");
		}
	}
}