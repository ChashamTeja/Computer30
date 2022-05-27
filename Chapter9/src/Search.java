/*
Program: Search.java          Last Date of this Revision: March 5 , 2022




Purpose: Add a static method to the Search class that performs a linear search on a String array. The linear() method
should overload the existing method, have parameters for accepting a String array and a String variable,
and return an int indicating the position of the String. Create a FindName application that uses the Search
class. FindName should prompt the user for names to fill an array and then prompt the user for the name
to find

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
public class Search {
	/**
	 * Returns the index of the element numToFind. -1 returned if element not found.
	 * pre: none post: index of numToFind has been returned. -1 has been returned if
	 * element not found.
	 */
	public static int linear(int[] array, int numToFind) {
		int index = 0;
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}
		if (array[index] == numToFind) {
			return (index);
		} else {
			return (-1);
		}
	}
	public static int linear(String[] array, String strToFind) {
//		Initializing index with 0
		int index = 0;
//		Run the loop indefinitely
		while (true) {
//			If the end of the array is reach, get out of the loop
			if (index == array.length) {
				break;
			}
//			If the current array element is equal to strTofind in terms
//			of character sequence
			if (array[index].equals(strToFind)) {
//				return the index
				return index;
			}
//			If not, then increment the index
			index++;
		}
//		If the control reaches here, it means the element is not found
		return -1;
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