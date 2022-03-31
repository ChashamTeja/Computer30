package chapter8.Vehicle;

// connects truck class to super class vehicle
public class Truck extends Vehicle {
	
	private String truckload;//private string for truck class 
	
	public Truck(String manufacturer, String colour,double speed ,int seats,String truckload ) {
		
		super(manufacturer , colour ,speed,seats); //constructor // initialize manufacturer , colour ,speed and seats  to superclass vehicle
		
		this.truckload = truckload;//set truckload string to variable truckload
	
	//returning truckload string
	}
	public String gettruckload() { //get truckload form user
		
		return truckload; 
		}
		
	public void settruckload(String truckload) { 
			
			this.truckload=  truckload;  //set truckload
			
		  }
	//return the all the variables 
	 public String toString()
        {
		 return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nSeats:"+ super.getseats() +"\ntruck load:"+ this.truckload );
        }
	 //given different values to all the abstract classes 
	 @Override
		public String honk()
		{
			return "Beep Beep";
			
		}

		@Override
		public String Convertible() {
			
			return "Truck is convertible";
		}

		@Override
		public String Automatic() {
			// TODO Auto-generated method stub
			return "Truck is Automatic";
		}
		

		@Override
		public String NotConvertible() {
			// TODO Auto-generated method stub
			return "Truck is not convertible";
		}

		@Override
		public String notAutomatic() {
			// TODO Auto-generated method stub
			return "Truck is not Automatic";
		}
	
}


	
