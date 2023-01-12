package fr.dawan.javapoo.tp_concept_objet;

public class Technicien extends Employe{
	
	private int nbreUniteProduit; 
	private final static double FACTEUR_UNITES = 5.0;
	
	
	public Technicien() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Technicien(String nom, String prenom, int age, String date, int nbreUniteProduit) {
		super(nom, prenom, age, date);
		this.nbreUniteProduit = nbreUniteProduit;
	}


	@Override
	public double calculerSalaire() {
		return nbreUniteProduit * FACTEUR_UNITES;
	}


	@Override
	public String getTypeUtilisateur() {
		// TODO Auto-generated method stub
		return "Le technicien ";
	}
	
	

}
