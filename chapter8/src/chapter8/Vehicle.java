package chapter8;

public abstract class Vehicle { //Start of abstract superclass Vehicle
	
	private String manufacturer="";//Create members variable for manufacturer and colour of type string.


	private String colour = "";
	
	private double speed = 0.0;

public Vehicle(String manufacturer, String color,double speed) { //Vehicle constructor which takes i manufacturer

	this.manufacturer = manufacturer;

	this.colour = colour;
	
	this.speed = speed;
}

	public String getManufacturer() {//Gets the manufacturer
	
	
	return this.manufacturer;//Enter your code here
	}
	
	public void setManufacturer(String manufacturer) { //Sets the manufacturer name
	
		this.manufacturer = manufacturer;
	}

	public String getColor() { //Gets the color of the vehicle
	
		return this.colour;
	}
	public void setColor(String color) { //Sets the color of the vehicle
	
		this.colour = colour;
	}
	public void setSpeed(double speed) { //Sets the color of the vehicle
		
		this.speed = speed;
	}
	public double getSpeed() {
		
		return speed;
	}
	

	
	public String toString() {
		
		String vehicleString = "Manufacturer: " + manufacturer + "\nSpeed: " + speed + "\nColor: " + colour;
		return vehicleString;
	}
	
	
	}

	 
