package Lab;

import java.util.Scanner;

public class Checkleapyear {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Year: ");
		int y= s.nextInt();
		
		if((y %4 == 0 && y % 100 !=0) ||(y % 400 ==0)){
			System.out.println(y + " Is Leap Year!!!");
		}
		else
		{
			System.out.println(y+ " Is Not Leap year!!!");
		}
		s.close();
		
	}

}
