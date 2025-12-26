
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Prem");
		queue.add("Yash");
		queue.add("Sumit");
		queue.add("vibha");
//		System.out.println(queue);
//		System.out.println(queue.peek());
//		System.out.println(queue.element());
//		queue.remove();
//		System.out.println(queue);
//		System.out.println(queue.poll());
		
		Iterator<String> it = queue.iterator();
		//Print queue in order using iterator
//		while (it.hasNext()) {
//			String name=  it.next();
//			System.out.println(name);
//			
//		}
//		// Print queue in order using foreach loop
//		for (String name : queue) {
//			System.out.println(name);
//			
//		}
		
		//Print in reverse order
		Stack<String> stack = new Stack<String>(); //Move queue -> stack
		while (!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		
		while (!stack.isEmpty()) { //move stack -> queue
			queue.add(stack.pop());
			
		}
		System.out.println(queue);
	}

}
