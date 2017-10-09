package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class UPDATE {


public static void main(String args[]){  

	try{  

		Class.forName("com.mysql.jdbc.Driver");  

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triffilid","root","root");  
		System.out.println("conncted");
		
		 String query = "update Login set username = ? where password = ?";
	     
	     
	      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
	     
	      preparedStmt.setString (1, "SURVI");
	      preparedStmt.setString (2, "GOUD");
	      

	      preparedStmt.execute();
	      System.out.println("UPDATED");
	      
		
con.close();  

	}catch(Exception e){
		System.out.println("Not Connected");}  
}  }
