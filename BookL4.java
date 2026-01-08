package Lab;


import java.util.ArrayList;

class Book{
	int BookId;
	String BookName;
	String AurthorName;
	
	Book(int BookId,String BookName, String AurthorName){
		
		this.BookId=BookId;
		this.BookName=BookName;
		this.AurthorName=AurthorName;	
	}
}
public class BookL4 {	
	public static void main(String args[]) {
		ArrayList<Book> b= new ArrayList<>();
		
		 b.add(new Book(1, "CEH", "v12"));
		 b.add(new Book(2,"Art of Being Alone","Writer"));
		 
		 for(Book bo: b) {
			 System.out.println("Book Id: "+ bo.BookId);
			 System.out.println("Book Name: "+bo.BookName);
			 System.out.println("Aurthor Name"+bo.AurthorName);
			 
		 }
		
		
	}
}
