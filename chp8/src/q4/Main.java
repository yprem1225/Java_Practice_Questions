package q4;
@SuppressWarnings("serial")
class InvalidOperationException extends Exception{
	public InvalidOperationException() {
		System.out.println("invalid operation");
		
	}
	
}


public class Main {
	public static void calculator(int n1 , int n2 , String operation)throws InvalidOperationException {
		if(operation.equals("+")) {
			System.out.println(n1+n2);
		}else if (operation.equals("-")) {
			System.out.println(n1-n2);
		}else if (operation.equals("*")) {
			System.out.println(n1*n2);
		}else if (operation.equals("/")) {
			try {
				System.out.println(n1/n2);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}else {
			throw new InvalidOperationException();
		}
		
		

	}
	
	public static void main(String[] args) {
		try {
			calculator(100, 100, "shhs");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
