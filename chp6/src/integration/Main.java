package integration;

import operations.Dev1;
import operations.Dev2;
import operations.Dev3;
import operations.Dev4;

public class Main {
	public static void main(String[] args) {
		Dev1 dev1 = new Dev1();
		dev1.addData();
		
		Dev2 dev2 = new Dev2();
		dev2.updateData();
		
		Dev3 dev3 = new Dev3();
		dev3.deleteData();
		
		Dev4 dev4 = new Dev4();
		dev4.showData();
	}

}
