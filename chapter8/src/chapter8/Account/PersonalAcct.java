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

public class PersonalAcct extends Account{

	  private double MIN = 100;

	   

	  public PersonalAcct (double bal , double MIN){

	    super (90999, "DAD", "DASD","DADSADAD", "SDADD", "RWETERTE", "Wdwqdqwd");

	    MIN=MIN;

	  }

	  

	   

	   public void withdrawal(double amt, double balance) {

	   if (amt <= balance) {

	    balance -= amt;

	   if (balance < MIN) {

	    balance = balance - 2; 

	   } else {

	    System.out.println("Not enough money in account.");

	   }

	 }

	}

	 

	  public boolean equals (Object p){

	    PersonalAcct testObj = (PersonalAcct) p;

	     

	    if(testObj.getBalance() == super.getBalance()){

	      return(true);

	    }else{

	      return (false);

	    }

	  }

	 

	  public String toString(){

	    String personacctString;

	     

	    personacctString = "The balance is" + super.getBalance();

	    return(personacctString);

	  }

	}

