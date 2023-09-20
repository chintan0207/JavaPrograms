package zPracticeHW;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//Take side of a square from user and print area and perimeter of it.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side lenth of square: ");
		int side = sc.nextInt();
		
		int area = side*side;
		int peri = 4 * side;
		
		System.out.print("The area of square is: " + area);
		System.out.print("\nThe perimeter of square is: " + peri);
		

	}

}
