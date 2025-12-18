package q4;

import q4.Outer.Inner;

class Outer{
	static private int a=10;
	static class Inner{
		public static void meth1() {
			System.out.println(a);
		}
		public void meth2() {
			System.out.println(a);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.meth2();
		Inner.meth1();
	}



}
