package sep14Practice;

import java.util.Scanner;

public class S4 {

//4.	1/1 + 2/4 + 3/9 + ...n/n = ?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n: ");
		
		int n = sc.nextInt();
		double sum=0;
		
		for(int i = 1;i<=n;i++) {
			
			int square = i*i;
			sum += i/square;
			
		}

		System.out.println("Sum of the Series: 1/1 + 2/4 + 3/9 + ...n/n = " + sum);

	}

}
