package oct10domainAssessment;

import java.util.Scanner;

public class Distance {
	
	public static void calcDistance(int t1,int t2) {
		int u = 10;
		int a = 5;
		
		int distanceTravel1 = u*t1 + ((a*t1*t1)/2);
		int distanceTravel2 = u*t2 + ((a*t2*t2)/2);
		System.out.println(distanceTravel1);
		System.out.println(distanceTravel2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t1,t2;
		
		System.out.println("Enter the Number");
		t1 = sc.nextInt();
		t2 = sc.nextInt();
		
		calcDistance(t1, t2);
	}

}
