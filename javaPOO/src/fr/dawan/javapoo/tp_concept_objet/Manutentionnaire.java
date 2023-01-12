package fr.dawan.javapoo.tp_concept_objet;

public class Manutentionnaire extends Employe{

	private int nbreHeure;
	private final static double SALAIRE_HORAIRE = 65.0;
	
	public Manutentionnaire() {
		// TODO Auto-generated constructor stub
	}
	
	public Manutentionnaire(String nom, String prenom, int age, String date, int nbreHeure) {
		super(nom, prenom, age, date);
		this.nbreHeure = nbreHeure;
	}


	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return nbreHeure* SALAIRE_HORAIRE;
	}


	@Override
	public String getTypeUtilisateur() {
		// TODO Auto-generated method stub
		return "Le manutentionnaire ";
	}
	
	

}
