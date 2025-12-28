package practical;

import java.util.Scanner;

public class Returnsum {
	
	public static int sum(int a, int b) {
		
		return a+ b;
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Num1 :");
		int a= s.nextInt();
	
		System.out.println("Enter Num2 :");
		int b= s.nextInt();
		
		System.out.println("Sum Is: " + sum(a,b));
		s.close();
	}

}
