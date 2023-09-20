package sep7to8ed;

public class Student extends Person {
	
	int maths,hindi,eng,total,percentage;
	
	public Student()
	{
		super();     //to call super class construtor
		maths = 90;
		hindi=85;
		eng=75;
		
	}
	
	public Student(int id, String name, Address address,BDate bdate,int maths,int hindi,int eng)
	{
		super(id,name,address,bdate);
		this.maths = maths;
		this.hindi = hindi;
		this.eng = eng;
	}
	
	public void total()
	{
		 total = maths + hindi +eng;
		 percentage = total*100/300;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Total marks: "+ total+"/300" +"\nPercentage: " + percentage+" %");
	}

}
