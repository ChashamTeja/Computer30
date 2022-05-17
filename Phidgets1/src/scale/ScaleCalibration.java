/*
Program: truck.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*///Add Phidgets Library
package scale;
import com.phidget22.*;
import java.util.Scanner;

public class ScaleCalibration {
    //Define
    static VoltageRatioInput scale;
    
    public static double getAverage()throws Exception{
        double average = 0;
        int count = 0;
        System.out.println("Averaging Value...");
        while(count < 64){
            average += scale.getVoltageRatio();
            count += 1;
            Thread.sleep(20);
        }
        return average/count;
    }
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        
        //Create
        scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Set data interval to minimum
        scale.setDataInterval(scale.getMinDataInterval());
        
        //ask the user to clear the scale 
        System.out.println("Make sure nothing is on your scale and press Enter");
        scan.nextLine();
        double offset = getAverage();
        
        //ask the user  to enter weight of their placed object
        System.out.println("Place a known weight on the scale, type the weight in kilograms and press Enter");
        double knownWeight = Double.parseDouble(scan.nextLine());
        
        double measuredWeight = getAverage();
        
        //display scope 
        double slope = knownWeight / (measuredWeight - offset);
        
        System.out.println("Your new slope value is: " + Math.round(slope));
    }    
}

/* Screen Dump

Make sure nothing is on your scale and press Enter

Averaging Value...
Place a known weight on the scale, type the weight in kilograms and press Enter
0.194

Averaging Value...
Your new slope value is: 27510
 
*/

  