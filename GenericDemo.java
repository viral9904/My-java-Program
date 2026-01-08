package practical;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
public static <T> void printList(List<T> list) {
	
	for(T item: list) {
		
		System.out.println(item);
	}
}
public static void main(String args[]) {
	
	List<String> sl= new ArrayList<>();
	
	sl.add("Car");
	sl.add("Bike");
	sl.add("Truck");
	sl.add("Cycle");
	System.out.println("String List: ");
	printList(sl);
	System.out.println();
	
	List<Integer> il=new ArrayList<>();
	
	il.add(1);
	il.add(2);
	il.add(3);
	il.add(4);
	
	System.out.println("Integer List: ");
	printList(il);
	

}
}
