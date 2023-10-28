package oct21;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
        
        int num = n;
        int count = 0;
        int rem;
        double result = 0;
        
        while(n>0) {
        	count++;
        	n=n/10;
        }
        
        System.out.println("count of digits in a number" + count);
        n = num;
        while(n>0) {
        	rem = n%10;
        	result = result + Math.pow(rem, count);
        	n=n/10;
        }
        if(result==num) {
        	System.out.println("it is armstrong no");
        }
        else 
        	System.out.println("it is not a armstrong num");
	}

}
