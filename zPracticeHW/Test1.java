package zPracticeHW;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// Take two integer inputs from user. First calculate the sum of two then product of two.
		// Finally, print the sum and product of both obtained results.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int n2 = sc.nextInt();
		
		int sum = n1 + n2;
		int product = n1 * n2;
		
		System.out.print("The sum is: " + sum);
		System.out.println("\nThe Product is: " + product);
		

	}

}
