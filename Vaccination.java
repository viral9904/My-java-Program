package Lab;

import java.util.Scanner;

abstract class Vaccine{
	int age;
	String nationality;
	
	Vaccine(int age ,String nationality){
		this.age =age;
		this.nationality =nationality;
	}
	public boolean firstDose() {
		if(nationality.equals("Indian") && age >= 18) {
			System.out.println("First Does taken sucessfully,  Now You have to pay 250r.");
			return true;
		}else {
			System.out.println("Not eligible for Vaccine");
			return false;
		}
	}
	public void secondDose(boolean fisrDosecompleted) {
		if(fisrDosecompleted) {
			System.out.println("Second Does taken sucessfully ");
		}
		else
			System.out.println("Take First Does First!!!");
	}
	public abstract void boosterDose();
	
}
class vaccinationSuccessful extends Vaccine{

	vaccinationSuccessful(int age, String nationality) {
		super(age, nationality);	
	}

	@Override
	public void boosterDose() {
		System.out.println("booster does taken sucessfully");
		
	}
	
}

public class Vaccination {
	public static void main(String args[]) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Your Age: ");
	int a=s.nextInt();
	s.nextLine();
	
	System.out.println("Enter Your Nationality: ");
	String n=s.nextLine();
	
	vaccinationSuccessful v = new vaccinationSuccessful(a,n);	
	
	boolean fd = v.firstDose();
		v.secondDose(fd);
		
		if(fd) {
			v.boosterDose();
		}
		s.close();
	
	}

}
