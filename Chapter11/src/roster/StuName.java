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


	/**
	 * @param firstName
	 * @param lastName
	 */
	public StuName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return (firstName+ " " + lastName);
	}

	
	

}