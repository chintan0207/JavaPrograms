package sep22edMultithreading;

public class Account {
	
	private int balance = 5000;
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public int getBalance() {
		return balance;
	}
	
	

}
