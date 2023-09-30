package sep28Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Prac1Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //List list1 = new ArrayList();
		
		ArrayList list1 = new ArrayList();  //non generic
		list1.add(101);
		list1.add("Ram");
		list1.add(85.33);
		list1.add(null);
		list1.add(101);
		System.out.println(list1);
		
		ArrayList <String> l2= new ArrayList<String>();   // generic
		
		l2.add("abc");
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("Ram");	
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		System.out.println("accessing list elements using for each loop:");
		for (String string : l2)
		{
			System.out.print(string+" ");
		}
		
		
		System.out.println("\naccessing list elements using Iterator interface:");
		//traversing elements
		//next() to access next element and move cursor to next element;
		//hasNext() return type is boolean
		//remove() 
		Iterator<String> itr=l2.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			
		}
		}

}
