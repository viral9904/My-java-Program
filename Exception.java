package practical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter file path:");
			String FilePath = s.nextLine();
			FileReader f= new FileReader(FilePath);
			BufferedReader  b = new BufferedReader (f);
			
			System.out.println(b.readLine());
			b.close();
			
		}
		catch(IOException e){
			
			System.out.println(e.getMessage());
			
		}
		System.out.println();
		try {
			System.out.println("Enter Num1: ");
			int a=s.nextInt();
			
			System.out.println("Enter Num2: ");
			int b= s.nextInt();
			
			int result= a/b;
			
			System.out.println("Result Is: "+result);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		s.close();
	}

}
