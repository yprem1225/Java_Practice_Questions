package q1linkedlist;

import java.util.List;

public interface Operations {
	void addStudent(List<Students> emps);
	void search(int id);
	void delete(int id);
	void show();
	void update(int id, String name, String favsubject);
	void reverse();

}
