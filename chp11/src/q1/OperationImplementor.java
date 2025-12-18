package q1;

import java.util.*;

public class OperationImplementor implements Operations {
	 List<Emp> db = new ArrayList<Emp>();

	 @Override
	 public void add(List<Emp> emps) {
		db.addAll(emps);
	 }

	 @Override
	 public void update(int id, String name, double salary) {
		ListIterator<Emp> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId()==id) {
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				
			}
			
		}
		
	 }

	 @Override
	 public void show() {
		ListIterator<Emp> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
			
		}
		
		
	 }

	 @Override
	 public void delete(int id) {
		ListIterator<Emp> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId()==id) {
				iterator.remove();
				break;
				
			}
			
		}
		
	 }

	 @Override
	 public void search(int id) {
		ListIterator<Emp> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId()==id) {
				System.out.println(emp);	
			}
		}
		
	 }



}
