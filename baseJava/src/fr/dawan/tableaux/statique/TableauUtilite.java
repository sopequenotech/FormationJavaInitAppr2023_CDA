package fr.dawan.tableaux.statique;

import java.util.Scanner;

public class TableauUtilite {

	public static void main(String[] args) {
		
		//Interet des tableaux : 
		Scanner input = new Scanner(System.in);
		int age1, age2;
		double moyenne;
		
		System.out.println("Entrer l'age de l'utilisateur1 : ");
		age1 = input.nextInt();
		
		System.out.println("Entrer l'age de l'utilisateur : ");
		age2 = input.nextInt();
		
		moyenne = (age1 + age2) / 2;
		System.out.println("La moyenne des ages est : " + moyenne);
		
		/*
		 * Conclusion : 
		 * Si on a une quantité importante de donnée de même type (par exemple 100 utilisateurs) 
		 * Il va falloir déclaré 100 variables, ce qui est trop long, fastidieux, une perte pour 
		 * le développeur
		 * 
		 * Pour resoudre ce probmème, on va utiliser les tableaux qui permettent de stocker 
		 * des éléments de même type (ex: tableau d'entier, de chaine de caractère)
		 * 
		 */

	}

}
