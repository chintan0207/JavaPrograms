package sep6ed;

import java.util.Scanner;

public class Interest {
	
	int P,R,N,I;
	
	public Interest()
	{
		P = 1000;
		R = 15;
		N = 2;
	}
    
	public Interest(int p,int r,int n) {
		P=p;
		R=r;
		N=n;
	}
	public void simpleInterest() {
		I = P*R*N/100;
		System.out.println(" Simple Interest: " + I);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interest si1 = new Interest();
		si1.simpleInterest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the P,R,N: ");
		
		int p = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		Interest si2 = new Interest(p,r,n);
		si2.simpleInterest();

	}

}
