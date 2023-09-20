package zPracticeHW;

import java.util.Scanner;

public class P2simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("P = principle,\nR = Rate of Interest in %vper year \nT = Time in year"
				+ "\nI = Interest ");

		System.out.println("Enter the value of P");
	    int P = sc.nextInt();
	    System.out.println("Enter the value of R");
	    int R = sc.nextInt();
	    System.out.println("Enter the value of T");
	    int T = sc.nextInt();
	    
	    float I = P*R*T/100;  
	    System.out.println("Simple Interest: " + I);
	    
	}

}
