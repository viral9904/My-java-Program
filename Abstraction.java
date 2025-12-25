package practical;

abstract class  shape{
	abstract void draw();
}
class circle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing circle..");
		
	}
}
public class Abstraction {

	public static void main(String args[]) {
		shape s1 = new circle();
		
		s1.draw();
	}
}
