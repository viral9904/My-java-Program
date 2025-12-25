package practical;

import java.util.Scanner;

public class Encapsulation {
	private double balance;
	Scanner s = new Scanner(System.in);
	
	public void setbalance() {
		
	System.out.println("Enter Balance Into Account: ");
	balance= s.nextDouble();
	}
	
	public double getBalance() {
        return balance; 
    }
	
	public static void main(String args[])
	{
		Encapsulation e1 = new Encapsulation();	
		e1.setbalance();
		System.out.println("Account Balance Is: " + e1.getBalance());		

}
}
