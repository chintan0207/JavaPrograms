package sep7to8ed;

public class Person {

	int id;
	String name;
	Address address;
	BDate bdate;
	
	public Person() {
		id = 101;
		name = "Raj";
		address = new Address();
		bdate = new BDate();
	}
	
	public Person(int id,String name, Address address,BDate bdate)
	{
		this.id=id;
		this.name=name;
		this.address = address;
		this.bdate = bdate;
	}
	
	public void display() {
		System.out.println("\nId: " + id );
		System.out.println("Name: " + name );
		address.disply();
		bdate.display();
	}
}
