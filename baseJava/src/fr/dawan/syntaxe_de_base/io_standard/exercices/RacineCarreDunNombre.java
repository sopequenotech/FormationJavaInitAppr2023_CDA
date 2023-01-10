package fr.dawan.syntaxe_de_base.io_standard.exercices;

import java.util.Scanner;

public class RacineCarreDunNombre {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		int nombre;
		
		System.out.println("Sasir un nombre entier : ");
		nombre = clavier.nextInt();
		
		System.out.println("La racine carré de " + nombre + " est égale à " + Math.sqrt(nombre));
		
	
	}

}
