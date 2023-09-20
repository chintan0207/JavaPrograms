package zPracticeHW;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//Take 10 integer inputs from user and store them in an array and print them on screen.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");	
		int n = sc.nextInt();
		
		System.out.println("Enter Array the Elements: ");
		
		int c[]= new int[n];
		
		for(int i=0; i<n; i++) {
			
		   c[i]= sc.nextInt();
		   
		}
		
		int sum = 0;
		System.out.println("The Array is : " + Arrays.toString(c));	
		
		for(int j=0; j<c.length; j++) {

			 sum = sum + c[j];
			
		}
		System.out.println("The length of Array is: " + c.length);
		System.out.println("The sum of Array is: " + sum);
		
		
	}

}
