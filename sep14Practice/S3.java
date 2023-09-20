package sep14Practice;

import java.util.Scanner;

public class S3 {
	
//3.  1 8 27 64 ....n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n: ");
		
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			
			System.out.print(i*i*i + " ");
		}

	}

}
