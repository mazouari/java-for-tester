package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
//	****** How to declare array list 
//		ArrayList list = new ArrayList(); //we can store any type of elements (string / inetger)
//		ArrayList<Integer> list = new ArrayList <Integer>();
		
		
		ArrayList<String> list = new ArrayList <String>(); //  store string elements
			
		
//	********** How to add element / value to array list 
		
		list.add("ali");
		list.add("amin");
		list.add("mohamed");
		list.add("imed");
		list.add("omar");
		list.add("radhia");
		
		//print all the value
		
		System.out.println(list);

			
		
//	****** Find size of array list 
		System.out.println(list.size());
		System.out.println("Before removing element : " +list);
		
		
//		  - Remove element 
			
		list.remove(3);
		System.out.println("After removing element : " +list);
		
		
//		  - Insert a new element in the middle of array list 
		list.add(2, "Mohamed Ali");
		
		
//		  - Read values from array list 

		for(String s : list) {
			System.out.println(s);
		}
		
/// object :  pour remplir un tableau de different types (integer + string)
		
		for(Object s :list) {
			System.out.println(s);
		}

		 
		
		
	}

}
