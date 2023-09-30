package sep28Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int age,id;
	String name;
	
	public Student(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student st)
	{
		if(age==st.age)
			return  0;
		else if(age>st.age)
			return 1;
		else 
			return -1;
		
	}
}

public class TestComparable {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(21,101,"sudha"));
		list.add(new Student(10,102,"sandhya"));
		list.add(new Student(11,103,"madhu"));
		list.add(new Student(31,105,"suha"));
		
		Collections.sort(list);
		for(Student student:list)
		{
			System.out.println(student);
		}
		

	}

}
