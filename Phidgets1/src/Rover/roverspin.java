package Rover;
//Add Phidgets Library
import com.phidget22.*;

public class roverspin {
    public static void main(String[] args) throws Exception {

    	//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(1);
        rightMotors.setChannel(0);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        //Turn in one direction
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);

     Thread.sleep(2000);
       
     //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        //Turn in one direction
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(1);
       
        
    }
}