/*
Program: Hockey.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables weight,
standard, and youth. The standard and youth variables should be boolean variables that are set to either true
or false depending on the weight of the puck. A s 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Puck;

import java.util.Scanner;

public class Hockey {

	public static void main(String[] args) 
	{
		
Scanner input = new Scanner(System.in);
		
Puck p1 = new Puck(1.5, 0.8, 4.4);

System.out.println("The puck has radius: " + p1.getRadius());
System.out.println("The puck has volume: " + p1.volume());
System.out.println("Meant for division: " + p1.getDivision());
System.out.println("The puck has weight: " + p1.getWeight());

Puck first = new Puck(1.5, 1.0, 4.9);
Puck second = new Puck(1.3, 0.7, 4.5);
Puck third = new Puck(1.5, 1.0, 4.9);

if(first.equals(second))
{
	System.out.println("First and second pucks are equal");
}
else
{
	System.out.println("First and second pucks are not equal");
}
if(first.equals(third))
{
	System.out.println("First and third pucks are equal");
}
else
{
	System.out.println("First and third pucks are not equal");
}
if(third.equals(second))
{
	System.out.println("Third and second pucks are equal");
}
else
{
	System.out.println("Third and second pucks are not equal");
}

if(first.compareTo(second) < 0)
{
	System.out.println("The first puck is smaller than the second");
}
else if(first.compareTo(second) == 0)
{
	System.out.println("The first puck is equal to the second");
}
else
{
	System.out.println("The first puck is larger than the second");
}
}

}
