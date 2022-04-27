package Myfile;

import java.io.*;

 
 import java.util.Scanner;
 public class Myfile {
 
	 public static void main(String[] args) {
		 
		     Scanner input = new Scanner(System.in);
	       	
		     System.out.println("Enter file location: \n");
		        // variable to store the read file name given in the console
		     String f20=input.next();
				
		        
		        // Variable to store file given in the console
		        File file;
		        
		      
		        
		       
		        // Assing our file the file given in the console
		       
		        file = new File(f20);
		        // check if the file exists
		       
		        if (file.exists()) {
		            System.out.println("\nThis file Exists");
		        } else {
		            System.out.println("\nThis file Does not Exist");

		 }
 
	 }
 }
 
 /* Screen Dump
	 * 
	 *  Myfile part 1of2
	 *  Enter file location: 

		C:\Users\1100023209\Documents
		
		Exists
		
		Enter file location: 


		C:\Users\1100023209\Documents\ttt.txt

		This file Does not Exist
		
		
		Myfile part 2 of 2

	 */
	
	

	 
	

		

	
	
	

	 
	

		