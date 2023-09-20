package sep12Abstraction;

public class InterfaceImpl implements Showable, Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//PI = 4.20; compile error
		double r = 10;
		System.out.println("Area of circle: " +(PI*r*r));

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub    
		System.out.println("Achieved multiple Interface");
	}
	
	public static void main(String[] args) {
		InterfaceImpl obj = new InterfaceImpl();
		obj.calculate();
		obj.square(8);
		Showable.cube(5);
		obj.print();
	}

}
