package Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofArraylist {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> al= new ArrayList<>(); 
		System.out.println("Enter How Many Element: ");
		int n=s.nextInt();
		s.nextLine();
		
		System.out.println("Enert Number: ");
		for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }
		int sum=0;
		
		for(int num: al) {
			if(num %2 ==0) {
				sum+=num;
			}
		}
		System.out.println("sum Of Even Number: "+sum);
		s.close();
	}

}
