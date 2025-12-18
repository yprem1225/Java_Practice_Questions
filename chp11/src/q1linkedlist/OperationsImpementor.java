package q1linkedlist;



import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class OperationsImpementor implements Operations{
	List<Students> db = new LinkedList<Students>();

	@Override
	public void addStudent(List<Students> emps) {
		db.addAll(emps);
	}

	@Override
	public void search(int id) {
		ListIterator<Students> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Students students = (Students) iterator.next();
			if (students.getId()==id) {
				System.out.println(students);
			}
		}
	}

	@Override
	public void delete(int id) {
		ListIterator<Students> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Students students = (Students) iterator.next();
			if (students.getId()==id ) {
				db.remove(id);
			}
		}
	}

	@Override
	public void show() {
		ListIterator<Students> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Students students = (Students) iterator.next();
			System.out.println(students);
			
		}
		
	}

	@Override
	public void update(int id, String name, String favsubject) {
		ListIterator<Students> iterator = db.listIterator();
		while (iterator.hasNext()) {
			Students students = (Students) iterator.next();
			if (students.getId()==id) {
				students.setName(name);
				students.setFavsubject(favsubject);
				
				
			}
		}
	}
	@Override
	public void reverse() {
		ListIterator<Students> iterator = db.listIterator(db.size());
				while (iterator.hasPrevious()) {
					Students students = (Students) iterator.previous();
					System.out.println(students);
					
				}
		
	}
	

}
