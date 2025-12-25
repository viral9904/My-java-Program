package practical;

import java.util.Scanner;

public class Studentmark {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Marks: ");
		int m = s.nextInt();
		
		if(m >=0 && m <=30) {
		if (m >=20) {
			System.out.println("Student Pass...");
		}
		else {
			System.out.println("Student Fail..");
		}	
		}
		else {
			System.out.println("Invalid Marks !!!!");
		}
		s.close();
		
	}

}
