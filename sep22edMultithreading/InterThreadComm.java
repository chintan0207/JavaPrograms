package sep22edMultithreading;


class Customer{
	private int balance = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " going to withdraw Rs." + amount);
		if(balance<amount) {
			System.out.println("Less Balance. Waiting for deposite...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("withdraw completes.Balance : Rs." + balance);
	}
	
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+ " going to deposite Rs. " + amount);
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " Deposit completes.Balance : Rs." + balance);
		notify();
	}
}

public class InterThreadComm {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		new Thread("chintan")
		{
			public void run() {customer.withdraw(15000);};
		}.start();
		
		new Thread("Ram")
		{
			public void run() {customer.deposit(5000);};
		}.start();
		
	}

}







