package chapter8.Account;
import java.text.NumberFormat;

public class PersonalAccount extends Account {
	
	private final int w=2;
	
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip,int d) {
		super(bal, fName, lName, str, city, st, zip);
		d=w;
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double y)
	{
		if (super.getBalance()>=y) {
			super.deposit(super.getBalance()-y);
		}
		else {
			super.deposit(super.getBalance()-y-w);
		}
	}
}
	
	


