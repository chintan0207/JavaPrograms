package zPracticeHW;

import java.util.Scanner;

public class P6PositiveNZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner sc = new Scanner(System.in);
		
		int num;
		char choice;
		
		do {
			System.out.println("Enter the Number: ");
			
			 num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("Entered Number is Negetive");
			}
			else if(num > 0) {
				System.out.println("Entered Number is Positive");
			}
			else{
				System.out.println("Entered Number is Zero");
			}
		    
			System.out.println("Press y to continue");
			
			choice = sc.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');

	}

}
