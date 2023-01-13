package fr.dawan.javaexception;

public class Application {

	public static void main(String[] args) {

		int nbre = 8;
		
		Utilisateur user1 = new Utilisateur("Rudd", "Emily", 19);
		
		
		/*
		 * Le bloc try-catch permet de traiter les exceptions 
		 * 
		 * Le bloc try permet de definir un ensemble d'instruction à surveiller (ex: nbre/0) 
		 * susceptible de lever une exception
		 * 
		 * Le bloc catch va intercepter les exceptions générées par les instructions du bloc try
		 * 
		 * Le bloc finally est exectuté qu'une exception intervienne ou pas
		 */
		try {
			System.out.println(nbre/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bloc finally");
		}
		
		try {
			user1.setAge(12);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("Continue....");
		
		
	}

}
