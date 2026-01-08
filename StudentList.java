package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1{
	
	int Marks;
	String Name;
	
	Student1(int Marks,String Name){
		this.Name=Name;
		this.Marks=Marks;
		
	}
}
public class StudentList {
	
public static void main(String args[]) {
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("How Many Student: ");
	int n=s.nextInt();
	s.nextLine();
	
	
	List<Student1> st= new ArrayList<>();
	for(int i=0;i<n;i++) {
		
	System.out.println("Enter Student Name: ");
	String Name=s.nextLine();
	
	System.out.println("Enter Student Marks:");
	int Marks=s.nextInt();
	
	st.add(new Student1(Marks,Name));
	}
	System.out.println("Student Details: ");
	for(Student1 stu :st) {
		System.out.println("Student Name:" +stu.Name +"\n"+ "Student Marks: "+stu.Marks);
	}
	s.close();
}
}
