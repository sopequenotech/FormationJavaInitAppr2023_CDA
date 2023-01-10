package fr.dawan.syntaxe_de_base.variable;

public class VariableEtTypes {

	public static void main(String[] args) {

		/*
		 * Déclaration d'une variable : 
		 * Type nom_variable = valeur;
		 * 
		 */
		
		//Type caractère : char 	
		char c = 'a';
		char c1; 
		c1 = 'b';
		
		//Type Entier : byte, short, int, long
		byte b = 1;
		short s = 2; 
		int i = 3; 
		long l = 4;
		
		//Pour plus de visibilité, il est également possible de séparer les milliers 
		//par un underscore (_)
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 : " + l3);
		
		
		//Le types à virgules flottante ou réel : float, double
		double d1 = 5;
		System.out.println("Le contenu de d1 : " + d1);
		
		//Pour les variable de type float, il 
		float f = 0.5F;
		
		//Les type booléen
		boolean bool = true;
		
		//Type complexe 
		String str = "Dawan";
		int[] tab = {200, 300, 50};
		
	}

}
