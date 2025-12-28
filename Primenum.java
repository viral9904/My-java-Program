package practical;

import java.util.Scanner;

public class Primenum {
	public static boolean prime(int a) {
		if(a <=1)
		return false;
		for(int i =2; i<a; i++) {
			if(a % i ==0)
				return false;
		}
		return true;
	}
	
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Num: ");
	int a=s.nextInt();
	
	if(prime(a)) {
		System.out.println(a+" Number Is Prime");
	}
	else {
	System.out.println(a+" Number Is Not Prime");
	}
	s.close();
}


}
