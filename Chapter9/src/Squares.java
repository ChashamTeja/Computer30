/*
Program: squares.java          Last Date of this Revision: April 30 , 2022




Purpose: Create a Squares application that stores the square of an element’s index in an integer array of 5 elements.
For example, the third element, which has index 2, should store 4. The application should then display the
value of each element in the array.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

public class Squares {

    public static void main(String[] args) {

        //create an instance of integer array to a variable squared
        //set the default array size to 5
        int[] squared = new int[5];
        
        //use for-loop to iterate through our integer array
        //initialize int i to 0
        //check if i is less than the length of the array
        //increment int i variable by 1 if the conditional statement is true
        
        for (int i = 0; i < squared.length; i++) {
            //assign the i as index to the squared integer array
            //call the square(int) method and pass the integer i value
            //to make the index to be square
            squared[i] = square(i);
        }
        
        //call the static method print(int[]) to display all the square numeric
        //value of the array index
        print(squared);
    }


    /**
    
     * return integer value which is a square value of the integer parameter
     * i.e. 2, 2x2 = 4
     */
    public static int square(int i) {
        return i * i;
    }
    
    /**
    * print the square value of the integer array index
     */
    public static void print(int[] squared) {
        for (int i = 0; i < squared.length; i++) {
            System.out.println("Square value of " + i + " is " + squared[i]);
        }
    }
}

/* Screen Dump
Square value of 0 is 0
Square value of 1 is 1
Square value of 2 is 4
Square value of 3 is 9
Square value of 4 is 16

 */