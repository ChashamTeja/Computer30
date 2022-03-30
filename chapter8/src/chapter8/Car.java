package chapter8;

public class Car extends Vehicle  {
	
	private String  engine ;
	
	private String  bulletproof ;//Create member variable convertible of type boolean
	
	
	public Car(String manufacturer, String colour,double speed ,int seats,String engine,String bulletproof ) {
		
		super(manufacturer , colour ,speed,seats);
		this.bulletproof = bulletproof;
		this.engine = engine;
		
	

	}
	
	public String getbulletproof() {
		return bulletproof;
	}
	public void setbulletproof(String bulletproof) {
		this.bulletproof = bulletproof;
		
}
	public String getengine() {
		return engine;
	}
	public void setengine(String engine) {
		this.engine = engine;
		
}
	
	
	
	
	
	
	 
		
	 public String toString()
     {
         return("Model:"+ super.getManufacturer()+"\nTop speed:"+super.getSpeed()+ "\nColour:" + super.getColour() +"\nEngine:"+this.getengine()+"\nSeats:"+ super.getseats() + "\nAdditional:"+ this.bulletproof );
     }

	@Override
	public String honk() 
	{
		return "Beep Beep";
		
	}

	@Override
	public String Convertible() {
		
		return "Car is convertible";
	}

	@Override
	public String Automatic() {
		// TODO Auto-generated method stub
		return "Car is Automatic";
	}
	

	@Override
	public String NotConvertible() {
		// TODO Auto-generated method stub
		return "Car is not convertible";
	}

	@Override
	public String notAutomatic() {
		// TODO Auto-generated method stub
		return "Car is not Automatic";
	}
	

	
	

}
