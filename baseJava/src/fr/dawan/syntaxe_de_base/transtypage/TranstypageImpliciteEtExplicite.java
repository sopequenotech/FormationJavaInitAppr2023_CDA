package fr.dawan.syntaxe_de_base.transtypage;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {
		
		//Transtypage implicite : Concerne le passage d'un type inferieur vers un type superieur 
		int i = 42; 
		double d = i;
		
		
		//Transtypage explicite : Passage d'un type superieur vers un type inferieur, cela impliquer 
		//de faire un CAST
		int i1 = 123;
		short s =  (short) i1;
		
		//CAST : Concerne les conversions de type compatible
		String str = "11";
		//int i2 = str;
		
		//byte : [-128, 127]
		int i3 = 130;   //-128  -127   -126 
		byte b = (byte) i3;
		System.out.println(b);
		

	}

}
