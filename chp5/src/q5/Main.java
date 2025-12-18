package q5;

class ProjectManager{
	String task1="hshs";
	String task2="ejjjf";
	
	public ProjectManager() {
		System.out.println("project manager");
	}
	
	public void getTask() {
		System.out.println("task status");
	
	}
}

class Emp extends ProjectManager{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void task() {
		System.out.println("task1:"+super.task1);
		System.out.println("task2:"+super.task2);
		super.getTask();
	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1,"sls");
		emp.task();
	}
}
