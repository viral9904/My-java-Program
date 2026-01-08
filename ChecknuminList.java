package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChecknuminList {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("How manu Number: " );
		int n= s.nextInt();
		
		List<Integer> il= new ArrayList<>();
		
		System.out.println("Enter Number: ");
		for(int i=0;i<n;i++) {
			il.add(s.nextInt());
		}
		System.out.println("Number List: "+il);
		
		System.out.println("Enter Number You Want to Check: ");
		int num=s.nextInt();
		
		if(il.contains(num)) {
			System.out.println(num+" Found");
		}
		else
		{
			System.out.println(num+" Not found!!!");
		}
		s.close();
	}
}
