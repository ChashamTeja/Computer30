/*
Program: BusinessAccount.java          Last Date of this Revision: April 4 , 2022



Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Account;

//extend businessAccount  to account class
public class BuisnessAccount extends Account {

	private double MIN = 500;



	public BuisnessAccount(double bal) {

		super(bal, null, null, null, null, null, null);//connect constructor to super class s



	}



	public void withdrawal(double amt) {

		// We have access to getBalance already because it is a type of Account.

		double balance = getBalance();



		if (amt <= balance) {

			// Call to our base to withdrawal

			super.withdrawal(amt);



			// Withdrawal another 2 if it is lower than the minimum

			if (getBalance() < MIN) {

				super.withdrawal(10.00);

			}

		} else {

			System.out.println("Not enough money in account.");

		}

	}


     // get balance after withdrawal 
	public boolean equals(BuisnessAccount p) {



		if (p.getBalance() == super.getBalance()) {

			return (true);

		} else {

			return (false);

		}

	}


    //return string 
	public String toString() {

		String businessacctString;


        
		businessacctString = "The balance is " + super.getBalance();

		return (businessacctString);

	}

}
