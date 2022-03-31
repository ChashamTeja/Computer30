package chapter8.Account;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Select option either 1 or 2 :\n 1.Personal Account \n2.Buisness Account :");
		String sel=input.next();
		if(sel.equals("1")) {
		
		PersonalAccount bank=new PersonalAccount(9999, "Ben", "Gates", "Alberta", "Calgary", "Cornerstone", "T19 3S4", 0);

	    System.out.println(bank.toString());
		}
		else if(sel.equals("2")){
			BuisnessAccount buis2 = new BuisnessAccount(588300, "Elon","Tusk", "Alberta", "Calgary", "bund", "Sunridge", 0);
		    
			System.out.println(buis2.toString());
			
		}
	
	
	
	}
	
	
	

}
