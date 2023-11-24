package part2;

public class MethodOverLoading {
	
	//Same name of method - different parameters
	
	void add(int a, int b) {            //1
		System.out.println(a+b);
	}
	void add(int a, double b) {         //2
		System.out.println(a+b);
	}
	
	void add(double a, double b) {         //3
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {         //4
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		MethodOverLoading mo = new MethodOverLoading();

				mo.add(105,205);
		mo.add(10, 12.50);
		mo.add(2, 35);
		mo.add(1, 2, 3);
	}

}
