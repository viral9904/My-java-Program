package practical;

import java.util.Scanner;

public class ThrowKeyword {
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		
		try {
			
			System.out.println("Enter Age: ");
			int a= s.nextInt();
			
			if(a <=18) {
				throw new ArithmeticException("Age Must be 18 above...");
			}
			System.out.println("Eligable");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This Is the end..");
		}
		
	}

}
