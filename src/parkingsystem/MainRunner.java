package parkingsystem;

public class MainRunner {

	public static void main(String[] args) {

		MallParking m1 = new MallParking(5);
		System.out.print("Price for mall parking is $");
		System.out.format("%.2f%n", m1.processTicket());
		
		HospitalParking h1 = new HospitalParking(1);
		System.out.print("Price for hospital parking is $");
		System.out.format("%.2f%n", h1.processTicket());
		

	}

}
