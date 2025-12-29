package practical;

import java.util.Scanner;

public class SearchElement {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		boolean found =false;
		
		System.out.println("Enter array Size:");
		int n= s.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter Element:");
		for(int i=0; i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+ " ");
		}
		
		System.out.println("Enter Element to find:");
		int f= s.nextInt();
		
		for(int num: a) {
			if(num == f) {
				found =true;
				break;
			}
		}
		if(found) {
			System.out.println("Element "+f +" Found");
		}
		else
		{
			System.out.println("Element Not Found!!!");
		}
		s.close();
		
		
	}

}
