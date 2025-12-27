package stack;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
	
		System.out.println(stack.peek());
		
		//Iteration in stack
		System.out.println("Iteration using foreach.....");
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
		System.out.println("Iteration using Iterator......");
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("Iterating in reverse order....");
		ListIterator<Integer> iterator2 = stack.listIterator(stack.size());
		while (iterator2.hasPrevious()) {
			Integer integer = (Integer) iterator2.previous();
			System.out.println(integer);
			
		}
	}

}
