package chapter8.Vehicle;

public abstract class Vehicle { //Start of abstract superclass Vehicle
	
	private String manufacturer;//Create  variable for manufacturer type string.


	private String colour ;//Create  variable for manufacturer type string.
	
	private double speed = 0.0;//Create  variable for manufacturer type string.
	
	private int seats=0;//Create  variable for seats.

public Vehicle(String manufacturer, String colour,double speed,int seats) { //Vehicle constructor which takes i manufacturer

	this.manufacturer = manufacturer;//sets manufacturer string to manufacturer variable

	this.colour = colour;//sets colour string to colour variable
	
	this.speed = speed;//sets speed string to speed variable
	
	this.seats=seats;//sets seats string to seats variable
}

	public String getManufacturer() {//Gets the manufacturer
	
	
	return this.manufacturer;
	}
	
	public void setManufacturer(String manufacturer) { //Sets the manufacturer name
	
		this.manufacturer = manufacturer;
	}

	public String getColour() { //Gets the color of the vehicle
	
		return this.colour;
	}
	public void setColour(String color) { //Sets the color of the vehicle
	
		this.colour = colour;
	}
	public void setSpeed(double speed) { //Sets the speed  of the vehicle
		
		this.speed = speed;
	}
	public double getSpeed() {//Gets the speed of the vehicle
		
		return speed;
	}
public void setseats(int seats) { //Sets the seats of the vehicle
		
		this.seats = seats;
	}
	public int getseats() {//Gets the seats of the vehicle
		
		return seats;
	}
	
	

	//return to string to the tester for outputting the info
	public String toString() {
		
		String vehicleString = "Model: " + manufacturer + "\nSpeed: " + speed + "\nColor: " + colour+"\nSeats:"+seats;
		return vehicleString;
	}
	//abstract classes for car ,truck and minivan
	public abstract String honk();
	public abstract String Convertible();
	public abstract String NotConvertible();
	public abstract String Automatic();
	public abstract String notAutomatic();
	
	
	}

	 
