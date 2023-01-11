package fr.dawan.javapoo.abstraction;

public class Triangle extends Forme{

	protected double base = 4;
	protected double hauteur = 2;
	
	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}

	@Override
	public String decrisToi() {
		return "Je suis la classe Triangle";
	}

	 
	
}
