package sep11edAbstraction;

public class Pnj extends Bank {
   
	float I;
	
	@Override
	public void getInterest(int amount,int time) {
		
		I = (amount * time * 8.3f)/100;
		
		System.out.println("Punjab Bank's Interest: " + I);
	}

}
