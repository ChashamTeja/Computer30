/*
Program: truck.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

//Add Phidgets Library
import com.phidget22.*;
import java .util.Scanner;

public class Scale2 {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        Scanner input = new Scanner(System.in);
        
        //prompt the user to choose between offset and weight 
        System.out.println("Select an option \n 1.Get offset \t2. Cculate weight");
       
        String sel=input.next();
        
        
        //if the user picks offset display offset 
        if(sel.equals("1")) {
        	
        	while(true) {
        	
        		System.out.println("Calculating offset" );
        		
        		System.out.println("Offset Value: " + scale.getVoltageRatio());
             
        	 
        	    Thread.sleep(250);
        
        	}
        
         }
         
        
        else if (sel.equals("2")) {
        	
        	//Use your Offset Value
            double offsetValue = 9.378930558161312E-5;
            
            //Use your Phidgets
            while(true){

                //Calculate Weight (kg)
                double weight = 4700 * (scale.getVoltageRatio()  - offsetValue);
                
                //Display Weight
                
                double grams = weight * 1000;
                
                System.out.println(String.format("%.3f grams", grams));      
                
                Thread.sleep(250);
        	
        }
        
    
    
        
        
        
        }
    }    
}
  