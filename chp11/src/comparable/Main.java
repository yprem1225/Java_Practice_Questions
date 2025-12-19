package comparable;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	@Override
	public int compareTo(Emp o) {
		return this.id-o.id;      //Comparing on the basis of id
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "a", 1000);
		Emp emp2 = new Emp(4, "b", 2000);
		Emp emp3 = new Emp(2, "c", 100);
		Emp emp4 = new Emp(3, "d", 200);
		
		List<Emp> arrayList = new ArrayList<Emp>();
		arrayList.add(emp);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		
		ListIterator<Emp> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
			
		}
		
	}

}
