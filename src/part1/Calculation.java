package part1;

public class Calculation {
	int x = 10;
	int y = 20;

//			1/case 1 : not tacking parameters and also not return any value 
	void sum1() {
		// body
		System.out.println(x + y);
	}

//			2/case2 : not tacking parameters but returning value 
	int sum2() {
		return (x + y);
	}

//			3/case3: tacking parameters but not returning value 
	void sum3(int a, int b) {
		System.out.println(a + b);
	}

//			4/case4: tacking parameters and also returning value

	int sum4(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();
		cal.sum1();// case1
		
		int res = cal.sum2(); // case2
		System.out.println(res);
		
		cal.sum3(30, 40);// case3

		System.out.println(cal.sum4(300, 200)); // case 4
	}

}
