package Lab;

import java.util.Scanner;

public class Bankmgmt {
	double bal;
	
	Bankmgmt(double bal){
		this.bal=bal;
	}
	void withdraw(Double withdrawAmt) {
		
		String msg=(withdrawAmt <= bal) ?"Withdraw Sucessfully " : "Insufficient Balanace ";
		System.out.println(msg);
		
		if(withdrawAmt <= bal) {
			bal= bal - withdrawAmt;
		}
		}
	void deposit (double depositAmt) {
		bal = bal+ depositAmt;	
		System.out.println("Deposit Sucessfuly!!!!");
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Intial Balanace: ");
		double n=s.nextDouble();
		
		Bankmgmt b= new Bankmgmt(n);
		
		System.out.println("Enter Amount to Withdraw: ");
		double w=s.nextDouble();
		
		b.withdraw(w);
		
		System.out.println("Total Balance: "+b.bal);
		
		System.out.println("Enter Amount to Deposit: ");
		double d=s.nextDouble();
		
		b.deposit(d);
		
		System.out.println("Total Balance: "+b.bal);
		s.close();
		
	}

}
