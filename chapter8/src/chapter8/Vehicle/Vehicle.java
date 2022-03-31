package chapter8.Vehicle;

public abstract class Vehicle { //Start of abstract superclass Vehicle
	
	private String manufacturer;//Create members variable for manufacturer and colour of type string.


	private String colour ;
	
	private double speed = 0.0;
	
	private int seats=0;

public Vehicle(String manufacturer, String colour,double speed,int seats) { //Vehicle constructor which takes i manufacturer

	this.manufacturer = manufacturer;

	this.colour = colour;
	
	this.speed = speed;
	
	this.seats=seats;
}

	public String getManufacturer() {//Gets the manufacturer
	
	
	return this.manufacturer;//Enter your code here
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
	public void setSpeed(double speed) { //Sets the color of the vehicle
		
		this.speed = speed;
	}
	public double getSpeed() {
		
		return speed;
	}
public void setseats(int seats) { //Sets the color of the vehicle
		
		this.seats = seats;
	}
	public int getseats() {
		
		return seats;
	}
	
	

	
	public String toString() {
		
		String vehicleString = "Model: " + manufacturer + "\nSpeed: " + speed + "\nColor: " + colour+"\nSeats:"+seats;
		return vehicleString;
	}
	
	public abstract String honk();
	public abstract String Convertible();
	public abstract String NotConvertible();
	public abstract String Automatic();
	public abstract String notAutomatic();
	
	
	}

	 
