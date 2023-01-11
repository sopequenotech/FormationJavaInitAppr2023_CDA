package fr.dawan.javapoo.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Forme> formes = new ArrayList<>();
		formes.add(new Cercle(2));
		formes.add(new Rectangle(5, 7));
		formes.add(new Rectangle(5, 7));
		formes.add(new Triangle(5, 10));
		
		
		/*
		 * Manipuler des objets sans se soucier de leur type
		 * indice 0 : forme = new Cercle()
		 * indice 1 : forme = new Rectangle()
		 * indice 2 : forme = new Rectangle()
		 * indice 3 = forme = new Triangle()
		 */
		for (Forme forme : formes) {
			System.out.println(forme.aire());
		}
		
		Forme forme= new Rectangle(10, 7);
		
		List<Forme> lstFormes = new ArrayList<>();
		
	}

}
