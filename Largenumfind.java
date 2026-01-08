package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largenumfind {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		List<Integer> num= new ArrayList<>();
		System.out.println("How Many Number Enter:");
		int n=s.nextInt();
		
		System.out.println("Enter Number: ");
		for(int i=0;i<n;i++ ) {
			num.add(s.nextInt());
		}
		System.out.println(num);
		
		int large=0;
		for(int numb: num) {
			if(numb > large) {
				large=numb;
			}	
		}
		
		System.out.println("Largest Num:"+ large);
		s.close();
	}

}
