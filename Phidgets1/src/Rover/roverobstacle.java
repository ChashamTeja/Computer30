/*
Program: roverobstacle.java          Last Date of this Revision: May 2 , 2022




Purpose: Make the rover turn 180 when an obstacle is close by

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package Rover;

//Add Phidgets Library
import com.phidget22.*;

public class roverobstacle {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(1000);
        rightMotors.open(1000);
        sonar.open(1000);

        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 300 ) {
           	
            	
            	leftMotors.setTargetVelocity(1);
             rightMotors.setTargetVelocity(1);
             
             

             
             Thread.sleep(800);
             
             
          	
         	leftMotors.setTargetVelocity(0);
          rightMotors.setTargetVelocity(0);
          
          

          
          Thread.sleep(5000);
             
                
            }
            

           
              
             
        
        }
        
    
    }
                
                
        
                
                
            } 
        
    
    
  