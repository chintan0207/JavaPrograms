package sep6ed;

import java.util.Scanner;

public class Reactangle {
	
	int length,breadth,area;
	
	public Reactangle()  //default
	{
		length = 12;
		breadth = 9;
	}
	
	public Reactangle(int length,int b)  //parameterized constructor
	{
		this.length = length;
		breadth = b;
	}
	
	public void area() {
		area = length * breadth;
		System.out.println("Area of the Reactangle : " + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reactangle rect = new Reactangle();
		rect.area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Reactangle rectangle = new Reactangle(l,b);
		rectangle.area();
		
	}

}
