package aug30ed;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int no1,no2,choice,result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num:");
		
		no1 = sc.nextInt();
		
		System.out.println("Enter Second num:");
		
		no2 = sc.nextInt();
		
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
		

	}

}
