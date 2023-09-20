package zPracticeHW;

import java.util.Scanner;

public class P11Arithmatic {
	
	double a,b;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Number: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
	}
	
	public void add() {
		System.out.println("Addition: " + (a+b));
	}
	public void sub() {
		System.out.println("Subtraction: " + (a-b));
	}
	public void mul() {
		System.out.println("Multiplication: " + (a*b));
	}
	public void div() {
		System.out.println("Division: " + (a/b));
	}
	
	
	public static void main(String[] args) {
	
		P11Arithmatic a = new P11Arithmatic();
		
		a.accept();
		a.add();
		a.sub();
		a.mul();
		a.div();

	}

}
