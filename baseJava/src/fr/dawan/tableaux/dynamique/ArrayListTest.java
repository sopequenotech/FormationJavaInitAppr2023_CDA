package fr.dawan.tableaux.dynamique;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//Tableau d'entier
		ArrayList<Integer> tab1 = new ArrayList<>();
		
		tab1.add(20);
		
		tab1.add(30);
		
		tab1.set(0, 60);
		System.out.println(tab1.get(1));
		
		tab1.add(0, 40);
		System.out.println(tab1.get(0));
		
		System.out.println();
		for(int item : tab1) {
			System.out.println(item);
		}
		
		//[40, 60, 30]  ==> [40, 30, 60]  ) ==> [40, 30]
		tab1.remove(1);
		
		System.out.println();
		for(int item : tab1) {
			System.out.println(item);
		}
		
		if(tab1.contains(40)) {
			System.out.println("L'element 40 est présent dans mon tableau");
		} else {
			System.out.println("L'element 40 n'est pas présent dans mon tableau");
		}
	}

}
