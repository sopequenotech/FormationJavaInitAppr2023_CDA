package fr.dawan.javapoo.tp_concept_objet;

public abstract class Employe {

	private String nom;
	private String prenom; 
	private int age;
	private String date;
	
	public Employe() {
	}
	
	public Employe(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	public String getNom() {
		return nom;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	public String getTypeUtilisateur() {
		return "L' employé ";
	}
	
	
	public String getIdentite() {
		return this.getTypeUtilisateur() + this.prenom + this.nom;
	}
	
	public abstract double calculerSalaire();
	
}
