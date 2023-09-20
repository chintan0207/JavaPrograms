package aug30ed;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
	
		
        int empId;
		
		String empName;
		
		String empAddress;
		
	    double empSalary;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter employee id:");
	    
	    empId = sc.nextInt();
	    
	    System.out.println("Enter employee name:");
	    
	    empName = sc.next();
	    
	    System.out.println("Enter employee address:");
	    
	    empAddress = sc.next();
	    
	    System.out.println("Enter employee salary:");
	    
	    empSalary = sc.nextDouble();
	    
	    System.out.println("Employee id:" + empId + "\nEmployee Name:" + empName + 
	    		"\nEmployee Address:" + empAddress + "\nEmployee Salary:" + empSalary);
	  
	   

	}

}
