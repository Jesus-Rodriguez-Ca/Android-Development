package arrayList;


/* Jesus Rodriguez*/
// 4-28-2020
/* Write a method called "doubleList" that takes an ArrayList of strings as a parameter and replaces 
 * every string  with two of the same string. For example, if the list stores vales [ "how", "are",
 * "you?" ] before the method is called, it should store the values ["how", "how", "are", "are", "you?",
 * "you?"] after the method finishes executing.*/

import java.util.*;

	public static void doubleList(ArrayList<String> array) { // Creates method with an ArrayList as parameter	
	   
		for (int i = 0; i < array.size() ; i+=2) { // Loop starts in index 0 and finishes according to length iterations every other index
	        String word = array.get(i);	//	The variable word gets the value of the array according to its index
	        array.add( i + 1, word);	// Example, Word is going to be added in index 0+1 and so on. 
		
	}
	}
	
	
	

