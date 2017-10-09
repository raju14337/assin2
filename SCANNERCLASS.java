package com.data;

import java.util.Scanner;  
class ScannerTest{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
    
   System.out.println("USERNAME");  
  String username=sc.next();  
   System.out.println("PASSWORD");  
   String password=sc.next();  
 
   System.out.println("USERNAME:"+username+" PASSWORD:"+password);  
   sc.close();  
 }  
}   