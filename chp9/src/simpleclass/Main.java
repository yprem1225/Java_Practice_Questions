package simpleclass;
class Outer{
	private int a=10;
	class Innner{
		public void displayInfo() {
			System.out.println(a);

		}
	}
}


public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Innner innner = outer.new Innner();
		innner.displayInfo();
	}



}
