package aug31eb;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int k=0;
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter number of rows:");
		
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++,k=0) {
			for(int space=1;space<=row-i;space++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}

	}

}
