package q1linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Students students = new Students(1, "Prem", "maths");
		Students students2 = new Students(2, "Yash", "Science");
		Students students3 = new Students(3, "RAJ", "HISTORY");
		
		
		
		
		List<Students> list = new LinkedList<Students>();
		list.add(students);
		list.add(students2);
		list.add(students3);
		
		OperationsImpementor operationsImpementor = new OperationsImpementor();
		operationsImpementor.addStudent(list);
//		operationsImpementor.show();
		operationsImpementor.show();
		
		operationsImpementor.update(3, "neha", "mba");
		operationsImpementor.show();
		
		operationsImpementor.reverse();
	}
	
	

}
