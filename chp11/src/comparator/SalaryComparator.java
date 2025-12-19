package comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) { //sorting in descending order , high salary first
		if (o1.getSalary()>o2.getSalary()) {
			return -1;
		}else if (o1.getSalary()<o1.getSalary()) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
