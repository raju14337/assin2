package com.data;

import java.sql.*;  
class BASE{  

	public static void main(String args[]){  

		try{  

			Class.forName("com.mysql.jdbc.Driver");  

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triffilid","root","root");  
			System.out.println("conected");  
			
con.close();  

		}catch(Exception e){
			System.out.println("Not Connected");}  
}  
}  