package fr.dawan.javapoo.polymorphisme;

public class Rectangle extends Forme{

	protected int longueur;
	protected int largeur;

	public Rectangle() {
		super();
	}

	
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}


	@Override
	public double aire() {
		System.out.print("Aire Rectangle : ");
		return this.longueur * this.largeur;
	}


	@Override
	public String decrisToi() {
		return "Je suis un rectangle";
	}



}
