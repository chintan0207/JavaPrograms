package zPracticeHW;

import java.util.Scanner;

public class P4license {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		char choice;
		
		do {
			System.out.println("Enter your Age: ");
			
			 age = sc.nextInt();
			
			if(age>=18) {
				System.out.println("Eligable for licence");
			}
			else {
				System.out.println("Not Eligable");
			}
		    
			System.out.println("Press y to continue");
			
			choice = sc.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');
		
	}

}
