/*
Program: Myfile.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a MyFile application that prompts the user for the name of a file and then displays a message that
indicates whether the files exists or not. Note that if the user types in a full path, any single backslashes (\)
will need to be replaced with an escape sequence(\\) in order to create a new File object.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

package Myfile;

import java.io.*;

 
 import java.util.Scanner;
 public class Myfile {
 
	 public static void main(String[] args) {
		 
		     Scanner input = new Scanner(System.in);
	       	
		     System.out.println("Enter file location: \n");
		        // variable to store the read file name given in the console
		     
		     String f20=input.next();
				
		        
		        // Variable to store file 
		       
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
	
	

	 
	

		

	
	
	

	 
	

		