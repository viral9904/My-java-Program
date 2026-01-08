package practical;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDulpi {
	public static void main(String args[]) {
		
		List<String> l= new ArrayList<>();
		
		l.add("AAA");
		l.add("BBB");
		l.add("CCC");
		l.add("AAA");
		l.add("CCC");
		l.add("DDD");
		
		
		Set<String> rd = new HashSet<>(l);	
		
		List<String>ul= new ArrayList<>(rd);
		
		System.out.println("List:"+ul);
		
	}

}
