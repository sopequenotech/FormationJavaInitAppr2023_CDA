package fr.dawan.syntaxe_de_base.io_standard;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int n = 0; 
		double var1 = 0.0; 
		

		//1: Entrer un nombre entier :  
		//2: Utilisateur entre le nombre  
		//3: Le carre de 2 est 4
		
		System.out.print("Entrer un nombre entier : ");
		n = clavier.nextInt();
		System.out.println("Le double de " + n + " est " + (n+n));
		
		System.out.println("Entrer un nombre réel : ");
		var1 = clavier.nextDouble();
		System.out.println("Vous avez entré : " + var1);
	}

}
