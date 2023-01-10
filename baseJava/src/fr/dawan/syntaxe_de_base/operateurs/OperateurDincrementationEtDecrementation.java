package fr.dawan.syntaxe_de_base.operateurs;

public class OperateurDincrementationEtDecrementation {

	public static void main(String[] args) {
		
		int c = 10; 

		c++;  //c =  c + 1;  //11
		System.out.println(c);
		
		int d = 15; 
		d--;  //d = d- 1
		System.out.println(d);
		
		/*
		 * Post-Incrementation et le Pré-Incrementation 
		 * Pré-incrementation ==>  ++e :   on ajoute d'abord 1 et ensuite on affiche e 
		 * On incremente avant d'afficher 
		 * 
		 * Post-incrementation  ==>  e++:  on affiche e et après on ajoute 1 
		 * on affiche avant d'incrementer
		 */
		int e = 10; 
		System.out.println("Post-incrementation : " + e++);  //10	
		System.out.println("Pré-incrementation : " + ++e); 
		
		int f = 10; 
		System.out.println("Pré-incrementation : " + ++f);  	
		System.out.println("Post-incrementation : " + f++); 

	}

}
