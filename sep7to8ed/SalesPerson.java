package sep7to8ed;

public class SalesPerson extends Employee{
	int sales;
	float commission;
	public SalesPerson()
	{
		super();
		sales= 80;
	}
	public SalesPerson(int id, String name, Address address,
			           BDate bdate, float perDay, float workingDay,int sales)
	{
		super(id,name,address,bdate,perDay,workingDay);
		this.sales = sales;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();	
		if(sales >= 90) 
		{
			commission = salary * 20/100;
		}
		else if(sales >= 75) {
			commission = salary * 10/100;
		}
		else if(sales >= 60) {
			commission = salary * 5/100;
		}
		else{	
			commission = 0;
		}	
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Comission for sales: " + commission + "\nTotal Salary: " +
		(commission+salary));
	}
}
