/*
Program: Myfilepart2.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a MyFile application that creates a file named zzz.txt and then displays a message indicating that the
file has been created. The application should prompt the user to either keep or delete the file. If the file is
deleted, a message should notify the user when the file has been successfully deleted.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package Myfile;

import java.io.*;

import java.util.Scanner;

public class Myfilepart2 {

	public static void main(String[] args) {

	File textFile = new File("C:\\Users\\1100023209\\Documents\\zzz.txt");

	if (textFile.exists()) {

		System.out.println("File already exists.");

	} 

	else {

		try {

			textFile.createNewFile();
			System.out.println("zzz.txt created.");
		} 		
		catch (IOException e) {
		
			System.out.println("File could not be created.");
			
			System.err.println("IOException: " + e.getMessage());

		}//end catch
}//end else
		Scanner input=new Scanner(System.in);
		
		//prompt the user to type D to delete file
		System.out.println("\n Type D to delete the file. Type any other character to keep the file: ");
		
		//input stored in CH
	
		String del=input.next();
		
		
		//if CH is D
		if(del.equals("D"))
{
 
			textFile.delete();//if file is deleted successfully
       
			
           
			System.out.println("File deleted successfully");
       
			}
		
		else {
			
			System.out.println("File was not deletedd");
			
		}
		
		
			


       
			 



     }//end main
}//end class


/* Screen Dump
 *  
File already exists.

 Type D to delete the file. Type any other character to keep the file: 
D
File deleted successfully

 */

