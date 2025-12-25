package practical;

interface a {
 void print(); 
}

class b implements a {
 @Override
 public void print() {
     System.out.println("Interface program");
 }
}

public class Interface {
 public static void main(String[] args) {
	 
     b i = new b();
     
     i.print();
 }
}