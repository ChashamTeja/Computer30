package chapter8.University;

public class Staff extends UEmployee { //Start of Staff class inherits UEmployee

	private String jobtitle; //create a member private variable for job title

	

    public Staff(String name, double salary, String jobtitle) { //Constructor which takes in name, salary and job
		
    	super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
		
		this.jobtitle = jobtitle;//sets departmentName to it's member variable department name
	}
			public String getJobtitle() { //Gets job title
				
				return jobtitle; //return job title
				}
				
			public void setJobtitle(String jobtitle) { //Sets job title
					
					this.jobtitle=  jobtitle;  
					
				  }
			//return toString to display the info
			 public String toString()
		        {
		            return(super.getName()+ jobtitle + super.getSalary());
		        }
		          
					
				
			}