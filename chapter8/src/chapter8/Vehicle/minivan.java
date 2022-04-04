/*
Program: Minivan.java          Last Date of this Revision: March 5 , 2022



Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Vehicle;

//connects minivan class to super class vehicle
public class minivan extends Vehicle {
	
	private String luggage;//private string for minivan class 
 
	public  minivan (String manufacturer, String colour,double speed ,int seats,String luggage) {
		
		super(manufacturer , colour ,speed,seats); //Car constructor // initialize manufacturer ,colour,speed and seats  to superclass vehicle
		this.luggage = luggage;
	
	
	}
	public String getluggage() { //Gets luggage from the user 
		return luggage; 
		}
		
	public void setluggage(String luggage) { //Sets luggage value
			
			this.luggage= luggage;  
			
		  }
	//return the all the variables 
	 public String toString()
        {
		 return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nSeats:"+ super.getseats() +"\nLuggage Space"+luggage );
        }
	
	 //given different values to all the abstract classes 
	 
	 public String honk() 
		{
			return "Beep Beep";
			
		}

		@Override
		public String Convertible() {
			
			return "Minivan is convertible";
		}

		@Override
		public String Automatic() {
			// TODO Auto-generated method stub
			return "Minivan is Automatic";
		}
		

		@Override
		public String NotConvertible() {
			// TODO Auto-generated method stub
			return "Minivan is not convertible";
		}

		@Override
		public String notAutomatic() {
			// TODO Auto-generated method stub
			return "Minivan is not Automatic";
		}
		

	
}


