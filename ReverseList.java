package practical;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	
	public static void main(String args[]) {
		
		List<String> l= new ArrayList<>();
		
		l.add("BMW M1");
		l.add("BMW M2");
		l.add("BMW M3");
		l.add("BMW M4");
		l.add("BMW M5");
		
		System.out.println("List:"+l);
		int s=0;
		int e=l.size()-1;
	
		while(s < e) {
		String temp =l.get(s);
		l.set(s, l.get(e));
		l.set(e, temp);
		
		s++;
		e--;
		}	
		
	System.out.println("Reversed List" + l);
	}
}
