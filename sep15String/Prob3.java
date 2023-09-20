package sep15String;

import java.util.Scanner;

public class Prob3 {

//3.program to count no. of words in a String
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String s = sc.nextLine();
		
		 String s1[] = s.split(" ");
		 
		 for(String i: s1) {
			 System.out.println(i);
		 }
		 System.out.println("count of Words: " + s1.length);
		

	}

}
