/*
Program: Car.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Vehicle;

public class Car extends Vehicle  {
	
	private String  engine ;//additional feature string only for car class
	
	private String  bulletproof ;//additional feature string only for car class
	
	
	public Car(String manufacturer, String colour,double speed ,int seats,String engine,String bulletproof ) {
		
		super(manufacturer , colour ,speed,seats);//Car constructor // initialize manufacturer ,colour,speed and seats  to superclass vehicle
		this.bulletproof = bulletproof;
		this.engine = engine;
		
	

	}
	
	public String getbulletproof() { //gets bulletproof 
		return bulletproof;
	}
	public void setbulletproof(String bulletproof) { //sets bulletproof 
		this.bulletproof = bulletproof;
		
}
	public String getengine() { // get engine name
		return engine;
	}
	public void setengine(String engine) { // set engine name 
		this.engine = engine;
		
}
	
	
	
	
	
	
	//return the all the variables 
		
	 public String toString()
     {
         return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nEngine:"+this.getengine()+"\nSeats:"+ super.getseats() + "\nAdditional:"+ this.bulletproof );
     }
	
	 
	 //given different values to all the abstract classes 
	@Override
	public String honk() 
	{
		return "Beep Beep";
		
	}

	@Override
	public String Convertible() {
		
		return "Car is convertible";
	}

	@Override
	public String Automatic() {
		// TODO Auto-generated method stub
		return "Car is Automatic";
	}
	

	@Override
	public String NotConvertible() {
		// TODO Auto-generated method stub
		return "Car is not convertible";
	}

	@Override
	public String notAutomatic() {
		// TODO Auto-generated method stub
		return "Car is not Automatic";
	}
	

	
	

}
