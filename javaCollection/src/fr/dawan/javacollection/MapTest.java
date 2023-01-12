package fr.dawan.javacollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("1", "Un");
		map.put("2", "Deux");
		map.put("3", "Trois");
		map.put("4", "Quatre");
		map.put("5", "Cinq");
		
		//Afficher les clés du map 
		System.out.println("Clés : " + map.keySet());
		
		//Afficher les valeurs du map 
		System.out.println("Valeurs : " + map.values());
		
		//Parcourir les éléments du map 
		//Map.Entry : Represente une entrée, c'est une pair clé-valeur d'un objet Map
		//entrySet : Retourne un objet qui contient les pairs clé/valeur de la collection Map
		System.out.println("\nParcourir les éléments:");
		for (Map.Entry<String, String> itemMap : map.entrySet()) {
			System.out.println(itemMap.getKey() + " - " + itemMap.getValue());
		}
		
		System.out.println("\nMéthode remove : ");
		map.remove("1");
		System.out.println("Après suppression : " + map);
		
	}

}
