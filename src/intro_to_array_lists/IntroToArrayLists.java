package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
	
		
		
		ArrayList<String> s = new ArrayList<String>(); 
		//2. Add five Strings to your list
		s.add("a");
		s.add("se");
		s.add("d");
		s.add("fe");
		s.add("g");
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<5;i++) {
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String i: s ) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			if(i%2==0) {
				System.out.println(s.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i > -1; i--) {
		System.out.println(s.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			if(s.get(i).contains("e")) {
				System.out.println(s.get(i));
			}
		}
	}	
}
