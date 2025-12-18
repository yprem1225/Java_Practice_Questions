package q5;

class A{
	public void meth1() {
		final int a=10;
		class Local{
			public void displayInfo() {
				System.out.println("local class inner meth"+a);
			}
		}Local local = new Local();
		local.displayInfo();
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		 a.meth1();
	}



}
