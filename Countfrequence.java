package practical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Countfrequence {
	
	public static void main(String args[]) {
		
		List<String> l= new ArrayList<>();
		
		l.add("Apple");
		l.add("Banana");
		l.add("Apple");
		l.add("Mango");
		l.add("Apple");
		
		Map<String ,Integer> fm= new HashMap<>();
		for(String w: l) {
			fm.put(w,fm.getOrDefault(w, 0)+1);
		}
		fm.forEach((key,value)-> System.out.println(key+ "->"+ value)); 
		
		
	}

}
