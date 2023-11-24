package part3;

public class FinalvariableDemo {
	final int speed = 600;
	

	public static void main(String[] args) {
		FinalvariableDemo fd = new FinalvariableDemo();
		fd.speed=700; // compile time error because of final keyword
		System.out.println(fd.speed);
		
		
	}

}
