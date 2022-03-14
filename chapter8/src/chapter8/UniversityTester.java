package chapter8;

import java.util.Scanner;

public class UniversityTester {


	
	
	public static UEmployee assign() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("");
		System.out.println("Enter employees first name");
		String name = input.next();
		
	
		
		System.out.println("Enter employees salary");
		int salary = input.nextInt();
		
		System.out.println("Enter employee type: Faculty or Staff");
		String EmpType;
		EmpType = input.next();
		
		
		
		if(EmpType.equalsIgnoreCase("Faculty")) {
			
			System.out.println("Enter Department name:");
			String departmentName = input.next();
			
			return new Faculty(name, salary , departmentName);
		}
		else
		{
			
			System.out.println("Enter job title");
			String jobtitle = input.next();
			return new Staff(name, salary , jobtitle);
					
  }
}	
	
	//adding main class and employees 
		public static void main(String[] args) {
			
			UEmployee emp1;
		
			emp1 = assign();
			
			
			System.out.println("University Employees:");
			System.out.println(emp1);
		
  }	
}