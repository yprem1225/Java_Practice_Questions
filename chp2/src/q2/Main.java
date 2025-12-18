package q2;

class Emp{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}




public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(101, "pwppw", 1000);
		System.out.println(emp);
		
	}

	


}
