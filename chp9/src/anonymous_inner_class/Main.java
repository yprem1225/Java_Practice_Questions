package anonymous_inner_class;

public class Main {
	Salary salary = new Salary() {
		
		@Override
		public double calSal(double salary) {
			return salary;
		}
	};
	
	Bonus bonus = new Bonus() {
		
		@Override
		double calBonus(double bonus) {
			// TODO Auto-generated method stub
			return bonus;
		}
	};
	
	Tax tax = new Tax() {
		@Override
		public double calTax(double tax) {
			return super.calTax(tax);
		}
		
	};
	
	public double calTotalSalary(double sal,double bon,double taxamt) {
		return sal+bon-taxamt;
		

	}
	
	public static void main(String[] args) {
		Main main = new Main();
		double sal=main.salary.calSal(1000);
		double bon=main.bonus.calBonus(100);
		double taxamt=main.tax.calTax(100);
		
		double final_total_salary=main.calTotalSalary(sal,bon,taxamt);
		System.out.println(final_total_salary);
		
		
		
	}

}
