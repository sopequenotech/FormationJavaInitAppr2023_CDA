package fr.dawan.javapoo.enumeration;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
	
		if(user3.getTypeUtilisateur() == TypeUtilisateur.CLIENT) {
			System.out.println("Je suis un client");
		} else if(user3.getTypeUtilisateur() == TypeUtilisateur.ADMIN) {
			System.out.println("Je suis un ADMIN");
		}else if(user3.getTypeUtilisateur() == TypeUtilisateur.PRESTATAIRE) {
			System.out.println("Je suis un presta");
		} else {
			System.out.println("Identifiez vous!!!");
		}
		
	}

}
