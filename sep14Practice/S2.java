package sep14Practice;

import java.util.Scanner;

//2.	1/1 + 1/2 + 1/3 +   + 1/n = ?

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
			
		  System.out.print("Enter the n = ");
		  
		  double n = sc.nextInt();
		  double sum = 0;
			
		   for(int i=1;i<=n;i++) {
		       
	           sum = sum + (1/i);
		    }
		   
		   System.out.println("Sum of the Series 1/1 + 1/2 + 1/3 +  +1/n = " + sum);
	  }

}
