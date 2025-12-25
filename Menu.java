package practical;

import java.util.Scanner;

public class Menu {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Menu......");
			System.out.println("1. Your Name:");
			System.out.println("2. Your Age");
			System.out.println("3 Exit");
			
			ch=s.nextInt();
			s.nextLine();
			
			switch(ch) {
			case 1 :
				System.out.println("Enter Your Name: ");
				String n=s.nextLine();
				System.out.println("Your Name Is:"+n);
				break;
			case 2 :
				System.out.println("Enter Your Age: ");
				int a=s.nextInt();
				System.out.println("Your Age Is:" + a);
				break;
			case 3 :
				System.out.println("Existing...");
				break;
				default:
					System.out.println("Wrong Choice....");


			}
			
		}while(ch !=3);
		s.close();
		
	}

}
