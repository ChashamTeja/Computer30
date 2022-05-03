/*
Program: roster.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a Roster application that prompts the user for the name of the file to store student names and then
prompts the user for the number of students in a class. The application should then prompt the user for
the first and last name of each student and write this data to a file.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

package roster;

//import the required packages

import java.io.*;

import java.util.ArrayList;

import java.util.Scanner;

//define the class ObjectWriteRead

public class Roster

{

//define main function

public static void main(String[] args)

    {

	Scanner scanner = new Scanner(System.in);
	String fileName = null;
	int numStudents;
	String firstName;
	String lastName;
	StuName[] writeStudents = null;
	StuName[] readStudents = null;
	File file = null;
	FileOutputStream out = null;
	ObjectOutputStream writeStu = null;
	FileInputStream in = null;
	ObjectInputStream readStu = null;

	// Assign
	System.out.print("Enter file name: ");
	fileName = scanner.nextLine();
	file = new File(fileName);

	System.out.print("Enter number of students: ");
	numStudents = scanner.nextInt();
	
	scanner.nextLine();

	

	// Write StuName object
	try {

		out = new FileOutputStream(file);
		writeStu = new ObjectOutputStream(out);
		
		for (int i = 1; i <= numStudents; i++) {
            
			//prompt user to enter name of user 
			System.out.print("\nEnter first name of student " + i + ": ");
			firstName = scanner.nextLine();
			//prompt user to enter last name of user
			System.out.print("Enter last name of student " + i + ": ");
			lastName = scanner.nextLine();

			writeStu.writeObject(new StuName(firstName, lastName));

		}

	
		writeStu.close();

		System.out.println("Data has been written to the file");
		
		//Read and diplay objects
		
		in = new FileInputStream(file);
		readStu = new ObjectInputStream(in);
		
		for (int i = 1; i <= numStudents; i++) 
		{
			 System.out.println((StuName)readStu.readObject());
		 }
		readStu.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("File not found.");
	} catch (IOException e) {
		System.out.println("Problem with input/output.");
	} catch (ClassNotFoundException e) {
		System.out.println("Class could not be found to cast object.");
	}

	

	
		
		

	
	
	
	
	
	
	}
	
	

}



/* Screen Dump

Enter file name: data1.txt
Enter number of students: 1

Enter first name of student 1: swdsda
Enter last name of student 1: dasdasdasd
Data has been written to the file
swdsda dasdasdasd

 */