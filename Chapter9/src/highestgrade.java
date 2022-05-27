/*
Program: HighestGrade.java          Last Date of this Revision: May 2 , 2022




Purpose: Create a HighestGrade application that prompts the user for five grades between 0 and 100 points and stores
the grades in an ArrayList. HighestGrade then traverses the grades to determine the highest grade and then
displays the grade along with an appropriate message

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class highestgrade {

	public static void main(String[] args){
		Scanner scan =  new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//promote user to enter 5 grades
		System.out.println("Enter five grades between 0 and 100.");
		
		int greatest = -1;
		int i = 5;
		while(scores.size()<5){
			
			int input = scan.nextInt();
			
			//store grade if it higher then zero and lower then 100 
			if(input <= 100 && input >= 0){
				scores.add(input);
				
				//store the highest grade entered by the user in greatest variable
				if(input >= greatest)
					greatest = input;
				i--;
				
				//display the highest grade stored in 
				if(i != 0)
					System.out.println("Enter "+i+" more grades.");
			}
			
			// error message if the grade  entered in not positive integer or higher then 100  
			else{
				System.out.println("Error: Make sure the grade is between 0 and 100!\nEnter a new grade!");
			}
		}
		
		      
		        System.out.println("\nHighest grade: "+greatest);
		
	}
}


/* Screen Dump
Enter five grades between 0 and 100.
45
Enter 4 more grades.
78
Enter 3 more grades.
90
Enter 2 more grades.
99
Enter 1 more grades.
88

Highest grade: 99

 */