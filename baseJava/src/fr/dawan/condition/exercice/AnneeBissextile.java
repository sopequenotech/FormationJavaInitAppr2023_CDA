package fr.dawan.condition.exercice;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		int annee;

		//Les données  fournies par l'utilisateur
		System.out.print("Veuillez saisir une année : ");
		annee = clavier.nextInt();

		/*
		 * Une année bissextile : 
		 * 	SI l'année est divisible par 4 ET non divisible par 100 : C1 
		 *  OU SI l'année est divisible par 400 : C2
		 */

		if((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
			System.out.println(annee + " est une année bissextile");
		}else {
			System.out.println(annee + " n'est pas une année bissextile");
		}
		
		
		//Exemple avec opérateur ternaire
//		String str = ((annee % 4 == 0 && annee % 100 != 0)  || (annee % 400 == 0)) 
//						? "L'année "+ annee +" est une année bissextile" 
//						: "L'année "+ annee +" n'est pas une année bissextile";
//		
//        System.out.println(str);

	}

}
