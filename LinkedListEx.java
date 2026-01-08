package practical;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String args[]) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		ll1.add("BMW M5");
		ll2.add(1);
		
		ll1.add("BMW M4");
		ll2.add(2);
		
		ll1.add("BMW M3");
		ll2.add(3);
		
		ll1.add("BMW M2");
		ll2.add(4);
		
		ll1.add("BMW M1");
		ll2.add(5);
		
		for(String car:ll1 ) {
			
			System.out.println(car);
		}
       System.out.println(ll2);
	}
}
