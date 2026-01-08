package hashmap;

import java.util.HashMap;
import java.util.Map;

public class OperationImplementor implements Operations {
	HashMap<Integer, Emp> db= new HashMap<Integer, Emp>();

	@Override
	public void add(HashMap<Integer, Emp> hashmap) {
		db.putAll(hashmap);
		System.out.println("Data Added.....");
		
	}

	@Override
	public void show() {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			Emp val = entry.getValue();
			System.out.println("Key:"+key +" Value:"+val);
			
		}
		
	}

	@Override
	public void search(int id) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			Emp val = entry.getValue();
			if(key==id) {
				System.out.println(val);
				break;
			}else {
				System.out.println("No such key..");
				break;
			}
			
		}
		
	}

	@Override
	public void delete(int id) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			if(key==id) {
				db.remove(key);
				System.out.println("deleted successfully...");
			}else {
				System.out.println("No such key...");
				break;
				
			}
			
		}
		
	}

	@Override
	public void update(int id, Emp emp) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			if(id==key) {
				db.replace(key, emp);
				System.out.println("data Updated...");
				break;
				
			}
			
		}
	}
	
	

}
