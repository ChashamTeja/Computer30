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

public class phidgetsscale {
    public static void main(String[] args) throws Exception{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Phidgets
        while(true){
            System.out.println("Offset Value: " + scale.getVoltageRatio());
            Thread.sleep(250);
        }
    }    
}
  