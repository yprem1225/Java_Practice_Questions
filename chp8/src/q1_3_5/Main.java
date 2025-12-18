package q1_3_5;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		int num1 =10,num2 =0;
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Code Execited");
		}
		
	}


}
