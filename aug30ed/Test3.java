package aug30ed;

class MotherBoard{
	
	static class USB{
		
		int Usb = 2;
		int Usb2 = 3;
		String TotalPorts() {
			
			return "Total Ports:" + (Usb+Usb2);
		}
	}


public class Test3 {

	public static void main(String[] args) {
		
       MotherBoard.USB m1=new MotherBoard.USB();
		
		System.out.println(m1.TotalPorts());
	}

}}
