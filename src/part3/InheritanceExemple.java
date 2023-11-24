package part3;

class A{
	int a;
	void display() {
		
		System.out.println(a);
	}
}

class B extends A {  // B is child class, A is parent class
	int b;
	void print() {
System.out.println(b);
	}
}


class C extends B {
	int c;
	void show() {
		System.out.println(c);
	}
}

public class InheritanceExemple {

	public static void main(String[] args) {
		// single
		
		A aobj = new A();
		aobj.a=100;
		aobj.display();
		
		B bobj = new B();
		bobj.b=20;
		bobj.a=10;
		bobj.print();
		bobj.display();
		
		// Multilevel
		
		C cobj = new C();
		cobj.a=60;
		cobj.b=90;
		cobj.c=15;
		cobj.display();
		cobj.print();
		cobj.show();
		

	}

}
