/*

Program: Scale.java          Last Date of this Revision: May 4 , 2022

Purpose: Measure your scale offset

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
//Add Phidgets Library
package scale;

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
  