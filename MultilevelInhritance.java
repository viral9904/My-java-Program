package practical;

import java.util.Scanner;

class Person{
	
	String name;	
	public Person(String name) {
		this.name=name;
	}
}
class Employee extends Person{
	 int empid;
	 double salary;
	public Employee(String name, int empid, double salary) {
		super(name);
		this.empid=empid;
		this.salary=salary;
}
}
class Manager extends Employee{

	public Manager(String name, int empid, double salary) {
		super(name, empid, salary);
	}
		public void display() {
			
			System.out.println("Name:"+ name);
			System.out.println("EmpId:"+ empid);
			System.out.println("salary:"+ salary);
		}
}  
	

public class MultilevelInhritance {
    public static void main(String args[]) {
    	
    	Scanner s = new Scanner (System.in);
    	
    	System.out.println("Enter Name:");
    	String name=s.nextLine();
    	
    	System.out.println("Enter Employee Id:");
    	int empid=s.nextInt();
    	
    	System.out.println("Enter Salary:");
    	double salary=s.nextDouble();
        Manager m1 = new Manager(name,empid,salary);
        m1.display();
        s.close();
    }
}
