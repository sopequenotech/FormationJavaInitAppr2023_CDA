package fr.dawan.javaio;

public class Application {

	public static void main(String[] args) {
		
		Adresse adr1 = new Adresse("Place occitanie", "Toulouse", 31000);
		String path = "C:/tempaDataCDA/adresse.txt";
		try {
			TestSerialisation.toBin(adr1, path);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("NOT OK");
			e.printStackTrace();
		}

	}

}
