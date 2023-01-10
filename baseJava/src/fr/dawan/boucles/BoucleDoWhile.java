package fr.dawan.boucles;

import java.util.Scanner;

/*
 * DO-WHILE
 * Permet de repeter des instructions tant qu'une condition est verifiée 
 * Comme la condition est testée à la fin, on est sure de passer dans le bloc d'instructions 
 * au moins une fois
 */
public class BoucleDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		
		do {
			//Instructions
			System.out.print("Veuillez entrer votre age : ");
			age = input.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit être positif\n");
			}
		}while(age < 0);  //Condition
		
		
		System.out.println("Vous avez " + age + " ans");

	}

}
