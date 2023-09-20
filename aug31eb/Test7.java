package aug31eb;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);	
		}
		
		System.out.println("Reverse Number: ");
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);	
			
		}
		System.out.println("Table: ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Table Num");
		
		int no = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(no*i);	
		}
		
		

	}

}
