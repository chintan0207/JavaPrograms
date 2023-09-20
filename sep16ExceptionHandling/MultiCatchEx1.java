package sep16ExceptionHandling;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a[] = new int[5];
			a[7] = 12/0;
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}

	}

}
