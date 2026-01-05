package practical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
	public static void main(String args[]) {
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter file path:");
		String FilePath = s.nextLine();

		
		try 
		{
			FileReader f= new FileReader(FilePath);
			BufferedReader  b = new BufferedReader (f);
			
			System.out.println(b.readLine());
			b.close();
			
		}
		catch(IOException e){
			
			System.out.println(e.getMessage());
			
		}
		s.close();
	}

}
