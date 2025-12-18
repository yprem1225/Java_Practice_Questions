package q4and5;

class Accountant{
	public void calSal(double salary) {
		System.out.println(salary);
	}
	
	public void calSal(double salary, double bonus) {
		System.out.println(salary+bonus);
	
	}
	public void calSal(double salary, double bonus, double tax) {
		System.out.println(salary+bonus-tax);
	
	}
	
}

class Emp extends Accountant{
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
	@Override
	public void calSal(double salary, double bonus, double tax) {
		System.out.println(salary+bonus-tax);
	}@Override
	public void calSal(double salary, double bonus) {
		System.out.println(salary+bonus);
	}
}
public class Main extends q3.Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		accountant.calSal(100);
		accountant.calSal(100, 1000);
		accountant.calSal(100, 1000, 10);
		
		Emp emp = new Emp();
		emp.calSal(10);
		emp.calSal(100, 1000);
		emp.calSal(100, 1000, 100);
		
	}



}
