package chapter8;

public class Car extends Vehicle  {
	
	private int numberofPassengers = 0;//Create member variable convertible of type boolean
	
	
	public Car(String manufacturer, String color,double speed , boolean convert) {
		
		super(manufacturer , color ,speed);
	

	}
	
	public int getNumberofPassengers() {
		return numberofPassengers;
	}
	public void setNumberofPassengers(int passengers) {
		numberofPassengers = passengers;
		
}
	
	
	
	public String sound() { //returns the sound of a car "Vroom Vroom"
		return sound();
		}
		        
	public String vehicleType() { //returns the vehicle type "Car"
    return vehicleType();
		}
	
	 
		
	 public String toString()
     {
         return(super.getColor() + numberofPassengers + super.getManufacturer() + this.sound() + this.vehicleType());
     }

}
