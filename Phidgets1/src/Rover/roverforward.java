package Rover;
//Add Phidgets Library
import com.phidget22.*;

public class roverforward {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(1000);
        rightMotors.open(1000);

        //Move forward at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
        

        //Wait for 1 second
        Thread.sleep(1800);//gggggg
        
        
        
      
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        
        

        
        Thread.sleep(650);//jjjjjjj
        
        
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
      //Move forward at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
        

        //Wait for 1 second
        Thread.sleep(1800);
        
        
        
      
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        
        

        
        Thread.sleep(660);
        
        
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
        
      //Move forward at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
        

        //Wait for 1 second
        Thread.sleep(1830);
        
        
        
      
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        
        

        
        Thread.sleep(650);
        
        
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        
      //Move forward at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
        

        //Wait for 1 second
        Thread.sleep(1830);
        
        
        
      
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
       
        
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        
        

        
        Thread.sleep(1785);
        
        ,
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        

        //Wait for 1 second
        Thread.sleep(1000);
        
        

        
      
       
    }
}
