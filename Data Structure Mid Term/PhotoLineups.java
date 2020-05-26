// Jesus Rodriguez
// 5-25-2020
// ITC 155 Data Structure
// Spring 2020

/*  Write a program that lists all ways people can line up for a photo (all permutations of a list
 *  of Strings). The program will read a list of one word names (until -1), and use a recursive 
 *  method to create and output all possible orderings of those names, one ordering per line.
 *  When the input is:

	Julia Lucas Mia -1
	then the output is (must match the below ordering):

 *	Julia Lucas Mia 
 *	Julia Mia Lucas
 *  Lucas Julia Mia
 *	Lucas Mia Julia
 *	Mia Julia Lucas
 *	Mia Lucas Julia
 */

package mid;

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

// TODO: Write method to create and output all permutations of the list of names.
public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
	// Base case: When the list of names is empty 
	if (nameList.isEmpty()) { 
		for (int i = 0; i < permList.size(); i++) {
			
			System.out.print( permList.get(i) + " ");
	}
	System.out.println();
	}
	else {  
	for (int i = 0; i < nameList.size(); i++) {

	ArrayList<String> newPerms = new ArrayList<String>(permList);
	newPerms.add(nameList.get(i));
	ArrayList<String> newNames = new ArrayList<String>(nameList);
	newNames.remove(i);

	allPermutations(newPerms, newNames);
}
}
}


public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
System.out.println("Enter names or \"-1\" to finish: ");
ArrayList<String> nameList = new ArrayList<String>();
ArrayList<String> permList = new ArrayList<String>();
String name;
while(scnr.hasNext()) {
	name= scnr.nextLine();
	if (name.contentEquals("-1"))
		break; 
	nameList.add(name);
	}
	
	allPermutations(permList, nameList);
}
}

