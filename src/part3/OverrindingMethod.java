package part3;

class bank{
	double intereseRate () {
		return 0;
	}
}

class SBI extends bank{
	//same name 
	
	double intereseRate() {
		return 10.2;
	}
}

class ICII extends bank {
	
	double intereseRate() {
		return 5.5;
}
}

class AXA extends bank {
	
	double intereseRate() {
		return 50.5;
}
}

	
public class OverrindingMethod {

	public static void main(String[] args) {
		
SBI sbi = new SBI();
System.out.println(sbi.intereseRate());

ICII icii = new ICII();
System.out.println(icii.intereseRate());


	}

}
