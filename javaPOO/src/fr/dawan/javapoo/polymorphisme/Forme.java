package fr.dawan.javapoo.polymorphisme;

public abstract class Forme {

	public Forme() {
		super();
	}
	
	public String decrisToi() {
		return "Je suis la classe abstraite";
	}
	
	public abstract double aire();
	
}
