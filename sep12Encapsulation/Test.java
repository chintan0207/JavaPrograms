package sep12Encapsulation;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(207,"Ram","Pune");
		
		s1.setCity("Gujrat");
		
		System.out.println("City: " + s1.getCity());
		
		Student s2 = new Student(208,"sahil","Gujrat");
		
		System.out.println(s2);
		
		Student s3 = (Student) s2.clone();
		System.out.println(s3);
		
		

	}

}
