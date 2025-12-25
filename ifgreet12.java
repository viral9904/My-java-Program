package practical;

import java.util.Scanner;

public class ifgreet12 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Hour(0 to 24)");
		int hour=s.nextInt();
		
		
		
		if(hour >= 0 && hour < 12) {
			System.out.println("Good Morning...");
		}
		else if(hour >= 12 && hour < 17) {
			System.out.println("Good After Noon...");
		}
		else if(hour >= 17 && hour < 21) {
			System.out.println("Good Evening...");
		}
		if(hour >= 21 && hour < 124) {
			System.out.println("Good Night...");
		}
		s.close();
	}

}
