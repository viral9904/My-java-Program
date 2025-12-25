package practical;

import java.util.Scanner;

public class CheckPositive {
	public static void main(String args[])
	{
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Number :");
			int n = s.nextInt();
			
			if(n> 0)
			{
				System.out.println("Positive");
			}
			else
			{
				System.out.println("Negative");
			}
			s.close();
		
	}

}
