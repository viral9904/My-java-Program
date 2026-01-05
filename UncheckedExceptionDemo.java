package practical;

import java.util.Scanner;

public class UncheckedExceptionDemo {
	public static void main(String args[]) {
		
		
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter Num1: ");
		int a=s.nextInt();
		
		System.out.println("Enter Num2: ");
		int b= s.nextInt();
		
		int result= a/b;
		
		System.out.println("Result Is: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		s.close();
	}

}
