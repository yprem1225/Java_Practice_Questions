package priorityqueue;

import java.util.PriorityQueue;
import java.util.Stack;


public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(100);
		pq.offer(20);
		pq.add(700);
		pq.add(56);
		pq.add(920);
		pq.add(290);
		System.out.println(pq);
		
		
		 //Find the smallest number and print in ascending order
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
			//
		}
	}
	
	
	

}
