package sep21syncro;

public class PriorityEx extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityEx t1 = new PriorityEx();
		t1.setName("Chintan");
		t1.setPriority(MIN_PRIORITY);
		
		PriorityEx t2 = new PriorityEx();
		t2.setName("Raj");
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name : " +getName() + " Thread Priority :" + getPriority());
	}

}
