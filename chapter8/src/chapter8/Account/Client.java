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

public class Client {
	public static void main(String[] args) {
         
		//	//added scanner program to get info form the user 
		Scanner input = new Scanner(System.in);
		
		//print the available options for the user to choose from
		System.out.println(" Select option either 1 or 2 :\n 1.Personal Account \n2.Buisness Account :");
		String sel=input.next();
		if(sel.equals("1")) {
		
		    //set the users info linking to personal account 
			
			PersonalAccount bank=new PersonalAccount(9999, "Ben", "Gates", "Alberta", "Calgary", "Cornerstone", "T19 3S4", 0);
	        
			//print personal account 
		    
			System.out.println(bank.toString());
			
		}
		
		//else statement if option 2 is selected 
		
		else if(sel.equals("2")){ 
		
			//set the users info linking to Buisness account 
			
			BuisnessAccount buis2 = new BuisnessAccount(5883000, "Gates ","private limited", "Alberta", "Calgary", "bund", "Sunridge", 0);
		    
			//print business account 
			
			System.out.println(buis2.toString());
			
		}
	
	
	
	}
	
	
	

}



/* Screen Dump
 *  

 Select option either 1 or 2 :
 1.Personal Account 
2.Buisness Account :
1
Ben Gates
Alberta
Calgary, Cornerstone  T19 3S4
Current balance is $9,999.00

 */


