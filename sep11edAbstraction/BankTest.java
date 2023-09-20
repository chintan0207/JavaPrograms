package sep11edAbstraction;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the Principle: ");
		
		int amount = sc.nextInt();
		
		System.out.println("Enter the Time in years : ");
		
		int time = sc.nextInt();
		
		Sbi s1 = new Sbi();
		
		s1.getInterest(amount,time);
		
		Pnj p1 = new Pnj();
		
		p1.getInterest(amount, time);

	}

}
