package chapter8;

public class Truck extends Vehicle {
	
	private String truckload;
	
	public Truck(String manu, String color, String truckload ,double speed ) {
		
		super(manu, color , speed); //Car constructor // initialize manufacturer(i.e manu) and colour(i.e. color) to superclass vehicle
		this.truckload = truckload;
	
	
	}
	public String gettruckload() { //Gets job
		
		return truckload; //Enter your code here
		}
		
	public void settruckload(String truckload) { //Sets job
			
			this.truckload=  truckload;  //Enter your code here
			
		  }
	public String sound() { //returns the sound of a car "Vroom Vroom"
		return sound();
		}
		
	public String vehicleType() { //returns the vehicle type "Car"
    return vehicleType();
		}
	 public String toString()
        {
            return(super.getManufacturer()+ truckload + super.getColor() + this.sound() + this.vehicleType());
        }
          
	
}


	
