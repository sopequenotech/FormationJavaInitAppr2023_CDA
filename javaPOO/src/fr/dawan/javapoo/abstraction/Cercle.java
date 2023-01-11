package fr.dawan.javapoo.abstraction;

public class Cercle extends Forme{
	
	protected double rayon = 4;

	@Override
	public double aire() {
		
		return Math.PI*rayon*rayon;
	}

	@Override
	public String decrisToi() {
		return "Je suis un cercle";
	}

	
	
}
