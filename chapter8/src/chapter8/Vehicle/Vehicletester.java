/*
Program: VehicleTester.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Vehicle;


import java.util.Scanner;



public class Vehicletester  {
	 
	public static void main(String args[]){
		
		//added scanner program to get info form the user 
		Scanner input = new Scanner(System.in);
		
		//print the available options for the user to choose from
		System.out.println(" \n 1.Car \n2.Minivan \n 3.Truck \nChoose vehicle type :");
		String sel=input.next();
		
		//if statement to display the components  of the car class if car is selected form the user 
		if(sel.equals("car")) {
			//added all the cars available and their properties
			Car car1 = new Car("Rolls royce Wraith", "White", 155, 5, "6.6 L V12", "Bulletproof");
			Car car2 = new Car("2022 Mustang gt ", "Yellow", 250, 2, "5.0-liter V8", "Not Bulletproof");
			Car car3 = new Car("2022 Nissan Gtr ", "Mat black", 205, 4, "3.8-liter V-6", "Not Bulletproof");
			

			//object discription is displayed
			
			//print car options 
			System.out.println(car1.toString()+"\nHonk noise:"+car1.honk()+"\n"+car1.Convertible()+"\n"+car1.Automatic());
			System.out.println("\n"+car2.toString()+"\nHonk noise:"+car2.honk()+"\n"+car2.Convertible()+"\n"+car2.notAutomatic());
			System.out.println("\n"+car3.toString()+"\nHonk noise:"+car3.honk()+"\n"+car3.NotConvertible()+"\n"+car3.notAutomatic());
		}
		//else if statement to display the components  of the car class if car is selected form the user
		else if(sel.equals("minivan")){
			//added all the minivans available and their properties
			minivan m1= new minivan("Nissan NV 200", "White", 123, 7, "122.7 cubic feet");
			minivan m2= new minivan("Chrysler pacifica", "Maroon", 231, 8, "32.3 cubic feet");
			minivan m3= new minivan("Toyota hiace", "Black", 145, 12, "123kg");
			//print car options
			System.out.println("\n"+m1.toString()+"\nHonk noise:"+m1.honk()+"\n"+m1.NotConvertible()+"\n"+m1.notAutomatic());
			System.out.println("\n"+m2.toString()+"\nHonk noise:"+m2.honk()+"\n"+m2.NotConvertible()+"\n"+m2.Automatic());
			System.out.println("\n"+m3.toString()+"\nHonk noise:"+m3.honk()+"\n"+m3.Convertible()+"\n"+m3.notAutomatic());
			
			
		}
		else if(sel.equals("truck")){
			//added all the trucks available and their properties
		     Truck t1 = new Truck("2021 Ford f-150", "Red", 120, 6, "14,000 pounds");
		     Truck t2= new Truck("2022 Ram 2500", "White", 150, 6, "20,000 pounds");
		     Truck t3 = new Truck("2020 nissan frontier", "Grey", 120, 5, "6,720 pounds");
		     
		   //print all the trucks available
		     System.out.println("\n"+t1.toString()+"\nHonk noise:"+t1.honk()+"\n"+t1.Convertible()+"\n"+t1.Automatic());
		     System.out.println("\n"+t2.toString()+"\nHonk noise:"+t2.honk()+"\n"+t2.NotConvertible()+"\n"+t2.Automatic());
		     System.out.println("\n"+t3.toString()+"\nHonk noise:"+t3.honk()+"\n"+t3.NotConvertible()+"\n"+t3.Automatic());
		     
		     
		     
		     
		}
		
		
		
		
		
		 
		 
}
	
	
	/* Screen Dump
	 *  
 1.Car 
2.Minivan 
 3.Truck 
Choose vehicle type :
car
Model:Rolls royce Wraith
Top speed:155.0
Colour:White
Engine:6.6 L V12
Seats:5
Additional:Bulletproof
Honk noise:Beep Beep
Car is convertible
Car is Automatic

Model:2022 Mustang gt 
Top speed:250.0
Colour:Yellow
Engine:5.0-liter V8
Seats:2
Additional:Not Bulletproof
Honk noise:Beep Beep
Car is convertible
Car is not Automatic

Model:2022 Nissan Gtr 
Top speed:205.0
Colour:Mat black
Engine:3.8-liter V-6
Seats:4
Additional:Not Bulletproof
Honk noise:Beep Beep
Car is not convertible
Car is not Automatic

	 */
	
	

	 
	

		

	
	






}
		
		
		
	
	



