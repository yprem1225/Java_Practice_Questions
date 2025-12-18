package q1;

final class Company{
	final String c_name="sdac";
	final void rules() {
		System.out.println(c_name);
	
	}
}
public class Main {
	public static void main(String[] args) {
		Company company = new Company();
		company.rules();
	}

}
