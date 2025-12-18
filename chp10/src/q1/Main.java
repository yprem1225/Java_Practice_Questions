package q1;

public class Main {
	public static void main(String[] args) {
		String s1=" Hello World ";
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.replace('l', 'x'));
		System.out.println(s1.compareTo(" Hello World"));
		String s2="hello";
		System.out.println(s1.concat(s2));
		System.out.println(String.valueOf(23));
		
		
		@SuppressWarnings("removal")
		Integer integer = new Integer(45);
		System.out.println(integer);
		
	}

}
