package zPracticeHW;

import java.util.Scanner;

public class P3AmountTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Annual Income: ");
		
		double income = sc.nextDouble();
		double tax = income * 12 /100 ;
		
		System.out.println("Total Amount of Tax: " + tax);
		
		
	}

}
