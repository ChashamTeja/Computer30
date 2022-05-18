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
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() > 200000) {
                //Object detected! Stop motors
                
                
        
                
                
            } 
        }
    }
}
  