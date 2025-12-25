package practical;

class Vehicle{
	int speed;
	
	public void setspeed(int speed) {
		this.speed=speed;
	}
}
class Car extends Vehicle{
	public void showspeed() {
	System.out.println("Car Speed Is: " + speed);
	}
}
class Bike extends Vehicle{
	public void showspeed() {
		System.out.println("Bike Speed Is: " + speed);
	}
	
}

public class Hierarchicalinheritance {
	public static void main(String args[]) {
		
		Car c1 = new Car();
		c1.setspeed(120);
		c1.showspeed();
		
		Bike b1 = new Bike();
		b1.setspeed(120);
		b1.showspeed();
	}

}
