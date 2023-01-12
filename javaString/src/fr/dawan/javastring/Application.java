package fr.dawan.javastring;

public class Application {

	public static void main(String[] args) {
		
		//Construction implicite via String litteral 
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		//Construction avec new 
		String s3 = new String("Hello World");
		String s4 = new String("Hello World");
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1 == s3); //false 
		System.out.println(s3 == s4); //false 
		
		System.out.println(s1.equals(s3));  //true
		
		String str ="test";
		System.out.println(str.charAt(2)); // s
		
		//Un objet de type String est immuable   
		str = str.concat("e");   //"test" + "e"
		System.out.println(str);  //teste
		
		//[0, 3[  ... tes
		System.out.println("substring(0, 3) : " + str.substring(0, 3)); //tes
		System.out.println("substring(2) : " + str.substring(2)); //ste
		
		//StringBuilder : Mutable (Muable)
		StringBuilder stb2 = new StringBuilder("test");
		StringBuilder stb3 = new StringBuilder("test");
		System.out.println("Comparaison de reference StringBuilder : " + (stb2 == stb3));  //false
		
		System.out.println(stb2.append("e"));
		
		System.out.println("6" + 4 + 5);  //645
		System.out.println(4 + 5 + "7");  //97
		System.out.println("6" + (5 - 4));  // *, /, %, +, -
		
		
		int x = 5 + 'A';  //Code ASCII de A est égale à 65
		System.out.println(x);
		
		char x1 = 5 + 'A';  //70 ==> 'F'
		System.out.println(x1);
		


	}

}
