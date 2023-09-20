package sep7to8ed;

public class MethodOverLoding {
	
	public void add(int x,int y)
	{
		System.out.println("Add of numeric data: " + (x+y));
	}

	public void add(double a, double b, double c)
	{
		System.out.println("Add of decimal numbers: " + (a+b+c));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoding overlodingex = new MethodOverLoding();
		
		overlodingex.add(12,15);
		overlodingex.add(4.5, 5, 3.7);
		

	}

}
