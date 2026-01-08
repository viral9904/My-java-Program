package practical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {
	public static void main(String args[]) {
		
		
		List<String> fl= new ArrayList<>();
		
		fl.add("Apple");
		fl.add("Banana");
		fl.add("Apple");
		fl.add("Mango");
		fl.add("Banana");
		
		for(int i=0; i<fl.size();i++) {
			
			System.out.println(fl.get(i));
		}
		System.out.println("----------------");
		for(String f : fl) {
			System.out.println(f);
		}
		System.out.println("---------------");
		Iterator<String> i= fl.iterator();
				while(i.hasNext()){
				System.out.println(i.next());
				}
	}
	

}
