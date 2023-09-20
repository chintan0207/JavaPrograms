package aug31eb;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Row: ");
		
		int Row = sc.nextInt();
		
		for(int i=1; i<=Row; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*" + " ");
				//System.out.print(j+" ");
				//System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}
