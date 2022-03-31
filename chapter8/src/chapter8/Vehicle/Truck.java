package chapter8.Vehicle;

public class Truck extends Vehicle {
	
	private String truckload;
	
	public Truck(String manufacturer, String colour,double speed ,int seats,String truckload ) {
		
		super(manufacturer , colour ,speed,seats); //constructor // initialize manufacturer and colour to superclass vehicle
		
		this.truckload = truckload;
	
	
	}
	public String gettruckload() { 
		
		return truckload; 
		}
		
	public void settruckload(String truckload) { 
			
			this.truckload=  truckload;  
			
		  }
	
	 public String toString()
        {
		 return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nSeats:"+ super.getseats() +"\ntruck load:"+ this.truckload );
        }
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


	
