// Jesus Rodriguez
// 4-28-2020
// ITC 155 Spring 2020
/*	Write a method called removeEvenLength that takes an ArrayList of strings as a parameter 
 * 	and removes all of the strings of even length from the list. */

import java.util.*;

	
	public static void removeEvenLength(ArrayList<String> even) {  // Method accepts an ArrayList as parameter
			
		for (int i = 0; i < even.size(); i++) {		// Loop starts in 0 ends according length increases in 1
		    String word = even.get(i);			// Variable "word" gets the value of the ArrayList in every iteration 
		     if (word.length() % 2 == 0) { // If the remainder between the length of the value on word and 2 is equal to 0
		        even.remove(i);				//then every strings that are even will be remove.
		            i--;
		        }
		    }
		}


		    
		

