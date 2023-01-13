package fr.dawan.javaexception.exception_personnalisee;

public class Application {

	public static void main(String[] args) {

		Parking parking = new Parking();
		Voiture v = new Voiture();
		
		try {
			parking.garerVoiture(v);
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
		} catch (ParkingPleinException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bloc finally");
		}
		
		try {
			garerVoiture(12);
		} catch (MonException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
	public static void garerVoiture(int nbreVoitureGarer) throws MonException {
		int placeParking = 10;
		if(nbreVoitureGarer > placeParking) {
			throw new MonException("Plus de place sur le parking");
		}
	}

}
