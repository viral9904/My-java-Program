package practical;

public class sumofarr {
	public static void main(String args[]) {
		
		int arr[]= {10,20,30,40,50};
		
		int s= 0;
		
		for (int i: arr) {
			
			s= s+ i;
			
			System.out.println("Sum of Array Is:"+ s);
		}
	}

}
