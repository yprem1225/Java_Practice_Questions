package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Emp{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "a", 1000);
		Emp emp2 = new Emp(4, "b", 2000);
		Emp emp3 = new Emp(2, "c", 100);
		Emp emp4 = new Emp(3, "d", 200);
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println("Sorted using salary ");
		Collections.sort(list, new SalaryComparator());
		ListIterator<Emp> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
			
		}
		System.out.println("Sorted using name");
		Collections.sort(list, new NameComparator());
		ListIterator<Emp> iterator2 = list.listIterator();
		while (iterator2.hasNext()) {
			Emp emp5 = (Emp) iterator2.next();
			System.out.println(emp5);
			System.out.println("kkf");
			
		}
	}

}
