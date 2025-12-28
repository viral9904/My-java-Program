package practical;

import java.util.Scanner;

public class Positivenumprint {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enetr array Size:");
		int a=s.nextInt();
		
		int arr[]= new int[a];
		System.out.println("Enter Element: ");
		for(int i=0 ; i<a; i++)// array insert
		{
			arr[i]=s.nextInt();
		}
		for(int i=0; i<a; i++) //print array
		{
			System.out.print( arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Positive number: ");
		
		for(int num: arr) {
			if(num < 0) {
				continue;
			}
			System.out.print(num + " ");
		}
		s.close();
	}

}
