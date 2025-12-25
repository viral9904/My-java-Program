package practical;

class animal1 {
 void eat() {
     System.out.println(" animal is eating.");
 }
}

class dog1 extends animal1 {
 void bark() {
     System.out.println("The dog bark");
 }
}

class cat extends animal1 {
 void meow() {
     System.out.println("The cat  Meow");
 }
}

public class Hybrid {
 public static void main(String[] args) {
	 dog1 d = new dog1();
	 cat c = new cat();

     d.eat(); 
     c.eat();

     d.bark();
     c.meow();
 }
}