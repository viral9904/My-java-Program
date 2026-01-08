package practical;

import java.util.LinkedList;

public class LinkedListex2 {
	public static void main(String args[]) {
		
		LinkedList <Integer> ll1 = new LinkedList<>();
		
		for (int i=1; i<=10; i++) {
			
			ll1.addLast(i);
		}
		System.out.println(ll1);
		
		LinkedList<Integer> revll1= new LinkedList<>();
		
		for(int num: ll1) {
			
			revll1.addFirst(num);
		}
		System.out.println("Reverse LinkedList");
		System.out.println(revll1);
	}

}
