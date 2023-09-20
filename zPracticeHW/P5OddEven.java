package zPracticeHW;

import java.util.Scanner;

public class P5OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		int num;
		char choice;
		
		do {
			System.out.println("Enter the Number: ");
			
			 num = sc.nextInt();
			
			if(num%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
		    
			System.out.println("Press y to continue");
			
			choice = sc.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');

	}

}
