package myPackage;

public class StringMethods {

	public static void main(String[] args) {
	
		String s = "Welcome";
		String s1 = " to java";
		
		// Length of a string
		System.out.println("The length of the word is " + s.length());
		
		//Joining of a string
		System.out.println(s.concat(s1));
		
		//Trimming the string
		s="            welcome mohamed ali       ";
		System.out.println(" Before triming s is : " +s);
		
		//remove space
		System.out.println(" after triming string is : " +s.trim());
		
		// CharAt()
		s = "welcome";
		System.out.println(s.charAt(3));
		
		//contains ==> return boolean
		
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("comee"));
		
		//Comparing string equals
		System.out.println("************** comparing string equals*********");
		s = "welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("wel  com"));
		
		
		// Replacing characters
		s= "welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium"));
		
		// converting case
		
		s= "WELCOME";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		
				

	}

}
