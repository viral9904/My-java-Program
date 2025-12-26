package practical;

import java.util.Scanner;

public class FindLargestnum {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Num1: ");
		int n1= s.nextInt();
		System.out.println("Enter NUm2: ");
		int n2=s.nextInt();
		
		if(n1 > n2) {
			System.out.println("Num 1 is greater");
		}
		else {
			System.out.println("Num 2 is greater");
		}
		s.close();
		
	}

}
