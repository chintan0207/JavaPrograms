package sep12Abstraction;

public interface Showable {

	double PI = 3.14;  //public static final
	
	void calculate();  //public abstract
	
	default void square(int a)
	{
		System.out.println("Square: " +(a*a) );
	}
	
	static void cube(int x)
	{
		System.out.println("Cube: " +(x*x*x) );
	}

	void print();
}
