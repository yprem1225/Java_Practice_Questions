package hdh;
import java.util.Objects;
import static java.lang.Math.*;


class Emp implements Cloneable{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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
	

	
	
}
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp(1, "prem");
		Emp emp2 = new Emp(1, "p");
		Emp empclone=(Emp) emp2.clone();
		System.out.println(empclone);
		System.out.println(emp2.equals(empclone));
		System.out.println(emp2.hashCode());
		System.out.println(empclone.hashCode());
		System.out.println(emp);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.getClass().getName());
		
		int a=10;
		Integer integer = a;
		System.out.println(integer);//autoboxing
		
		Integer i=10;
		int b=i;
		
		System.out.println(b);//unboxing
		
		System.out.println(sqrt(100));
		
	}

}
