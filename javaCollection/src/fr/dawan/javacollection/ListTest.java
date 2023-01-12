package fr.dawan.javacollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("bbb");
		list.add("eee");

		System.out.println("**********Boucle classique*************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		

		//Interface Set (n'accepte pas les doublons)
		Set<String> listStr = new HashSet<>();
		listStr.add("aaa");
		listStr.add("bbb");
		listStr.add("ccc");
		listStr.add("bbb");
		listStr.add("eee");

		System.out.println("\n***********Boucle FOREACH*********************");
		for (String item : listStr) {
			System.out.println(item);
		}



	}

}
