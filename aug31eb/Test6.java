package aug31eb;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1: ");
		
		int num1 = sc.nextInt();
		
        System.out.println("Enter the num2: ");
		
		int num2 = sc.nextInt();
		
		int choice;
		
		do {
			
			 System.out.println("Addition");
			 System.out.println("Subtraction");
			 System.out.println("Multiplication");
			 System.out.println("Division");
			 System.out.println("Exit");
			 System.out.println("Enter Choice");
			 
			 choice = sc.nextInt();
			 
			 switch(choice) {
			 
			 case 1: 
				 int add = num1 + num2 ;
				 System.out.println("The adition is: " + add);
				 break;
			 case 2: 
				 int sub = num1 - num2 ;
				 System.out.println("The adition is: " + sub);
				 break;		 
			 case 3: 
				 int mul = num1 * num2 ;
				 System.out.println("The adition is: " + mul);
				 break;
			 case 4: 
				 int div = num1 / num2 ;
				 System.out.println("The adition is: " + div);
				 break;
			 case 5: 
	
				 System.out.println("BYe Bye ...... " );
				 break;	 
			 }
			 
			
		}while(choice!=5);
		

	}

}
