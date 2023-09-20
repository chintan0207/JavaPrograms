package sep20MultiTreading;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
	
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("executing Thread : " + getName());
		}
	}
	
	public static void main(String[] args) {
		
		 Thread1 t1 = new  Thread1();
		 t1.setName("Thread1");
		 t1.start();
		 
		 Thread1 t2 = new  Thread1();
		 t2.setName("Thread2");
		 t2.start();
	}

}
