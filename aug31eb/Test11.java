package aug31eb;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Row of triangle: ");
		
		  int rows = sc.nextInt(); // Number of rows in the triangle
	        
	        for (int i = rows; i >= 1; i--) {
	            // Print spaces
	            for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }
	            
	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            
	            // Move to the next line
	            System.out.println();
	        }

	}

}
