package practical;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		ArrayList <Integer> al = new ArrayList<>();
		
		System.out.println("Enter Number: ");
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			al.addLast(i);
		}
		System.out.println(al);
		s.close();
	}

}
