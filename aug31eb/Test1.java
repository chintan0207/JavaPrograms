package aug31eb;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number i :");
		
		int i = sc.nextInt();
		
		System.out.println("Enter Number j :");
		
		int j = sc.nextInt();
		
		System.out.println("Enter Number k :");
		
		int k = sc.nextInt();
		
		if(i > j && i > k) {
			System.out.println("i is the highest value");
		}
		if(j > i && j > k) {
			System.out.println("j is the highest value");
		}
		if(k > j && k > i) {
			System.out.println("k is the highest value");
		}
	}

}
