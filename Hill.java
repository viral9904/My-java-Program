package Lab;

class HillStations {
	void location() {
		System.out.println("Locations Is: ");
		
	}
	void famousFor() {
		System.out.println("Famous for: ");
	}
	
}
class Manali extends HillStations {
	void location() {
		System.out.println("Manali Is located in HP");
	}
	void famousFor() {
		System.out.println("Manali Is famous for adventure sports");
		
	}
}
class Mussoorie extends HillStations {
	void location() {
		System.out.println("Mussorie is Located in Uttarakhand");
	}
	void famousFor() {
		System.out.println("Famous for Mall Road");
	}
}
class Gulmarg extends HillStations {
	void location() {
		System.out.println("Gulmarg Is located in j&K ");
	}
	void famousFor() {
		System.out.println("Gulmarh Is famous for Gondola Lift");
	}
}

public class Hill {
	public static void main(String args[]) {
		
		HillStations h1= new HillStations();
		h1.location();
		h1.famousFor();
		System.out.println();
		Manali m1 = new Manali();
		m1.location();
		m1.famousFor();
		System.out.println();
		
		Mussoorie m2 = new Mussoorie();
		m2.location();
		m2.famousFor();
		System.out.println();
		
		Gulmarg g1 = new Gulmarg();
		g1.location();
		g1.famousFor();
		
	}

}
