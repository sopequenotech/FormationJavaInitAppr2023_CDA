package fr.dawan.javaexception.exception_personnalisee;

/*
 * Pour créer ses propres exceptions 
 * 1- Heriter de la classe Exception 
 * 2- Appeler le constructeur de la classe exception
 */
public class ParkingPleinException extends Exception {

	private static final long serialVersionUID = 3250529185162996352L;

	public ParkingPleinException() {
		super("Il n'y a plus de place sur le parkings");
	}
}
