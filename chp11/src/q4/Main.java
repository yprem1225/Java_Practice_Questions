package q4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Emp> arraylist=new ArrayList<Emp>();
		
		Emp emp = new Emp(1, "Prem", 1000);
		Emp emp2 = new Emp(2, "sks", 10000);
		
		arraylist.add(emp);
		arraylist.add(emp2);
		
		//Iterator
		Iterator<Emp> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Emp emp3 = (Emp) iterator.next();
			System.out.println(emp3);
			
		}
		
		//listIterator
		ListIterator<Emp> iterator2 = arraylist.listIterator();
		while (iterator2.hasNext()) {
			Emp emp3 = (Emp) iterator2.next();
			System.out.println(emp3);
		}
		
		//Reverse using ListIterator
		ListIterator<Emp> iterator3 = arraylist.listIterator();
		while (iterator3.hasNext()) {
			Emp emp3 = (Emp) iterator3.next();
			System.out.println(emp3);
			
		}
		
		//using enumerator
		
		List<Emp> vector= new Vector<Emp>();
		
		vector.add(emp);
		vector.add(emp2);
		
		//Using enumerator
		Enumeration<Emp> enumeration = ((Vector<Emp>) vector).elements();
		while (enumeration.hasMoreElements()) {
			Emp emp3 = (Emp) enumeration.nextElement();
			System.out.println(emp3);
		
		}
		
		//for each loop
		
		for (Emp emp3 : vector) {
			System.out.println(emp3);
			
		}

		
	}

}
