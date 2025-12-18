package q1;

import java.util.*;

public interface Operations {
	void add(List<Emp> emps);
	void update(int id, String name , double salary);
	void show();
	void delete(int id);
	void search(int id);
	
	

}
