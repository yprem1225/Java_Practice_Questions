package q3;
class Bank{
	public double rateOfInterest() {
		return 3;
	
	}
}

class SBI extends Bank{
	@Override
	public double rateOfInterest() {
		return 3.5;
	}
}
class ICICI extends Bank{
	@Override
	public double rateOfInterest() {
		return 4;
	}
}

class AXSIS extends Bank{
	@Override
	public double rateOfInterest() {
		return 4.5;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank bank;
		bank= new SBI();
		System.out.println("SBI:"+bank.rateOfInterest());
		bank= new AXSIS();
		System.out.println("AXSIS"+bank.rateOfInterest());
		bank= new ICICI();
		System.out.println("ICICI:"+bank.rateOfInterest());
	}


}
