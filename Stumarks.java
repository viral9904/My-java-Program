package practical;

import java.util.Scanner;

public class Stumarks {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student Marks: ");
		int m= s.nextInt();
		
		if(m >= 33) {
			System.out.println("Student Pass");
		}
		else {
			System.out.println("Student Fail");
		}
		s.close();
		
	}

}
