package fr.dawan.javapoo.tp_concept_objet;

public class Vendeur extends Commercial {
	
	private final static double POURCENT_VENDEUR = 0.2;
	private final static double BONUS_VENDEUR = 400;
	
	public Vendeur() {
		super();
	}


	public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
	}


	@Override
	public double calculerSalaire() {
		return this.chiffreAffaire*POURCENT_VENDEUR + BONUS_VENDEUR;
	}

	@Override
	public String getTypeUtilisateur() {
		return "Le vendeur " ;
	}
	

}
