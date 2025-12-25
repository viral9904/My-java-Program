package practical;

import java.util.Scanner;

public class exit0 {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Num:(0 for Exsting...)");
				
		while(true) {
			
			int in= s.nextInt();
			if(in== 0) {
				
				System.out.println("Exsting...");
				break;
			}
			System.out.println("You Entered: "+ in);
		}
		s.close();
	}

}