package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursMathematique {

	public static void main(String[] args) {

		int var1 = 4; 
		int var2; 
		var2 = 10; 

		//Addition 
		int somme = var1 + var2;
		System.out.println("Somme = " + somme);

		//Soustraction 
		int sub = var1 - var2;
		System.out.println("sub = " + sub);

		//Multiplication 
		int mult = var1 * var2;
		System.out.println("mult = " + mult);

		//Division 
		double division = (double) var1 / var2;
		System.out.println("quotient = " + division);
		
		//Modulo : permet d'avoir le reste de la division entiere (euclidienne =>  b = a*q + r)
		//10 = 4 * 2 + 2  ==> r = 2 
		int modulo = var2 % var1;
		System.out.println("result = " + modulo);
		
	}

}
