package aug30ed;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int no1,no2,choice,result;
		char ch1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter first num:");
		
		no1 = sc.nextInt();
		
		System.out.println("Enter Second num:");
		
		no2 = sc.nextInt();
		
		System.out.println("For Addition 1");
		System.out.println("For Subtraction 2");
		System.out.println("For Multipication 3");
		System.out.println("For Division 4");
		
		System.out.println("Enter your choice:");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			result = no1+no2;
			System.out.println(result);
			break;
			
		case 2:
			result = no1-no2;
			System.out.println(result);
			break;
		case 3:
			result = no1*no2;
			System.out.println(result);
			break;
		case 4:
			result = no1/no2;
			System.out.println(result);
			break;
			
		default:
			System.out.println("Wrong choice");
					
		}
		
		System.out.println("Press y to continue");
		ch1 = sc.next().charAt(0);
		}while(ch1 == 'y' || ch1 == 'Y');
		

	}

}
