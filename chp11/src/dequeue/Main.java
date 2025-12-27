package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.addFirst(1);
		deque.addLast(2);
		deque.offerFirst(3);
		deque.offerLast(50);
		
		//to get fist and last element
		System.out.println("First Element(Front):"+deque.getFirst());
		System.out.println("Last Element(Rare):"+deque.getLast());
		
		
		System.out.println("Iterating using foreach loop.....");
		for (Integer integer : deque) {
			System.out.println(integer);
		}
		
		System.out.println("Iterating using Iterator.....");
		Iterator<Integer> iterator= deque.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("Reverse order....");
		Iterator<Integer> iterator2 = deque.descendingIterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(integer);
			
		}
		
		
		
	}

}
