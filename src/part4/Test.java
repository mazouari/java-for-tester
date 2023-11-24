package part4;

interface A{  //class A
	int a =10; // By default variables in interface are static and final
	void m1();  // abstract method ( without implementation of code == without body), by default public 
	
}
class B{
	int b;
	
}
public class Test extends B implements A{   //class test herite de B so extends, class test herite du class A donc use implement
	
	//Here we implement the method
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//Here we can access to the method
		Test test = new Test();
		test.m1();
		
	}
}
