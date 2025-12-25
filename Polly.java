package practical;

class bank {

 double getInterest() {
     return 0.0; 
 }
}

class Sbi extends bank {
 @Override
 double getInterest() {
     return 7.5; 
 }
}

public class Polly {
 public static void main(String[] args) {
     bank b = new bank();
     bank s = new Sbi(); 

     System.out.println("Bank Interest: " + b.getInterest() + "%");
     System.out.println("SBI Interest: " + s.getInterest() + "%");
 }
}