package dhhd;

import java.util.ArrayList;
class Students{
	int id;
	String name;
	double fees;
	public Students(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Students>list = new ArrayList<Students>();
		list.add(new Students(1, "prem", 1000));
		list.add(new Students(1, "prem", 10000));
		
	}
}
