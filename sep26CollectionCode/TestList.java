package sep26CollectionCode;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
	
	//	List <data-type> list1 = new ArrayList();
	//	List <data-type> list2 = new LinkedList();
	//	List <data-type> list3 = new Vector();
	//	List <data-type> list4 = new Stack();
	
	void ArrayListDemo() {
		
		System.out.println("ArrayList Demo: ");
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Blue");
		a1.add("Pink");
		a1.add("Orange");
		a1.add("Green");
		a1.add(null);
		a1.add("Green");
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

  void IntArrayListDemo() {
		
		System.out.println("IntArrayList Demo: ");
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(125);
		a1.add(89);
		a1.add(9874);
		a1.add(45);
		a1.add(null);
		a1.add(5000);
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TestList t1 = new  TestList();
		 TestList t2 = new  TestList();
		 
		 t1.ArrayListDemo();
		 t2.IntArrayListDemo();
		 
	}

}
