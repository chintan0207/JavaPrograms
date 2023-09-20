package sep6ed;

public class ThisConstructor {
	
	String name;
	
	public ThisConstructor()
	{
		this("Chintan");
		name = "Raj";
	}
	
	public ThisConstructor(String name)
	{
		this.name = name;
	}
	public void print() {
		System.out.println("My name is: " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisConstructor c = new ThisConstructor();
		c.print();

	}

}
