package fr.dawan.javapoo.object_;

public class Application {

	public static void main(String[] args) {
		CompteBancaire cb1 = new CompteBancaire("Pat", "aa222fff", 20000);
		System.out.println(cb1);  // Idem : System.out.println(cb1.toString());
		
		CompteBancaire cb2 = new CompteBancaire("Guy", "5454dddd", 80000);
		CompteBancaire cb3 = new CompteBancaire("Guy", "5454dddd", 80000);
		
		//Pour les types complexes, l opérateur == entre les objets compare l'adresse (reference)
		System.out.println("L'utilisation de l'opérateur == : " + (cb2 == cb3)); 
	
		System.out.println("L'utilisation de la méthode equals : " + cb2.equals(cb3));
	}
}
