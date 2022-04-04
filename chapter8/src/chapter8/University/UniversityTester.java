/*
Program: Universitytester.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.University;

import java.util.Scanner;

public class UniversityTester {


	
	
	public static UEmployee assign() {
		//scanner function to get info from the user 
		Scanner input = new Scanner(System.in);
	
		System.out.println("");
		System.out.println("Enter employees Name:");
		String name = input.next();//name string to set the given name 
		
	
		
		System.out.println("Enter employees Salary:");
		int salary = input.nextInt();// salary string to set the provided salary 
		
		//ask teh user if the employee is either staff or faculty 
		System.out.println("Enter employee type: Faculty or Staff :");
		String EmpType;
		EmpType = input.next();//
		
		
		//if employee is faculty member ask for the department name 
		if(EmpType.equalsIgnoreCase("Faculty")) {
			
			System.out.println("Enter Department name:");
			String departmentName = input.next();
			
			//return the employee info in faculty 
			return new Faculty("Name:"+ name, salary , "\t Department:"+departmentName + ",\t Salary=");
		}
		//if employee is Staff member ask for the jobtitle name 
		else
		{
			//return the employee info in staff 
			System.out.println("Enter job title:");
			String jobtitle = input.next();
			return new Staff("Name:"+name  , salary ,  "\t Job:" + jobtitle + "\t Salary=");
					
  }
}	
	
	//adding main class and employees 
		public static void main(String[] args) {
			// display all the employees
			UEmployee emp1;
			UEmployee emp2;
			UEmployee emp3;
		
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			
			
			
			System.out.println("University Employees:\t\t\t\t");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
  }	
}

/* Screen Dump
Enter employees Name:
James
Enter employees Salary:
200000
Enter employee type: Faculty or Staff :
Staff
Enter job title:
Teacher
University Employees:				
Name:James	 Job:Teacher	 Salary=200000.0


 */