package practical;

import java.util.Scanner;

public class vovelscheck {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter Vovels:");
		ch = s.next().charAt(0); 
		char lowercase= Character.toLowerCase(ch);
		
		if(lowercase == 'a'|| lowercase == 'e'|| lowercase == 'i'|| lowercase == 'o'|| lowercase == 'u') 
		{
			System.out.println(ch + " Is Vowel");
		}
		else
		{
			System.out.println(ch +" Is not vowels");
		}
		s.close();
		
		
	}

}
