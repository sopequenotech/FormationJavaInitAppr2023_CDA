package fr.dawan.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {

		/*
		 * Expression d'un test conditionnel 
		 * Si (condition est vraie) 
		 * 		instructions 
		 * Sinon 
		 * 	 d'autre instructions
		 * 
		 * Le bloc If (quand la condition est vraie) 
		 * Le bloc Else (traite tous les autres cas : quand la condition est fausse)
		 * 
		 * Le bloc Else-If (traite un cas)
		 */
		Scanner clavier = new Scanner(System.in);
		int nbre = 0;
		
		
		System.out.println("Entrer un nombre svp : ");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			System.out.println("Le nombre est positif");
		} else if(nbre == 0) {
			System.out.println("Le nombre est égal à 0");
		} else if(nbre * nbre == 25) {
			System.out.println("Le nombre rentré est égal " + nbre);
		}
		else {
			System.out.println("Le nombre est négatif");
		}
		
		
	}

}
