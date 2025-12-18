package q6;
class CEO{
	public void rules() {
		System.out.println("ceo rules");
	
	}
}

class Manager extends CEO{
	@Override
	public void rules() {
	  System.out.println("manager rules");
}
}

class Emp extends Manager{
	@Override
	public void rules() {
		System.out.println("emp rules");
	}
}

class Accountant extends Manager{
	@Override
	public void rules() {
		System.out.println("accountant rules..");
	}
}
public class Main {
	public static void main(String[] args) {
		CEO ceo = new CEO();
		ceo.rules();
		
		Manager manager;
		manager=new Manager();
		manager.rules();
		
		manager=new Emp();
		manager.rules();
		
		manager=new Accountant();
		manager.rules();
		
	}

}
