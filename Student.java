package practical;

import java.util.Scanner;

class Info {
	int id;
	String name;
	Scanner s = new Scanner(System.in);
	
	Info(int id, String name){
		
		this.id=id;
		this.name=name;
	}
	void details() {
		
		System.out.println("Enter Student Id:");
		id= s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter Student Name :");
		name= s.nextLine();
	}
	void display()
	{
		System.out.println("Student Id Is:"+ id);
		System.out.println("Student Name Is:"+ name);
		
	}
	void study()
	{
		System.out.println("Student is studing");
	}
		
}
public class Student{
	public static void main(String args[]) {
		
		Info f1= new Info(10,"AAA");
		f1.details();
		f1.display();
		f1.study();
		
	}
}