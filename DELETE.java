package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DELETE {

	


		public static void main(String args[]){  

			try{  

				Class.forName("com.mysql.jdbc.Driver");  

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triffilid","root","root");  
				System.out.println("conncted");
				
				 String query = "delete  from Login where password = ?";
				
				
				
			      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
			     
			      preparedStmt.setString (1,"GOUD");
			      

			      preparedStmt.execute(); 
			      System.out.println("DELETED");
			      
				
		con.close();  

			}catch(Exception e){
				System.out.println("Not Connected");}  
		}  }
