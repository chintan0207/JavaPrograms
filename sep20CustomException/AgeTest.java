package sep20CustomException;

public class AgeTest  {
	
	public static void checkAge(int age) throws AgeException {
		// TODO Auto-generated method stub
		
		if (age>=18) {
			System.out.println("Eligible for Voting");
		}
		else 
			throw new AgeException("Not Eligible Invalid Age");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			checkAge(15);
			
		} catch (AgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code....");
	}

	

}
