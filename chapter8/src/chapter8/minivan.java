package chapter8;

public class minivan extends Vehicle {
	
	private String luggage;
 
	public  minivan (String manufacturer, String colour,double speed ,int seats,String luggage) {
		
		super(manufacturer , colour ,speed,seats); //Car constructor // initialize manufacturer(i.e manu) and colour(i.e. color) to superclass vehicle
		this.luggage = luggage;
	
	
	}
	public String getluggage() { //Gets job
		return luggage; //Enter your code here
		}
		
	public void setluggage(String luggage) { //Sets job
			
			this.luggage= luggage;  //Enter your code here
			
		  }
	
	 public String toString()
        {
		 return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nSeats:"+ super.getseats() +"\nLuggage Space"+luggage );
        }
	
	 
	 
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


