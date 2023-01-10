package fr.dawan.syntaxe_de_base.io_standard.exercices;

import java.util.Scanner;

public class PermutDeuxVariables {

	public static void main(String[] args) {
		
		int nombre1, nombre2, temp;
		Scanner input = new Scanner(System.in);
		
	
		//Fournir les données d'entrée
		System.out.print("Veuillez entrer le premier nombre : ");
		nombre1 = input.nextInt();
		System.out.print("Veuillez entrer le deuxième nombre : ");
		nombre2 = input.nextInt();
		
		System.out.println("Avant permutation : " + " nombre1 = " + nombre1 + ", nombre2 = " + nombre2);
		
		//Traitement 
		temp = nombre1; 
		nombre1 = nombre2;
		nombre2 = temp;
		
		System.out.println("Après permutation : " + " nombre1 = " + nombre1 + ", nombre2 = " + nombre2);

	}

}
