package part2;

public class ThisKeyWord {

	
int a, b;
//	void getValues(int x, int y) {
//		a=x;
//		b=y;
//	}
	
	
	void getValues(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	void printValues() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		ThisKeyWord tk = new ThisKeyWord();
		tk.getValues(10,20);
		tk.printValues();
	}

}
