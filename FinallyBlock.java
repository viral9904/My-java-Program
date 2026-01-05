package practical;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String args[]) {
	
		Scanner s = new Scanner(System.in);
		
			try {
				System.out.println("Enter Num: ");
				String n= s.nextLine();
				
				int num = Integer.parseInt(n); 	
				System.out.println("You Entered: "+num);
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage());	
			}
			finally {
				System.out.println("Finally Block Will Run Always....");
			}
			s.close();
	}

}
