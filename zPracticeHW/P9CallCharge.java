package zPracticeHW;

import java.util.Scanner;

public class P9CallCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers of calls: ");
		
		int numOfCall = sc.nextInt();
		
		if(numOfCall < 200) {
			int charge = numOfCall * 2;
			System.out.println("Bill Amount(Rs.2 per call): " +"Rs."+charge);
		}
		else
		 {
			int charge = numOfCall * 3;
			System.out.println("Bill Amount(Rs.3 per call): "+"Rs." + charge);
		}
		

	}

}
