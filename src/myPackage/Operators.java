package myPackage;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("-------------- Arithmetic operators-----");
		System.out.println("Sum of a and b is  : " + (a+b));
		System.out.println("Diff of a and b is : " +(a-b)); // without () will do concatenation 
		
		
		// Relational Operators ==> == <>  <=  >= !=
		// Always return boolean value
		System.out.println("************** relational operators *************");
		System.out.println(a==b); //False
		System.out.println(a>b); //False
		System.out.println( a !=b); //true
		
		//Logical Operators && || !
		System.out.println("*****logical operators************");
		boolean x = true;
		boolean y = false;
		System.out.println(x && y); // False
		System.out.println(x || y); // True
		System.out.println(! x); // False
		System.out.println(!y); //  True
		
		// Increment / Decrement Operators
		System.out.println("***************Increment / Decrement operators********");
		a = 20;
		a++; //a=a+1
		System.out.println(a);
		
		b=10;
		b--;
		System.out.println(b);
		
		
	}

}
