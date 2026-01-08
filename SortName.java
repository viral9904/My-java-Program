package practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SortName {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ho Many Name Yo Want To add Into List : ");
		int n= s.nextInt();
		s.nextLine();
		
		
		 List<String> sl = new ArrayList<>();
		 
		 for(int i=0 ;i<n;i++) {
			 sl.add(s.nextLine());
			 
		 }
		 System.out.println("List Before Sorted...");
		 System.out.println(sl);
		 Collections.sort(sl);
		 System.out.println("Sorted List..");
		 System.out.println(sl);
		 s.close();
	}

}
