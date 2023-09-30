package sep28Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack=new Stack<>();
		stack.add("hello");
		stack.push("hai");
		stack.push("Good morning");
		stack.push(null);
		stack.push("hai");

		System.out.println(stack);
        System.out.println("removing top element :"+stack.pop());
		
		System.out.println(stack);
		System.out.println("searching hai :"+stack.search("hai"));
		
		System.out.println("searching hai :"+stack.search("Mango"));
		
		
	}

}
