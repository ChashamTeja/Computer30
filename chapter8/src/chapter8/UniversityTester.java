package chapter8;

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
			
			return new Faculty("Name:"+ name, salary , "\t Department:"+departmentName);
		}
		else
		{
			
			System.out.println("Enter job title:");
			String jobtitle = input.next();
			return new Staff("Name:"+name,  salary ,"\t Job:" + jobtitle);
					
  }
}	
	
	//adding main class and employees 
		public static void main(String[] args) {
			
			UEmployee emp1;
		
			emp1 = assign();
			
			
			System.out.println("University Employees:/t/t/t/t");
			System.out.println(emp1);
		
  }	
}