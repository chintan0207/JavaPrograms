package sep6ed;

import java.util.Scanner;

public class Default {
	
	float base,height;
	int length,breadth;
	
	public void accept()  //default method
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tringle Base and Height: ");
		base = sc.nextFloat();
		height = sc.nextFloat();
		System.out.println("Enter the Rectangle length and breadth: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	
	public void area()    //default without return-type
	{
		float a = 0.5f * base * height;
		System.out.println("Area of Triangle: " + a);
	}
	
	public float areaOfRectangle()   //default with return-type
	{
		float a = length * breadth;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default d = new Default();
		d.accept();
		d.area();
		float a = d.areaOfRectangle();
		System.out.println("Area of Rectangle: " + a);
		

	}

}
