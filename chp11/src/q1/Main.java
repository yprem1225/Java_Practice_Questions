package q1;

import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Prem");
		emp.setSalary(1000);
		
		Emp emp2 = new Emp();
		emp2.setId(2);
		emp2.setName("Prem2");
		emp2.setSalary(1000000);
		
		Emp emp3 = new Emp();
		emp3.setId(3);
		emp3.setName("Prem3");
		emp3.setSalary(10000);
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		
		OperationImplementor operationImplementor = new OperationImplementor();
		operationImplementor.add(list);
		System.out.println(list);
		System.out.println(operationImplementor.db);
		
		
	}
}
