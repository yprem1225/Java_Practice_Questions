package q5;
class Emp{
	int id=10;
	static String c_name="kskks";
	
	public void calSal(double salary) {
		System.out.println(salary);
		

	}
}


public class Main {
	public static void main(String[] args) {
		System.out.println(Emp.c_name);
		Emp emp = new Emp();
		System.out.println(emp.id);
		emp.calSal(1000);
		
	}

}
