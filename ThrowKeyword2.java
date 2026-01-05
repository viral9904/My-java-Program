package practical;

import java.util.Scanner;

public class ThrowKeyword2 {

	public static void checkAge(int Age) throws ArithmeticException {
		if(Age < 18) {
			System.out.println("Invalid Age..");
		}
		else {
			System.out.println("Valid Age..");
		}
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter Age: ");
		int a = s.nextInt();
		
		checkAge(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End...");
		}
		s.close();
	}
}
