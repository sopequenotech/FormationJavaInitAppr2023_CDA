package fr.dawan.boucles;

public class BoucleFor {

	public static void main(String[] args) {
		
		/*
		 * Exemple1 : Utilité des boucles
		 * On constate que l'écriture est fastidieuse et longue, c'est du copier-coller 
		 * Solution : Utiliser les boucles (For, While, DO-While)
		 */
//		System.out.println("Le double de 1 est : " + 1*2);
//		System.out.println("Le double de 2 est : " + 2*2);
//		System.out.println("Le double de 3 est : " + 2*3);
//		System.out.println("Le double de 4 est : " + 2*4);
//		System.out.println("Le double de 5 est : " + 2*5);
//		System.out.println("Le double de 6 est : " + 2*6);
//		System.out.println("Le double de 7 est : " + 2*7);
//		System.out.println("Le double de 8 est : " + 2*8);
//		System.out.println("Le double de 9 est : " + 2*9);
//		System.out.println("Le double de 10 est : " +2*10);
		
		
		
		/*
		 * L'interêt des boucles : 
		 * 	Le rôle des boucles est de repeter un certain nombre de fois les mêmes opérations 
		 *  Les boucles s'executent tant qu'une condition est remplie
		 */
		
		//Solution 1 : Boucle FOR 
		//La boucle FOR s'utilise quand on connait le nombre d'itération 
		//(Le nombre de fois qu'on execute une instruction)
		for(int i = 1; i <= 10; i++) {
			System.out.println("Le double de " + i + " est " + i*2);
		}
		
		
		
		
	}

}
