package sep16ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a = 15, b=0,d=5;
			int c = a/b;
			int h = d/b;
			System.out.println(c);
			System.out.println(h);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println(e);
			System.err.println(e);
			e.printStackTrace();	
			
		}
		
		System.out.println("rest of code......");

	}

}
