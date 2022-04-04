/*
Program: Faculty.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.University;

	public class Faculty extends UEmployee { //Start of Faculty class which inheritsUEmployee
	
		private String departmentName; //Create private member variables for department name
		
		public Faculty(String name, double salary, String departmentName) { //Faculty constructor which takes in name, salary and depName
			super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
			
			this.departmentName = departmentName;//sets departmentName to it's member variable department name
		}
      
		public String getDepartment() //get department  
		{ //Returns department
		    
			return departmentName;
		    
		}
		       public void setDepartment(String departmentName) { //set department
			     
		    	   this.departmentName = departmentName; 
			       
		       }
		       

		       public String toString()//return strings 
		        {
		            return(super.getName()+ departmentName+ super.getSalary());
		        }
		          
		           
	
	}
