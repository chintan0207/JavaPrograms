package zPracticeHW;

import java.util.Scanner;

public class P8Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Purchase Amount: ");
		
		int amount = sc.nextInt();
		
		if(amount >= 10000) {
			double discount = amount * 10 /100 ;
			System.out.println("Total Discount amount(10%): " + discount);
		}
		else {
			double discount = amount * 2 /100 ;
			System.out.println("Total Discount Amount(2%): " + discount);
		}
			
	}

}
