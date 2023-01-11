package fr.dawan.javapoo.encapsulation;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
		System.out.println(user3.getPrenom() + " " + user3.getNom() + 
				" : vous avez " + user3.getAge() + " ans");

		user3.setAge(12);
		
		System.out.println(user3.decrisToi());
		
		System.out.println("Nombre d'utilisateur : " + Utilisateur.getNbreUtilisateur());
		
	}

}
