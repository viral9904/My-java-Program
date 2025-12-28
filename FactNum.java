package practical;

import java.util.Scanner;

public class FactNum {
	public static int fact(int n) {
		if(n == 0 ||n ==1)
			return 1;
		else
			return  n * fact(n-1);
	}
	public static  void main(String args[]) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter Num: ");
		int n=s.nextInt();
		
		System.out.println("Factorial Number Is: "+ fact(n));
		
		s.close();
	}
	
}
