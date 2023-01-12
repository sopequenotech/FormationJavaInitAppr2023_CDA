package fr.dawan.javapoo.tp_concept_objet;

public abstract class Commercial extends Employe{

	protected double chiffreAffaire;
	
	public Commercial() {
		// TODO Auto-generated constructor stub
	}

	public Commercial(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}
	
}
