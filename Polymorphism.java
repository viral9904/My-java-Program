package practical;


class animal {
	
	void sound() {
		System.out.println("Animal Make sound");
	}
}
class dog extends animal{
	@Override
	void sound() {
		System.out.println("Dog is barknig...");
	}
	
}
public class Polymorphism {
	public static void main(String args[]) {
		
		animal d1 = new dog();
		d1.sound();
	}

}
