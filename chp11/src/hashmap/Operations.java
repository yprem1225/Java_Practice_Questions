package hashmap;

import java.util.HashMap;

public interface Operations {
	void add(HashMap<Integer, Emp> hashmap);
	void show();
	void search(int id);
	void delete(int id);
	void update(int id,Emp emp);
	
	

}
