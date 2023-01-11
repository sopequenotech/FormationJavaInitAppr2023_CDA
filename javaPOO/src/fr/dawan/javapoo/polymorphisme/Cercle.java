package fr.dawan.javapoo.polymorphisme;

public class Cercle extends Forme{
	
	protected double rayon;
	
	public Cercle() {
		super();
	}
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}


	@Override
	public double aire() {
		System.out.print("Aire cercle : ");
		return Math.PI*rayon*rayon;
	}

	@Override
	public String decrisToi() {
		return "Je suis un cercle";
	}

	
	
}
