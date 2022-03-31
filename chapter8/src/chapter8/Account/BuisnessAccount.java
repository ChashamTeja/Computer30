package chapter8.Account;

public class BuisnessAccount extends Account {
	private final int w=10;

	public BuisnessAccount(double bal, String fName, String lName, String str, String city, String st, String zip,int f) {
		super(bal, fName, lName, str, city, st, zip);
		// TODO Auto-generated constructor stub
		f=w;
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
