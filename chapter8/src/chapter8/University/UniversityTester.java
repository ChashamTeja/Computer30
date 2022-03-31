package chapter8.University;

import java.util.Scanner;

public class UniversityTester {


	
	
	public static UEmployee assign() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("");
		System.out.println("Enter employees Name:");
		String name = input.next();
		
	
		
		System.out.println("Enter employees Salary:");
		int salary = input.nextInt();
		
		System.out.println("Enter employee type: Faculty or Staff :");
		String EmpType;
		EmpType = input.next();
		
		
		
		if(EmpType.equalsIgnoreCase("Faculty")) {
			
			System.out.println("Enter Department name:");
			String departmentName = input.next();
			
			return new Faculty("Name:"+ name, salary , "\t Department:"+departmentName + ",\t Salary=");
		}
		else
		{
			
			System.out.println("Enter job title:");
			String jobtitle = input.next();
			return new Staff("Name:"+name  , salary ,  "\t Job:" + jobtitle + "\t Salary=");
					
  }
}	
	
	//adding main class and employees 
		public static void main(String[] args) {
			
			UEmployee emp1;
			UEmployee emp2;
			UEmployee emp3;
		
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			
			
			
			System.out.println("University Employees:\t\t\t\t");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
  }	
}

/* Screen Dump
Enter employees Name:
James
Enter employees Salary:
200000
Enter employee type: Faculty or Staff :
Staff
Enter job title:
Teacher
University Employees:				
Name:James	 Job:Teacher	 Salary=200000.0


 */