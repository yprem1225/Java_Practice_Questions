package q2;

class Emp{
	int id=10;
	String name="prem";
	static String c_name="sdac";
	static String c_address="pune";
	
	public void displayEmpInfo() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void displayCompInfo() {
		System.out.println(c_address);
		System.out.println(c_address);

	}
	
	
	
	
}



public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayEmpInfo();
		Emp.displayCompInfo();
	}


}
