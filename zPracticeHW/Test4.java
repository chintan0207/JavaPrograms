package zPracticeHW;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 10 Array Elements: ");
		
		int a[]=new int[10];
		
		for(int i=0; i<10; i++) {
			
			a[i]= sc.nextInt();
		}
		
		System.out.println("The Array is: " + Arrays.toString(a));
		
		for(int j=0; j<a.length; j++) {
			System.out.println("The Array elements is: " + a[j]);
		}

	}

}
