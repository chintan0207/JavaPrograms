package aug30ed;

class Student{
	
	int rollNo = 100;
	
	String stuName = "Rohan";
}

public class InstanceVariable {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		//instance variable-if u want to aceess data from outside of the class 
		//u need to create object of class
		
		System.out.println("Roll no:" + s1.rollNo +"\nStudent Name:" + s1.stuName);
		

	}

}
