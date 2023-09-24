package sep22edMultithreading;

public class AccountDanger implements Runnable{
	
	private Account acct = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDanger aDanger = new AccountDanger();
		Thread th1 = new Thread(aDanger);
		Thread th2 = new Thread(aDanger);
		
		th1.setName("Chintan");
		th2.setName("Harshad");
		
		th1.start();
		th2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5;i++)
		{
			makeWithdraw(1000);
		}
	}

	synchronized void makeWithdraw(int amount) {
		if (acct.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName() + " is going to Withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes withdraw. Balance : " + acct.getBalance());
		}
		
		else {
			
			System.out.println("not enough balance in account for " + Thread.currentThread().getName() + " Balance :" + acct.getBalance());
			
		}
	}
}






