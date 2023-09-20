package sep18Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the two numbers: ");
		
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		
		c=a+b;
		System.out.println("Add: " + c);
	}

}
