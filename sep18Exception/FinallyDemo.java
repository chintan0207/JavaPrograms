package sep18Exception;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("case 1: where Exception doesn't occur");
       
		try {
			int a = 45/9;
			System.out.println("div: " + a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1: It is always executed");
		}
		System.out.println("rest of code....");
		
		System.out.println("--------------------------------------------");
		System.out.println("case 2: where Exception occurs and handled");
		
		try {
			int b = 25/0;
			System.out.println("Div: " + b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2: It is always executed");
		}
		System.out.println("rest of code....");
		
		System.out.println("--------------------------------------------");
		
		System.out.println("case 3: where Exception occurs and does not handled");
		
		try {
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3: finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
