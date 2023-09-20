package sep1ed;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		int n, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the Array elements: ");
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			
			sum = sum + a[i];
			
		}

		System.out.println("The Array is: " + Arrays.toString(a));
		System.out.println("The sum is: " + sum);
	}

}
