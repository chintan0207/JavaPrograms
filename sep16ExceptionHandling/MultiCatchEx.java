package sep16ExceptionHandling;

//order of catch block block must be most specific to most general
//at a time only 1 exception occurs and  1 catch block will execute

public class MultiCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int a[] = new int[5];
			a[7] = 10/0;
		
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of code.....");
	}

}
