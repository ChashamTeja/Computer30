package chapter8.Account;

//extend class to account class
public class PersonalAccount extends Account {

	



	public PersonalAccount(double bal) {

		super(bal, null, null, null, null, null, null);//get bal string from super class
		



	}



	public void withdrawal(double amt) {

		// We have access to getBalance already because it is a type of Account.

		

       // if balance is below 100 withdraw 2 dollars thru if statement
		if (amt <= super.getBalance() - 2 ) 
		{

			// Call to our base to withdrawal

			super.withdrawal(amt);



			// Withdrawal another 2 if it is lower than the minimum

			if (super.getBalance() < 100) {

				super.withdrawal(2.00);
				System.out.println("Not enough money in account.");
			}

		} else {

			System.out.println("Not enough money in account.");

		}

	}


    // get balance form user 
	public boolean equals(PersonalAccount p) {



		if (p.getBalance() == super.getBalance()) {

			return (true);

		} else {

			return (false);

		}

	}


    //return personal account string 
	public String toString() {

		String personacctString;



		personacctString = "The balance is " + super.getBalance();

		return (personacctString);

	}

}