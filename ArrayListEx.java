package practical;

import java.util.*;

public class ArrayListEx {

	public static void main(String args[]) {

		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		al1.add("Apple");
		al2.add(1);

		al1.add("Banana");
		al2.add(2);

		al1.add("Mango");
		al2.add(3);

		al1.add("Cherry");
		al2.add(4);

		System.out.println(al1);
		System.out.println(al2);

		al1.remove(0);
		al2.remove(0);

		System.out.println(al1);
		System.out.println(al2);

	}
}
