package q6;

class Address{
	String add1;
	String add2;
	public Address(String add1, String add2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
	}
	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", add2=" + add2 + "]";
	}
	
}

class Hobbies{
	String hobby1;
	String hobby2;
	public Hobbies(String hobby1, String hobby2) {
		super();
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
	}
	@Override
	public String toString() {
		return "Hobbies [hobby1=" + hobby1 + ", hobby2=" + hobby2 + "]";
	}
	
	
}

class Emp{
	String c_name;
	String c_address;
	Address address;
	Hobbies hobbies;
	public Emp(String c_name, String c_address, Address address, Hobbies hobbies) {
		super();
		this.c_name = c_name;
		this.c_address = c_address;
		this.address = address;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [c_name=" + c_name + ", c_address=" + c_address + ", address=" + address + ", hobbies=" + hobbies
				+ "]";
	}
	
	
}



public class Main {
	public static void main(String[] args) {
		Address address = new Address("hwhw", "sjs");
		Hobbies hobbies = new Hobbies("wjjw", "wiiw");
		Emp emp = new Emp("wjwj", "sksk", address, hobbies);
		System.out.println(emp.address.add1);
	}


}
