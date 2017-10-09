package com.data;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class SCANNER {
public static void main(String args[]){  
     try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triffilid","root","root");  
		System.out.println("conncted");

		PreparedStatement ps = con.prepareStatement("insert into Login values(?,?)");
	      int i=1;
	      Scanner sc=new Scanner(System.in); 
	      do{
	    	  switch(i){
	    	  case 1:
	    		    Scanner s=new Scanner(System.in);
	    		    System.out.println("USERNAME");  
	    		    String username=s.next();  
	    		    ps.setString(1,username);
	    		    Scanner s1=new Scanner(System.in);
	    		    System.out.println("PASSWORD"); 
	    		    String password=s1.next();  
	    		    ps.setString(2,password);
	    		    int j=ps.executeUpdate();
	    		    if(j>0){
	    		      System.out.println("success");
	    		    }
	    		    break;
	    	  }
	    	  System.out.println("enter your choice1(yes); or 2(no)");
	    	  i=sc.nextInt();
	      }while(i==1);
		
	}
	      catch(Exception e){
		System.out.println("Not Connected");}  
}  }