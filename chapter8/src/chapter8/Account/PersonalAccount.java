/*
Program: PersonalAccount.java          Last Date of this Revision: March 5 , 2022



Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
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
	
	


