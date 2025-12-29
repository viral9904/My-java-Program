package practical;

import java.util.Scanner;

public class TerminateNegative {
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			
					
			while (true) {
				System.out.println("Enter Number(Negative num to quit!!)");
				int n= s.nextInt();
				
				if(n < 0) {
					System.out.println("You Entered Nagative num: Exsting!!!");
					break;
				}
				System.out.println("you Entered:"+ n);
				System.out.println();
			}
			s.close();
			
		}

}
