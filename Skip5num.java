package practical;

import java.util.Scanner;

public class Skip5num {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int n=s.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            if (i % 5 == 0) {
	                continue; 
	            }
	            System.out.println(i);
	        }
		 s.close();
		}

}
