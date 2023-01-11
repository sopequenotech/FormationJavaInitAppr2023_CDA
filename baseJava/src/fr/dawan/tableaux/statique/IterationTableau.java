package fr.dawan.tableaux.statique;

public class IterationTableau {

	public static void main(String[] args) {
		
		int[] tab = {200, 330, 50};
		
		
		//Boucle FOR classique
		for(int i = 0; i < 3; i++) {
			System.out.println("Element à la position " + i + " : " + tab[i]);
		}
		
		//Taille du tableau 
		System.out.println("\nTaille du tableau : " + tab.length + "\n");
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Element à la position " + i + " : " + tab[i]);
			//tab[i] = 500;
		}
		
		
		//Methode 2 : Boucle foreach
		System.out.println("\nBoucle Foreach :  Iteration sur un ensemble de valeur" );
		for(int item : tab) {
			System.out.println(item);
			item = 500;
		}
		
		System.out.println(tab[0]);
		
		
		
		/*
		 * Conclusion : 
		 * Pour modifier une valeur dans le tableau, utiliser l'iteration classique
		 */

	}

}
