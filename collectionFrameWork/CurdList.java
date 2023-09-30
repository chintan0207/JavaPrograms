package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{

	private int id;
	private int age;
	private String name;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	Person(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id: ");
		id = sc.nextInt();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		
	}
	
	
	public Person(int id, int age, String name) 
	{
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}

public class CurdList 
{
	
	List<Person> p1 = new ArrayList<>();
	
	void createRecord() 
	{
//		p1.add(new Person(2,21,"Ram"));
//		p1.add(new Person(3,32,"Dhaval"));
		
		System.out.println("Enter Data: id, age, name");
		p1.add(new Person());
		
//		System.out.println("Record created");
	}
	
	void display()
	{
		System.out.println("Display.....");
		for(Person people: p1) {       
			System.out.println(people);
		}
	}
	
	
	
	void updateRecord() 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("List of Record after Updation: ");
		
		System.out.println("Enter the name whose age ti be updated");
		String a= sc.next();
		for(Person people: p1) 
		{
			if(people.getName().equals(a)) {
				System.out.println("Enter updated age: ");
				people.setAge(sc.nextInt());
			}
			 
			// System.out.println(people);
		}

		
		//System.out.println("Record updated");
	}
	
//	void readRecord() 
//	{
//		System.out.println("List of Record: ");
//		for(Person people: p1) 
//		{
//			System.out.println(people);
//		}
//		System.out.println("Record Read");
//	}
	
	void deleteRecord() 
	{
		
			Person personToRemove = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name to be Removed");
			String a = sc.next();
			for(Person people: p1) 
			{
				try {
					
				if(people.getName().equals(a)) 
				{
					personToRemove = people;
					continue;
				}
				}catch(Exception e) {
					
				if(personToRemove != null)
				{
					p1.remove(personToRemove);
					System.out.println(people);
				}
				}
				   System.out.println(people);
			}
			
		
		//Read record after delete
		System.out.println("List of Record after deletion: ");
	
		System.out.println("Record Deleted");
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CurdList c1 = new CurdList();
		char choice = 'Y';
	
		while(choice == 'Y' || choice == 'y'){
			System.out.println("Enter 1 for create: ");
			System.out.println("Enter 2 for Display: ");
			System.out.println("Enter 3 for Update: ");
			System.out.println("Enter 4 for Delete: ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1: c1.createRecord();
			break;
			case 2: c1.display();
			break;
			case 3: c1.updateRecord();
			break;
			case 4: c1.deleteRecord();
			break;
			default: System.out.println("Enter correct choice");
			break;
			}
			System.out.println("Enter Y or y to continue");
			choice = sc.next().charAt(0);
		}
			
	}

}







