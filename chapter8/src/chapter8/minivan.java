package chapter8;

public class minivan extends Vehicle {
	
	private String seats;
 
	public  minivan (String manufacturer, String color, String seats,double speed) {
		
		super(manufacturer , color, speed); //Car constructor // initialize manufacturer(i.e manu) and colour(i.e. color) to superclass vehicle
		this.seats = seats;
	
	
	}
	public String getseats() { //Gets job
		return seats; //Enter your code here
		}
		
	public void setseats(String seats) { //Sets job
			
			this.seats= seats;  //Enter your code here
			
		  }
	public String sound() { //returns the sound of a car "Vroom Vroom"
		return sound();
		}
		
	public String vehicleType() { //returns the vehicle type "Car"
    return vehicleType();
		}
	 public String toString()
        {
            return(super.getManufacturer()+ seats + super.getColor() + this.sound() + this.vehicleType());
        }
          
	
}


