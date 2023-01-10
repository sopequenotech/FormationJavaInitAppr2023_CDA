package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		
		while(age < 0) {  //Condition
			//Instructions
			System.out.print("Veuillez entrer votre age : ");
			age = input.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit être positif\n");
			}
		}

		System.out.println("Vous avez " + age + " ans");

	}

}
