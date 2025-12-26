package practical;

import java.util.Scanner;

public class Admincheck {
	public static void main(String args[]) {
		
		String UserRole= "admin";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Role: ");
		UserRole=s.nextLine();
		
		if(UserRole.equalsIgnoreCase("admin")) {
			System.out.println("Welcome Admin !!!");
		}
		else {
			System.out.println("You are not admin!!1");
		}
		s.close();
		
		
		
	}

}
