/*
Program: Stuname.java          Last Date of this Revision: March 5 , 2022




Purpose: Create a StuName class that has
member variables firstName and lastName and a toString() member method.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

package roster;

import java.io.Serializable;

public class StuName implements Serializable {

	/**
	 * This id is used in the serialization process across different platforms.
	 */
	
	
	//Attributes/ Fields
	private String firstName;
	
	private String lastName;

	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public StuName() {
		super();
	}


	
	public StuName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	
	 // return the firstName
	 
	public String getFirstName() {
		return firstName;
	}


	
	 // set firstname
	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	
	 //return the lastName
	 
	public String getLastName() {
		return lastName;
	}


	// lastName to set
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return (firstName+ " " + lastName);
	}

	
	

}