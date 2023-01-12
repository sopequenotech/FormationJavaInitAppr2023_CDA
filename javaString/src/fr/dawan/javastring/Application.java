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

	}

}
