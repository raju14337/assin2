package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class INSERT1 {




public static void main(String args[]){  

	try{  

		Class.forName("com.mysql.jdbc.Driver");  

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triffilid","root","root");  
		System.out.println("conncted");
		

	     
	     
	      java.sql.PreparedStatement preparedStmt = con.prepareStatement("insert into Login values(?,?)");
	      preparedStmt.setString (1, "RAJU");
	      preparedStmt.setString (2, "GOUD");
	      

	      preparedStmt.execute();
	      System.out.println("inserted");
	      
		
con.close();  

	}catch(Exception e){
		System.out.println("Not Connected");}  
}  }