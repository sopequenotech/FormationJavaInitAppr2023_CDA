package fr.dawan.methodes;

/*
 * Méthode : Un ensemble d'instruction réutilisable  --  éviter de repeter du code 
 * Déclarer une méthode : 
 * Visibilite [mot-clé] type-retour nom-methode(param) {instruction}
 */
public class Methodes {

	static String  str = "toto";
	
	public static void main(String[] args) {

		double[] tab1 = {11.5, 3.4, 17, 16};
		System.out.println(str);
		
		afficher();
		
		afficher(tab1);
		
		int res = somme(2, 50);
		System.out.println(res);
		
		double min = minTableau(tab1);
		System.out.println(min);
		
	}
	
	/**
	 * Methode afficher
	 * void : Si aucune valeur n'est returnée on utilisé le psey-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	//Afficher les éléments d'un tableau
	public static void afficher(double[] tab) {
		for(double item: tab) {
			System.out.print(item + " ");
		}
	}
	
	/**
	 * //Méthod prend deux paramètres int et retourne un entier
	 * @param a : int
	 * @param b  : int
	 * @return   
	 */
	public static int somme(int a, int b) {
		return a + b;
	}
	
	//Méthode qui renvoie la somme des éléments d'un tableau de double 
	public static double somme(double[] tab) {
		double somme = 0.0;
		for (double item : tab) {
			somme += item;
		}
		
		return somme;
	}
	
	//Méthode qui renvoie la moyenne des éléments d'un tableau
	public static double moyenne(double[] tab) {
		double sum = somme(tab);
		double moyenne = sum/tab.length;
		return moyenne;
	}
	
	
	//Méthode qui renvoie l'élément le plus petit d'un tableau
	//[14, 12, 8, 18]
	public static double minTableau(double[] tab) {
		double min = tab[0];
		for(double item : tab) {
			if(min > item) {   //min>item <=> item<min
				min = item;
			}
		}
		return min;
	}
	
}
