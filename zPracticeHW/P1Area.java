package zPracticeHW;

import java.util.Scanner;

public class P1Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Circle Radius: ");
		int r = sc.nextInt();

		System.out.println("Enter the length and breadth of Rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the base and height of Triangle: ");
		int base = sc.nextInt();
		int height = sc.nextInt();
		
		float carea = 3.14f * r *r;
		int rarea = l*b;
		float tarea = 0.5f * base * height;
		
		System.out.println("Area of Circle: " + carea);
		System.out.println("Area of Rectangle: " + rarea);
		System.out.println("Area of Triangle: " + tarea);

			

	}

}
