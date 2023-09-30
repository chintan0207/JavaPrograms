package sep28Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new PriorityQueue<>();
		q.add("Lotus");
		q.offer("Lilli");
		q.offer("jasmin");
		q.offer("Ram");
		q.offer("Lotus");
		q.offer("Ram");
		//q.offer(null);
		
		System.out.println("Implementing PriorityQueue.....");
		for(String s:q)
		{
			System.out.println(s);
		}
		System.out.println("removing element: "+q.remove());
		
		System.out.println("\nAfter removing element:  ");
		for(String s:q)
		{
			System.out.println(s);
		}
		Deque<String> d=new ArrayDeque<>();
		d.add("Apple");
		d.add("gova");
		d.add("banana");
		d.add("watermelon");
		d.add("Apple");
		
		System.out.println("\nImplementing ArrayDeque.....");
		
		for(String s1:d)
		{
			System.out.println(s1);
		}
		System.out.println("removing 1st element: ");
		d.pollFirst();
		for(String s1:d)
		{
			System.out.println(s1);
		}
		System.out.println("removing last element: ");
		d.pollLast();
		for(String s1:d)
		{
			System.out.println(s1);
		}
	}

}
