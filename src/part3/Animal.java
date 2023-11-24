package part3;

//1
public class Animal {             // this is a class

	String color = "White";

	// 2
	void eating() {                 // this is a method
		System.out.println("Eating.................");
	}

	Animal() {                  // this is a constructor
		System.out.println("Animal is created");
	}

}

class dog extends Animal {

	// we can also call this overriding ( different body)
	String color = "Black";

	dog() { // constructor
		super();   // super for constructor
		System.out.println("dog is created");

	}

	void displayColor() {
		System.out.println(color); // Black
		System.out.println(super.color);   //super for method
	}

	void eating() {
		System.out.println("Eating Bread.............");
		super.eating();  // super for method 
	}
}
