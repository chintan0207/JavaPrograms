package sep11edAbstraction;

import java.util.Scanner;

public class Sbi extends Bank {

	float I;
	
	@Override
	public void getInterest(int amount,int time) {
		
		I = (amount * time * 9.5f)/100;
		
		System.out.println("Sbi Bank's Interest: " + I);
	}

}
