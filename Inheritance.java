package practical;

class Animal {

    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();  
        d.bark();  
    }
}
