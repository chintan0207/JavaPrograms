package sep1ed;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of array:");
		
		int size=sc.nextInt();
		
		int inputarray[]=new int[size];
		
		System.out.println("Enter the array elements:");
		for( int i=0;i<size;i++) {
			
			inputarray[i]=sc.nextInt();
			
		}
		
		//toString=Returns a string representation of the contents of the specified array.
		System.out.println("Array elements are:"+Arrays.toString(inputarray));
		
		
		

	}

}
