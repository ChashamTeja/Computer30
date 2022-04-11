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


	
	
	public static void main(String args[]){
		
	
		Scanner input = new Scanner(System.in);
		
		//print the available options for the user to choose from
		System.out.println(" \n 1.Faculty member 2.Staff member :");
		
        String sel=input.next();
        if(sel.equals("1")) {
        	
        	
        	Faculty new1 = new Faculty("Teja ", 2131, "sddd");
        	Faculty new2 = new Faculty("\n\nTeja ", 21312312, "sddd");
        	Faculty new3 = new Faculty("\n\nTeja ", 21312312, "sddd");
        	
    		System.out.println(new1);
    		System.out.println(new2);
    		System.out.println(new3);
    		
        }
    		else if(sel.equals("2")) {
    			
    			Staff s1 = new Staff("asdasdas ", 2131, "sdasdas");
    			Staff s2 = new Staff(sel, 0, sel);
    			Staff s3 = new Staff(sel, 0, sel);
    			
            
            	
        		System.out.println(s1);
        		System.out.println(s2);
        		System.out.println(s3);
        		
        	
    		}        	
        	
        	
        	
        	
        	
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