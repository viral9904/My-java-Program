package practical;

import java.util.Scanner;

class Bank{
	
	protected String name;
	protected double bal;
	
	public Bank(String name, double bal) {
		this.name=name;
		this.bal=bal;
	}
	
	public void deposit(double amount) {
		bal+= amount;
		System.out.println("Deposited" + amount);	
	}
}
class SavingAccount extends Bank{

	public SavingAccount(String name, double bal) {
		super(name, bal);
	}
	
	public void showbal() {
		System.out.println("Name:" + name);
		System.out.println("Balancee:" + bal);
	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Accoun Holder Name:");
		String name=s.nextLine();
		
		System.out.println("Enter Initial Balance: ");
		double initialbal= s.nextDouble();
		
		SavingAccount ac = new SavingAccount("Jack", 10000);
		ac.showbal();
		
		System.out.println("Enter amount to deposit:");
		double d_bal= s.nextDouble();
		ac.deposit(d_bal);
		
		ac.showbal();
		s.close();
		
	}

}
