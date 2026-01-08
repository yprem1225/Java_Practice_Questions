package hashmap;

import java.util.HashMap;


public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(1, "Prem", 1000);
		Emp emp2 = new Emp(2, "yash", 1000);
		Emp emp3 = new Emp(3, "ahh",890);
		
		HashMap<Integer, Emp> hashMap = new HashMap<Integer, Emp>();
		hashMap.put(1, emp);
		hashMap.put(2, emp2);
		hashMap.put(3, emp3);
		
		
		OperationImplementor implementor = new OperationImplementor();
		implementor.add(hashMap);
		implementor.search(22);
		Emp emp4 = new Emp(4, "vibha", 6000);
		implementor.update(2, emp4);
		implementor.show();
	}

}
