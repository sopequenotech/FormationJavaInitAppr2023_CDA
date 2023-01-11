package fr.dawan.javapoo.constructeur;

public class Application {

	public static void main(String[] args) {
		
		//Un objet est crée avec le mot clé "new + constructeur"
		Utilisateur user1 = new Utilisateur();	
		user1.prenom = "Guy";
		user1.nom = "Lee";
		System.out.println("Nom User1 : " + user1.nom);

		Utilisateur user2 = new Utilisateur("Culaire", "Laurie");
		System.out.println("Nom et prenom de User2 : " + user2.prenom + " " + user2.nom);
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
		System.out.println(user3.prenom + " " + user3.nom + " : vous avez " + user3.age + " ans");

		System.out.println("Nombre d'utilisateur : " + Utilisateur.nbreUtilisateur);
		
	}

}
