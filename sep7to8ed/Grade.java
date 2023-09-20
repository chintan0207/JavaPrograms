package sep7to8ed;

public class Grade extends Student {

	String grade;
	
	public Grade()
	{
		super();
	}
	
	public Grade(int id, String name, Address address,BDate bdate,int maths,int hindi,int eng)
	{
		super(id,name,address,bdate,maths,hindi,eng);
	}
	
	@Override
	public void total() {
		// TODO Auto-generated method stub
		super.total();
		if(percentage>=75) {
			grade="A+";
		}
		else if(percentage>=60) {
			grade="A";
		}
		else if(percentage>=50) {
			grade="B+";
		}
		else if(percentage>=40) {
			grade="B";
		}
		else {
			grade="fail";
		}
		
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade: " + grade);
	}

}
