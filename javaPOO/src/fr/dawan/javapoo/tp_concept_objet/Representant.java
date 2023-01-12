package fr.dawan.javapoo.tp_concept_objet;

public class Representant extends Commercial{

	private final static double POURCENT_REPRESENTANT = 0.2;
	private final static double BONUS_REPRESENTANT = 800;
	
	public Representant() {
	}
	
	
	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculerSalaire() {
		return this.chiffreAffaire*POURCENT_REPRESENTANT + BONUS_REPRESENTANT;
	}

	@Override
	public String getTypeUtilisateur() {
		return " Le representant ";
	}
	
	

}
