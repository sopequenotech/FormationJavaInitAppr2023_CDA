package fr.dawan.javaexception.exception_personnalisee;

/*
 * Pour créer ses propres exceptions 
 * 1- Heriter de la classe Exception 
 * 2- Appeler le constructeur de la classe exception
 */
public class MonException extends Exception {

	private static final long serialVersionUID = 7716039554362153567L;

	public MonException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
