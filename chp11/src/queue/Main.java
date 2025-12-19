package queue;
//Queue Interface
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Prem");
		queue.add("Yash");
		queue.add("Sumit");
		queue.add("vibha");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		queue.remove();
		System.out.println(queue);
	}

}
