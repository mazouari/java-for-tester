package part4;

interface ABC {
	int x=100;  //type final
	void m1();
	}

interface XYZ {
	int y=200;
	void m2();
	
}
public class MultipleInheretance implements ABC, XYZ{
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		
		MultipleInheretance test = new MultipleInheretance();
		test.m1();
		test.m2();

	}

}
