import java.util.Scanner;

public class findname {
	
	public static void main(String[] args) {
		//Setting the number of inputs to store
		
		final int MAX = 5;
    
		//Initializing the String array
		String[] hayStack = new String[MAX];
		
        //Initializing Scanner class to get user input
		Scanner input = new Scanner(System.in);
       
		//Looping through 0 to length-1, to put values into the array
		
		for (int i = 0; i < hayStack.length; i++) {
			System.out.printf("Input element %d: ", i);
			hayStack[i] = input.nextLine();
		}
		
		/* prompt user for a String to search for */
		System.out.print("Enter String to search: ");
		String needle;
		needle = input.nextLine();
		
		/* Search for string and notify user of string location */
		int location;
		
		location = Search.linear(hayStack, needle);
		
		if (location == -1) {
			
			System.out.println("Sorry, string not found in array.");
		
		} 
		else {
			
			System.out.println("First occurrence is element " + location);
		
		}
	}
}


/* Screen Dump
Input element 0: dsd
Input element 1: sdsdsd
Input element 2: svdvv
Input element 3: vcvxcv
Input element 4: cvv
Enter String to search: svdvv
First occurrence is element 2

 */