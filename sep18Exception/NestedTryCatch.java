package sep18Exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
			try {
				int[] a = new int[5];
				a[9] = 25;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("others lines");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
