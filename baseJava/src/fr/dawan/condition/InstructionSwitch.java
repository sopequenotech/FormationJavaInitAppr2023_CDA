package fr.dawan.condition;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		
		System.out.println("Bonjour");
		
		Scanner input = new Scanner(System.in);
		int jours = 1;
		
		System.out.println("Saisir le numero du jour : ");
		
		jours = input.nextInt();
		
		//Solution 1: Bloc Else-IF 
//		if(jours == 1) {
//			System.out.println("Lundi");
//		}else if (jours == 2) {
//			System.out.println("Mardi");
//		} else if (jours == 3) {
//			System.out.println("Mercredi");
//		} else if(jours == 4) {
//			System.out.println("Jeudi");
//		}else if(jours == 5) {
//			System.out.println("Vendredi");
//		}else if(jours == 6) {
//			System.out.println("Samedi");
//		}else if(jours == 7) {
//			System.out.println("Dimanche");
//		} else {
//			System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
//		}
		
		//2ème solution : Instruction Switch
		//C'est une variante du IF/ELSE
		
//		switch(jours) {
//		case 1 : 
//			System.out.println("Lundi");
//			break;
//		case 2: 
//			System.out.println("Mardi");
//			break;
//		case 3: 
//			System.out.println("Mercredi");
//			break;
//		case 4: 
//			System.out.println("Jeudi");
//			break;
//		case 5: 
//			System.out.println("Vendredi");
//			break;
//		case 6: 
//			System.out.println("Samedi");
//			break;
//		case 7: 
//			System.out.println("Dimanche");
//			break;
//		default : 
//			System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
//			break;
//		}
		
		
		// jours 1, 2, 3, 4, 5 : semaine de travail 
		//jours 6, 7: Week end
		// A partir de Java 14 
		switch(jours) {
			case 1, 2, 3, 4, 5: 
				System.out.println("Semaine de travail");
			break;
			case 6, 7 : 
				System.out.println("Week end");
			break;
			default : 
				System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
				break;
		}
		
		
		//Java 8
//		switch(jours) {
//		case 1:
//		case 2: 
//		case 3: 
//		case 4: 
//		case 5: 
//			System.out.println("Semaine de travail");
//		break;
//		case 6: 
//		case 7 : 
//			System.out.println("Week end");
//		break;
//		default : 
//			System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
//			break;
//	}
		

	}

}
