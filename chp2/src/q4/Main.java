package q4;
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
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("prem");
		emp.setSalary(1000);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

	


}
