package practical;

import java.util.Scanner;

public class Squarenum {
	public static int square(int a) {
		
		return a *a;
		}
	
		public static void main(String args[]){
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Num to Square");
			int a = s.nextInt();
			
			System.out.println("Suqare Num Is: "+ square(a));
			s.close();
		}
	
	
	

}
