package practical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MultipleCatch {
	public static void main(String args[]) {

	Scanner s = new Scanner (System.in);
	
	try {
	System.out.println("Enter File Path: ");
	String fp= s.nextLine();
	
	FileReader f = new FileReader(fp);
	BufferedReader b= new BufferedReader(f);
	
	System.out.println(b.readLine());
	System.out.println();
	b.close();
	
	System.out.println("Enter Array Size: ");
	int n=s.nextInt();
	
	int arr[] = new int[n];
	System.out.println("Enter Element: ");
	for(int i=0; i<n;i++) {
		arr[i]=s.nextInt();
	}
	System.out.println("Element Are: ");
	for(int i=0;i <n;i++) {
		System.out.println(arr[5]+ " ");
	}
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	s.close();
	}

}
