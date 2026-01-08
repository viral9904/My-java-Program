package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConvertListToArray {
	public static void main(String args[]) {

		List<String> li = new ArrayList<>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");

		System.out.println("Print List " + li);
		// Convert List To Array
		String arra[] = li.toArray(new String[0]);

		System.out.println("Convet List To Array");
		for (String item : arra) {
			System.out.println(item);
		}
		String array[] = { "A1", "B1", "C1", "D1" };

		List<String> LiToArr = Arrays.asList(array);

		System.out.println("Convert Array To List");
		for (String item : LiToArr) {
		System.out.println(item);
		}
		System.out.println(LiToArr);
	}

}
