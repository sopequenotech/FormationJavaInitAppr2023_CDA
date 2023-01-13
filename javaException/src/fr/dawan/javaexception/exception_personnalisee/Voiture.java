package fr.dawan.javaexception.exception_personnalisee;


public class Voiture {

	private String marque;
	private String immatriculation;
	private int vitesse;
	
	public Voiture() {
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, String immatriculation, int vitesse) {
		super();
		this.marque = marque;
		this.immatriculation = immatriculation;
		this.vitesse = vitesse;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getImmatriculation() {
		return immatriculation;
	}


	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", immatriculation=" + immatriculation + ", vitesse=" + vitesse + "]";
	}
	
	
	
}
