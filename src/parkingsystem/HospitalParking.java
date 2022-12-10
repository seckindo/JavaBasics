package parkingsystem;

public class HospitalParking implements ParkingSystem {
	
	int time;
	double surcharge = 0.2;
	
	public HospitalParking(int time) {
		this.time = time;
	}
	
	public double processTicket() {
		
		double fee = 0;
		
		if (time > 0 && time <5) {
			fee = twentyFour + (twentyFour * surcharge);
		} else if (time >= 5 && time <= 17) {
			fee = morning + (morning * surcharge);
		} else if (time > 17 && time <= 24) {
			fee = nightOnly + (nightOnly * surcharge);
		}

		return fee;
	}
	
	

}
