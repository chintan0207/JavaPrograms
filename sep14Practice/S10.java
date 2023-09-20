package sep14Practice;

//10.	1/1! + 2/2! +  ... + n/n! = ?

import java.util.Scanner;

public class S10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner scanner = new Scanner(System.in);
   	 System.out.print("Enter a value for n: ");
   	int n = scanner.nextInt();
       double sum = 0;
       double factorial = 1;

       for (int i = 1; i <= n; i++) {
           factorial *= i;
           sum += i / factorial;
       }

       System.out.println("Sum of the series for 1/1! + 2/2! +....+ n/n! = "  + sum);
   

	}

}
