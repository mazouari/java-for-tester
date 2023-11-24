package part2;

public class StaticExemple {

	static int a = 10; // static variable
	int b = 20; // non static variable
	
	static void m1() { // static method
		System.out.println("This is m1 - static method");
		
		// Access to variable b (non static)  directly ==> not possible
		// ==> so create object
		
		StaticExemple se = new StaticExemple();
		System.out.println(se.b);
	}
	
	void m2() {
		System.out.println("This is m2 - non static method");
		
	}
	
	void m3 () {
		System.out.println("This is m3 - non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	public static void main(String[] args) {
		
		//static method can be access only static staff directly ==> without create an object 
		System.out.println(a);
		System.out.println(StaticExemple.a); // By class name
		
		m1();
		StaticExemple.m1(); // By class name
		
	//	System.out.println(b); // incorrect  because b is not static variable 
	//	m2(); // incorrect  because m2 is not static method 
		
		
	//*****	 static method can also access non static staff but through object 
		StaticExemple se = new StaticExemple();
		System.out.println(se.b);
		se.m2();
		se.m3();
		
		
		
	}

}
