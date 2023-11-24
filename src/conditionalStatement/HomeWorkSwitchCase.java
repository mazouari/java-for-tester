package conditionalStatement;

public class HomeWorkSwitchCase {

	public static void main(String[] args) {
		String mois = "fevrier";

		switch (mois) {
		case "janvier":
			System.out.println("trimestre 1");
			break;
		case "fevrier":
			System.out.println("trimestre 1");
			break;
		case "Mars":
			System.out.println("trimestre 1");
			break;
		case "Avril":
			System.out.println("trimestre 2");
			break;
		case "Mai":
			System.out.println("trimestre 2");
			break;
		case "Juin":
			System.out.println("trimestre 2");
			break;
		case "Juillet":
			System.out.println("trimestre 3");
			break;
		case "Aout":
			System.out.println("trimestre 3");
			break;
		case "Septembre":
			System.out.println("trimestre 3");
			break;
		case "Octobre":
			System.out.println("trimestre 4");
			break;
		case "Novembre":
			System.out.println("trimestre 4");
			break;
		case "decembre":
			System.out.println("trimestre 4");
			break;
			
		default:
			System.out.println("Not valid Month");
			break;

		}

	}

}
