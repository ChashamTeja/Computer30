/*
Program: Staff.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.University;

public class Staff extends UEmployee { //Start of Staff class inherits UEmployee

	private String jobtitle; //create a member private variable for job title

	

    public Staff(String name, double salary, String jobtitle) { //Constructor which takes in name, salary and job
		
    	super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
		
		this.jobtitle = jobtitle;//sets departmentName to it's member variable department name
	}
			public String getJobtitle() { //Gets job title
				
				return jobtitle; //return job title
				}
				
			public void setJobtitle(String jobtitle) { //Sets job title
					
					this.jobtitle=  jobtitle;  //gets job title
					
				  }
			//return toString to display the info
			 public String toString()
		        {
		            return(super.getName()+ jobtitle + super.getSalary());
		        }
		          
					
				
			}