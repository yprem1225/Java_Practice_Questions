package q1;
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
	String name;
	String address;
	Address address2;
	Hobbies hobbies;
	public Emp(String name, String address, Address address2, Hobbies hobbies) {
		super();
		this.name = name;
		this.address = address;
		this.address2 = address2;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", address2=" + address2 + ", hobbies=" + hobbies + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		Address address = new Address("mumbai", "pune");
		Hobbies hobbies = new Hobbies("hah", "sjj");
		Emp emp = new Emp("hhs", "sjjs", address, hobbies);
		System.out.println(emp.address2.add1);
		System.out.println(emp.hobbies.hobby1);
	}

}
