package sep12Encapsulation;

public class Student implements Cloneable {
	
	private int rollNumber;
	private String name,city;
	

	public Student() {
		super();
	}
	
	public Student(int rollNumber, String name, String city) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
