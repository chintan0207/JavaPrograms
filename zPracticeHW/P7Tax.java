package zPracticeHW;

import java.util.Scanner;

public class P7Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Annual Income: ");
		
		double income = sc.nextDouble();
		if(income < 25000) {
			double tax = income * 10 /100 ;
			System.out.println("Total Amount of Tax(10%): " + tax);
		}
		else {
			double tax = income * 15 /100 ;
			System.out.println("Total Amount of Tax(15%): " + tax);
		}
			
	}

}
