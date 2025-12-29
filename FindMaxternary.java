package Lab;

import java.util.Scanner;

public class FindMaxternary {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		int n1=s.nextInt();
		
		System.out.println("Enter Number 2:");
		int n2=s.nextInt();
		
		int max = (n1>n2) ? n1:n2;
		
		System.out.println("Maximim Number Is: "+max);
		s.close();
	}

}
