/*
Program: Client.java          Last Date of this Revision: March 5 , 2022



Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8.Account;
import java.util.Scanner;
import javax.swing.*;

public class Client {
	public static void main(String[] args) {
         
		//	//added scanner program to get info form the user 
		Scanner input = new Scanner(System.in);	
		
		
		// print customer info 
		System.out.println("Customer info");
		 
		Customer c1 = new Customer("Elon", "Gates", "2314 redstone way NE", "Calgary", "Canada", "T3Z 9V7");
		
		System.out.println(c1);
		
		
		
	
		System.out.println("\nSelect from the provided options \n1.Personal account \t2. Business Account \nEnter option (1 or 2):");
		
		
		
		String sel=input.next();
		
		//if user select option 1 displays the current balance 
		if(sel.equals("1")) {
		
			PersonalAccount acct = new PersonalAccount(200.00);
	
			System.out.println(acct);
			
			System.out.println("\nWithdrawing $CAD 250 : ");
	
			System.out.println("\n$ 2 should be charged as account balance is below $100: ");
	        
			//amount we want to withdraw 
			acct.withdrawal(150);
	        
			
			//final balance after all the charges 
			System.out.println("\nAccount balance: " + acct.getBalance());
		

		

		
		}
		//if user select option 2 displays the current balance 
		else if(sel.equals("2")){
		
		
				
			BuisnessAccount acct3 = new BuisnessAccount(180000.00);
	
			
			System.out.println("Account balance: " + acct3.toString());
	
			
	
			System.out.println("\nWithdrawing U$SD 200 : ");
	
			
			System.out.println("\n$ 10 should be charged as account balance is below $500: ");
	       
			//amount we want to withdraw 
			
			acct3.withdrawal(200);
			
			//final balance after all the charges 
	
			System.out.println("\nAccount balance: " + acct3.toString());
		}
	
	
	
	}
}
	
	
	





/* Screen Dump
 *  

Customer info
First name: Elon	Last name:Gates
Street:	2314 redstone way NE
Calgary,Canada , T3Z 9V7


Select from the provided options 
1.Personal account 	2. Business Account 
Enter option (1 or 2):
1
The balance is 200.0

Withdrawing $CAD 250 : 

$ 2 should be charged as account balance is below $100: 
Not enough money in account.

Account balance: 48.0

Buisness;
Account balance: The balance is 180000.0

Withdrawing U$SD 200 : 

$ 10 should be charged as account balance is below $500: 

Account balance: The balance is 179800.0


 */


