package practical;

import java.util.Scanner;

public class Findmax {
	public static int max(int a , int b) {
		
		if(a >b) {
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int a=s.nextInt();
		
		System.out.println("Enter Num2:");
		int b= s.nextInt();
		
		System.out.println("Max num Is:"+ max(a,b));
		s.close();
	}

}
