package zPracticeHW;

import java.util.Scanner;

public class P10Methodarea {
	
	Scanner sc = new Scanner(System.in);
	
	public void circleArea() {
		System.out.println("Enter the Radious of circle ");
		double r = sc.nextDouble();
		double carea = 3.14 * r *r;
		System.out.println("Area of circle: " + carea );
	}
		
	public double squareArea(double s) {
		double sarea = s*s;
		return sarea;
	}
	
	public void rectangleArea(int length,int breadth) {
		
		int rarea = length * breadth;
		System.out.println("Area of rectangle: " + rarea );
	}
	
	public static float triangleArea(float base, float height) {
		
		float tarea = 0.5f * base * height;
		return tarea;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P10Methodarea a = new P10Methodarea();
		
		a.circleArea();
		System.out.println("Enter the side of Square: ");
		double s = sc.nextDouble();
		double sa= a.squareArea(s);
		System.out.println("Area of Square: " + sa );
		a.rectangleArea(10, 5);
		float ta = triangleArea(10,20);
		System.out.println("Area of Triangle: " + ta );
		

	}

}
