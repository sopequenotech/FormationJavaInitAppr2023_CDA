package fr.dawan.condition;

public class OperateurTernaire {

	public static void main(String[] args) {
		
		int nombre = 10; 
		String str = "";
		
		/*
		 * Instruction IF-Else
		 */
		if(nombre > 0) {
			str = "Positif";
		} else {
			str = "Négatif";
		}
		
		/*
		 * Operateur ternaire : Forme condensée de l'instruction if-else qui renvoie une valeur 
		 * Syntaxe ==> Condition ? Instruction1 : Instruction2
		 */
		str = (nombre > 0) ? "Positif" : "Négatif";
	}

}
