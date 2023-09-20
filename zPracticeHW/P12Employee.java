package zPracticeHW;

import java.util.Scanner;

//create a class Employee with the following data members and member functions.
//Data members : empName,empCode, basicSalary, allowance, grossSalary, tax, netSalary
//Member Functions :
//void accept() : to input empName, empCode, basicSalary
//void allow() : to calc and store allowance as 55% of basicSalary.  
//void gross() : to calc and store grossSalary as sum of basicSalary and allowance
//void tax() : to calc and store tax as 12% of grossSalary
//void net() : to calc and store netSalary as grossSalary less tax.
//void display() : to display salary slip containing empCode, empName, basicSalary, tax and netSalary
//void main() : create an object of a class and execute all methods in logical order.

public class P12Employee {
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
	
		System.out.println("Enter the Employee Name: ");
		String empName = sc.next();
		System.out.println("Enter the Employee Code: ");
		int empCode = sc.nextInt();
		System.out.println("Enter the Employee BasicSalary: ");
		int basicSalary = sc.nextInt();
	}
	
	public void allow(int bs) {
		 int a = bs * 55/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 P12Employee emp = new  P12Employee();
		 emp.accept();
		 
	}

}
