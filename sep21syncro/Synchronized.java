package sep21syncro;

public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintTable printTable = new PrintTable();
		Thread1 t1 = new Thread1(printTable);
		Thread2 t2 = new Thread2(printTable);
		
		t1.start();
		t2.start();

	}

}

class Thread1 extends Thread{
	PrintTable printTable;

	public Thread1(PrintTable printTable) {
		super();
		this.printTable = printTable;
	} 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable.print(5);
	}
}

class Thread2 extends Thread{
	PrintTable printTable;

	public Thread2(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable.print(3);
	}
	
}

class PrintTable{
	
	public void print(int n) {
		synchronized (this) {
			
			for(int i=1; i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					
					e.printStackTrace();
				}
				System.out.println(n*i);
			}
		}
	}
}
