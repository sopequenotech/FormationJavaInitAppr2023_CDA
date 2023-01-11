package fr.dawan.tableaux.dynamique;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperTest {

	public static void main(String[] args) {
		
		ArrayList<Integer>  listElmt = new ArrayList<>();
		
		//Parser une chaine de caractère en entier
		String nbre1 = "20";
		String nbre2 = "30";
		int somme = 0;
		int n1 =  Integer.parseInt(nbre1); //retourne un int
		Integer n2 = Integer.valueOf(nbre2);   //retourne un Integer
		
		somme = n1 + n2;
		System.out.println(somme);
		
		//auto-boxing : Convertir les types de données primitifs en leur objet de classe wrapper 
		int a1 = 56; 
		Integer i1 = a1;
		//Utilisation de l'auto-boxing
		listElmt.add(a1);
		
		
		//Unboxing : Convetir l'objet le classe wrapper vers son type primitif
		Integer i2 = 45;
		int a2 = i2;
		//Utilisation de l'unboxing 
		int a3 = listElmt.get(0);
		
		
		

	}

}
