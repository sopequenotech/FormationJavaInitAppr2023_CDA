package fr.dawan.javapoo.abstraction;

public class Rectangle extends Forme{

	protected int longueur = 7;
	protected int largeur = 5;

	protected int prop1 = 20;



	//	public Rectangle() {
	//		super();  //Appelle le constructeur de la classe parente 
	//		System.out.println("Je suis dans la classe Rectangle");
	//	}
	//	

	//Le mot clé super permet d'appeler des méthodes et attributs de la classe mère
	public Rectangle() {
		super();
		System.out.println(super.prop1 + this.prop1);
	}

	@Override
	public double aire() {
		return this.longueur * this.largeur;
	}






	@Override
	public String decrisToi() {
		return "Je suis un rectangle";
	}



}
