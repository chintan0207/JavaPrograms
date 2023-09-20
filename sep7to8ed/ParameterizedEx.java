package sep7to8ed;

public class ParameterizedEx {
	
	public void add(int a,int b)   //perameterized method without Return
	{
		System.out.println("Addition: " + (a+b));
	}
	
	public int sub(int x, int y)    //perameterized method with Return
	{
		int z = x-y;
		return z;
	}
	
	public static void mul(float a, float b) //static
	{
		System.out.println("Mul: " + (a*b));
	}
	
	static {                                    //static block
		System.out.println("It will call before the main method");
	}
	public static void main(String[] args) {
		

		ParameterizedEx paraEx = new ParameterizedEx();
		paraEx.add(10,3);
		int r = paraEx.sub(45, 15);
		System.out.println("sub: " + r);
//		System.out.println("sub: " + paraEx.sub(45, 15));
		mul(2.5f, 5.0f);
	}

}
