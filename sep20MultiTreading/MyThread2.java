package sep20MultiTreading;

public class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("executing Thread: " + Thread.currentThread().getName());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 t1 = new MyThread2();
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.setName("Thread 1");
		t3.setName("Thread 2");
		
		t2.start();
		t3.start();
	      
		
	}
	
	

}
