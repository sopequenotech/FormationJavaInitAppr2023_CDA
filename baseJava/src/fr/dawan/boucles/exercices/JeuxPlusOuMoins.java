package fr.dawan.boucles.exercices;

import java.util.Scanner;

public class JeuxPlusOuMoins {
	
	public static void main(String[] args) {
		//Variable à utiliser :
				//nombre_secret : nombre generé aléatoirement 
				//nombreUtilisateur : nombre entré par l'utilisateur 
				//nombreDessai : Permet de savoir en combien de coup l'utilisateur a trouvé le nombre
			
			
				//Nombre secret
				//Math.ramdom() ==> [0.0, 1.0]  
				//[1, 1000]
			
			//Entrer un nombre entre (1 - 1000): 800
			//Votre nombre est trop petit 
			//Entrer un nombre entre (1 - 1000): 900
			//Votre nombre est trop petit 
			//Entrer un nombre entre (1 - 1000): 950
			//Votre nombre est trop petit 
			//Entrer un nombre entre (1 - 1000): 990
			//Votre nombre est trop grand
			//Entrer un nombre entre (1 - 1000):980
			
			//Trouver en 5 essais : Bravo 
			
			Scanner clavier = new Scanner(System.in);
			
			//Nombre générer par l'ordinateur, que l'utilisateur devra trouvé 
			int nombre_sercret;
			//Nombre que l'utilisateur rentrera à chaque fois
			int nombreUtilisateur;
			//Permet à l'utilisateur de savoir en combien de coup il a trouvé le nombre
			int nombreDEssai = 0;
			
			//Nombre secret
			int max = 1000;
			int min = 1;
			int range = max - min + 1;
			nombre_sercret = (int) ((Math.random() * range) + min);
			
			System.out.println(nombre_sercret);
			
			
			do {
				nombreDEssai++;  
				System.out.print("Entrer un nombre entre (1 - 1000): ");
				nombreUtilisateur = clavier.nextInt();
				if(nombreUtilisateur > nombre_sercret) {
					System.out.println("Votre nombre est trop grand");
				} else if (nombreUtilisateur < nombre_sercret) {
					System.out.println("Votre nombre est trop petit ");
				}
			}while(nombreUtilisateur != nombre_sercret);
			
			System.out.println("Trouver en " + nombreDEssai + " essais ! Bien joué");

	}
}
