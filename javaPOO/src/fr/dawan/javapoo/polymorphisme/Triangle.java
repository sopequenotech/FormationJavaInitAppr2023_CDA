package fr.dawan.javapoo.polymorphisme;

public class Triangle extends Forme{

	protected double base;
	protected double hauteur;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double base, double hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}

	@Override
	public double aire() {
		System.out.print("Aire Triangle : ");
		return base * hauteur * 0.5;
	}

	@Override
	public String decrisToi() {
		return "Je suis la classe Triangle";
	}

	 
	
}
