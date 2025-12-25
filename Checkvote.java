package practical;

import java.util.Scanner;

public class Checkvote {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Age :");
		int a= s.nextInt();
		
		if(a > 18) {
			
			System.out.println("Eligable for vote");
		}
		else
			System.out.println("Not Eligable for vote");
		s.close();
	}

}
