package practical;

import java.util.Scanner;

public class numcheck {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter  Number");
		int n = s.nextInt();
		
		if(n > 0) {
			if(n > 100) {
			System.out.println("Number is greater than 100");
			}
			else {
				System.out.println("number between 1 to 100");;
			}
		}
		else {
			System.out.println("Negative Numer...");
		}
		s.close();
		
	}

}
