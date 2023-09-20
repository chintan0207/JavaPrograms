package sep7to8ed;

public class Employee extends Person {

	float perDay,workingDays,salary;
	
	public Employee() 
	{
		super(); //to call super class constuctor
		perDay = 1500;
		workingDays = 23;
	}
	
	public Employee(int id, String name, Address address,BDate bdate, float perDay, float workingDay)
	{
		super(id,name,address,bdate);
		this.perDay=perDay;
		this.workingDays=workingDay;
	}
	
	public void calculate() {
		salary = workingDays*perDay;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary: " +salary);
	}
}
