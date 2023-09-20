package sep14Practice;

import java.util.Scanner;

//9.	1-2+3-4+5-6... n = ?

public class S9 {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n:");
		
		int n = sc.nextInt();
		
	    double sum = 0;
    
	    for(int i=1; i<=n;i=i+2) {
	    	
	     System.out.print(i + "-" + (i+1));
	     
	     sum = sum + (i-(i+1));
	     
	     if(i<n) {
	    	  System.out.print("+");
	     }
	     	     
	    }
	    System.out.print(" "+"="+" ");
		System.out.println(sum);
		
		sc.close();
		
	}

}
