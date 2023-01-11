package fr.dawan.javapoo.heritage;

public class Client extends Utilisateur {
	
	private String numClient;
	private boolean subscribe;
	
	
	//Le mot clé "super()" permet d'appeler le constructeur de la classe parente sans paramètre
	public Client() {
		super();
	}


	public Client(String nom, String prenom, String numClient, boolean subscribe) {
		super(nom, prenom);
		this.numClient = numClient;
		this.subscribe = subscribe;
	}


	public Client(String nom, String prenom, int age, String numClient, boolean subscribe) {
		super(nom, prenom, age);
		this.numClient = numClient;
		this.subscribe = subscribe;
	}


	public String getNumClient() {
		return numClient;
	}


	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}


	public boolean isSubscribe() {
		return subscribe;
	}


	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}
	
	

}
