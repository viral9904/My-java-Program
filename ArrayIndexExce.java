package Lab;

import java.util.Scanner;

public class ArrayIndexExce {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter Array Size: ");
		int n = s.nextInt();
		
		
		s.nextLine();
		int arr[]= new int[n];
		System.out.println("Enter Element: ");
		for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();
		}
		System.out.println("Element Are: ");
		for(int i=0; i<=n;i++) {
			System.out.println(arr[i]);
		}
		
		
		s.close();
	}

}
