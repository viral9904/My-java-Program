package practical;

import java.util.Scanner;

public class ArrayIndexExceptionHandling {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("Enter Array Size: ");
		int n =s.nextInt();
		
		int arr[]= new int[n];	
		
		System.out.println("Enter ELement: ");
		
		for(int i=0;i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Element Are: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[6]+" ");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		s.close();
	}
}
