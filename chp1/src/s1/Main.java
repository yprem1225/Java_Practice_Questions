package s1;

class Emp{
	int id;
	String name;
	String address;
	double salary;
	public Emp(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	public void displayInfo() {
		System.out.println(salary);
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		

	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "prem", "mumba", 1110);
		emp.displayInfo();
		System.out.println(emp);
	}
	


}
