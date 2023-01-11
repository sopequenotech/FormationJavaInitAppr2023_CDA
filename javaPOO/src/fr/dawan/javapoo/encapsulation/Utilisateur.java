package fr.dawan.javapoo.encapsulation;

public class Utilisateur {
	
	private String nom;		
	private String prenom; 
	private int age;		
	
	private static int nbreUtilisateur;
	
	
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	public Utilisateur(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		this.age = age;

	}
	
	//GETTER 
	public int getAge() {
		return this.age;
	}
	
	//SETTER
	public void setAge(int age) {
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}	
	}
	
	
	//Creer les getters et setters pour l'attribut nom et prenom 
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}
	
	public String decrisToi() {
		return "Je m'appelle " + this.nom + " " + this.prenom + " et j'ai " + this.age + " ans";
	}

}
