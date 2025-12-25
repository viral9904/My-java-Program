package practical;

class A {
 void methodA() {
     System.out.println("Method from class A");
 }
}

class B extends A {
 void methodB() {
     System.out.println("Method from class B");
 }
}

class C extends B {
 void methodC() {
     System.out.println("Method from class C");
 }
}

public class Multiinheritance {
 public static void main(String[] args) {
     C m = new C();

     m.methodA(); 
     m.methodB(); 
     m.methodC(); 
 }
}