/*
Program: Puck.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a Puck class that inherits the Disk class. The Puck class should include member variables weight,
standard, and youth. The standard and youth variables should be boolean variables that are set to either true
or false depending on the weight of the puck. A s 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Puck;

import java.lang.Comparable;

public class Puck extends Disk {

	private double weight;
	
	public Puck(double r, double t, double w)
	{
		super(r, t);
		weight = w;
	}
	
	public void setWeight(double newW)
	{
		weight = newW;
	}
	
	public double getWeight()
	{
		return(weight);
	}
	
	public String getDivision()
	{
		if(4 <= weight && weight < 4.5)
		{
			
			return("youth");
		}
		else if(5 <= weight && weight < 5.5)
		{
			return("standard");
		}
		else
		{
		return("n/a");
		}
	}
	
	public boolean equals(Object p)
	{
		Puck tester = (Puck)p;
		
		if(tester.getRadius() == super.getRadius() && tester.getThickness() == super.getThickness() && tester.getWeight() == weight)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString()
	{
		return("The puck has radius " + super.getRadius() + ", thickness " + super.getThickness() + " and weight " + weight + ".");
	}
	
	public int compareTo(Object p)
	{
		Puck tester = (Puck)p;
		
		if (weight < tester.getWeight())
		{
			return(-1);
		}
		else if(weight == tester.getWeight())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
	
}