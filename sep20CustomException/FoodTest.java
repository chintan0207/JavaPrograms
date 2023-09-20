package sep20CustomException;

public class FoodTest {
	
	public static void checkfruit(String fruitName)throws BadFoodException{
		if(fruitName.equalsIgnoreCase("Mango") || fruitName.equalsIgnoreCase("Apple"))
		{
			System.out.println("I like " + fruitName);
		}
		else 
			throw new BadFoodException("I don't like " + fruitName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkfruit("Grapse");
		} catch (BadFoodException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("rest of the code....");
		
	}

}
