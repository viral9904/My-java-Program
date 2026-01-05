package Lab;

import java.util.Scanner;

class User{
	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	} 
}
class Employee extends User{

	double salary;
	public Employee(int id, String name,double salary) {
		super(id, name);
		this.salary=salary;			
	}
	double calculateAnnualSalary() {
		return salary *12;
	}
	
}
public class SalaryCalculate {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Id: ");
		int i=s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter Name: ");
		String  n=s.nextLine();
		
		System.out.println("Enter Salary: ");
		double sa=s.nextDouble();
		
		Employee e = new Employee(i,n,sa);
		
		System.out.println("Annual Salary Is: "+ e.calculateAnnualSalary());
		s.close();
	}
}
