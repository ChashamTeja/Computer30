 import java.io.*;
 
 import java.util.Scanner;
 public class Myfile {
 
	 public static void main(String[] args) {
		 

	       	 System.out.println("Enter file location: \n");
		        // variable to store the read file name given in the console
		        String fileToOpen;
		        
		        // Variable to store file given in the console
		        File file;
		        
		        // Read input from the keyboard
		        
		        Scanner s = new Scanner(System.in);
		        fileToOpen = s.next();
		        // Assing our file the file given in the console
		       
		        file = new File(fileToOpen);
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
	
	

	 
	

		

	
	
	

	 
	

		