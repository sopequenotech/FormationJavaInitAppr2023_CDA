package fr.dawan.javaio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * L'utilisation du Buffer permet dune amélioration des performances de notre code 
 * Dans le cas ouù on a à lire une enorme fichier texte
 */
public class TestSerialisation {

	public static void toBin(Adresse adresse, String path) throws Exception {
		
		//1- Ouverture du flux en écriture
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//2- Ecriture 
		oos.writeObject(adresse);
		
		//3-Fermeture du flux
		oos.close();
		bos.close();
		fos.close();
		
	}
	
	//Deserialisation : fromBin
	
	
	
}
