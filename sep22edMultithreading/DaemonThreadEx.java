package sep22edMultithreading;

public class DaemonThreadEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DaemonThreadEx t1 = new  DaemonThreadEx();
		 DaemonThreadEx t2 = new  DaemonThreadEx();
		 DaemonThreadEx t3 = new  DaemonThreadEx();

		 t1.setDaemon(true);
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread working");
		}
		else {
			System.out.println("User Thread working");
		}
	}

}
