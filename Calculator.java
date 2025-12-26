package practical;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Num 1: ");
		int n1= s.nextInt();
		
		System.out.println("Enter Num 2: ");
		int n2= s.nextInt();
		
		System.out.println("Enter Operator (+, -, *, /): ");
		char op=s.next().charAt(0);
		
		int res=0;
		switch(op) {
		case  '+' :
			res= n1+n2;
			System.out.println("Answer Is:" +res );
			break;
		case  '-' :
			res= n1-n2;
			System.out.println("Answer Is:" +res );
			break;
		case  '*' :
			res= n1*n2;
			System.out.println("Answer Is:" +res );
			break;
		case  '/' :
			res= n1/n2;
			System.out.println("Answer Is:" +res );
			break;
			default:
				System.out.println("Invalid Operator");
		}
		s.close();
	}

}
