package q;
import static java.lang.Math.*;

import java.util.Objects;



class Emp  implements Cloneable{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Created");
	}
	
	
	

	
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println(sqrt(500));
		System.out.println(PI);
		
		//autoboxing
		
		int a=10;
		Integer i =a;
		System.out.println(i);
		
		//unboxinh
		
		Integer j =100;
		int b=j;
		System.out.println(b);
		
		//clone
		Emp emp = new Emp(1, "prem");
		Emp emp2= (Emp) emp.clone();
		System.out.println(emp2);
		
		//hashcode
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		
		//equals
		System.out.println(emp.equals(emp2));
		
		//finalize
		Emp emp3 = new Emp(3, "xya");
		System.out.println(emp3);
		emp3=null;
		System.gc();
		
		//get class
		System.out.println(emp.getClass());
		System.out.println(emp.getClass().getName());
	}


}
