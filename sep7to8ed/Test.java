package sep7to8ed;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Person();
//		p1.display();
//		
//		Person p2 = new Person(182, "Riya", new Address("101 On Tower", "Bapat Road", "Mumbai", "MH", "India","40012"),new BDate(2,02,2002));
//        p2.display();
//		
//		Employee emp1 = new Employee();
//		emp1.calculate();
//		emp1.display();
//		
//	
//		Employee emp3 = new Employee(105, "Radha", new Address("405 om Tower","Karve Road",
//				"Mubmbai","MH","India","400052"),new BDate(5,6,2000), 1600, 25);
//		emp3.calculate();
//		emp3.display();
//		
//		Student s1 = new Student();
//		s1.total();
//		s1.display();
//		
//		Student s2 = new Student(105, "Shyam", new Address("405 om Tower","Karve Road",
//				"Mubmbai","MH","India","400052"),new BDate(5,6,2000),50,75,89);
//		s2.total();
//		s2.display();
		
//		Grade g1 = new Grade(205,"chirag",new Address("605 om Tower","Karve Road",	"Mubmbai","MH","India","400052"),new BDate(5,6,2000),78,35,65);
//		
//		g1.total();
//		g1.display();
//		
//		Grade g2 = new Grade();
//		
//		g2.total();
//		g2.display();
		
//		SalesPerson sp1 = new SalesPerson();
//		
//		sp1.calculate();
//		sp1.display();
//		
//        SalesPerson sp2 = new SalesPerson(208, "Dhruv", new Address("908 Ghej Dukan faliya","chikhli-atgam road",
//				"Navsari","GJ","India","396521"),new BDate(5,6,2000), 1700, 25, 65);
//		
//		sp2.calculate();
//		sp2.display();
		
		
		Scanner sc = new Scanner(System.in);
		
		Customer c1 = new Customer();
		c1.calculate();
		c1.display();
		
		
		Customer c2 = new Customer(208, "Dhruv", new Address("908 Ghej Dukan faliya","chikhli-atgam road",
			"Navsari","GJ","India","396521"),new BDate(5,6,2000),"Bags",1200,11);
		c2.calculate();
		c2.display();
		
	}

}
