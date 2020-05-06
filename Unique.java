package unique;
// Jesus Rodriguez
// 05-05-2020
// ITC Data Structures

/* Write a method "isUnique" that accepts a map whose key and values are strings as a parameter and returns "true"
 * if no two keys map to the same value (and false if any two or more keys do map to the same value). For example,
 * if the map contains the following key/values pairs, you method would return "true": 
 * 	{Marty= Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 * But calling it on the following map would return false, because two mappings for "Perkins" and "Reges":
 * 	{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}. 
 */

// To use to collections
import java.util.*;

public class Unique{
	public static void main(String[] args) {
		
		// Create two maps
		Map<String, String> list1 = new HashMap<>();	
		Map<String, String> list2 = new HashMap<>();
		
		
		// Add values to first map (key,value) and prints its content
		list1.put("Marty", "Stepp");
		list1.put("Stuart", "Reges");
		list1.put("Jessica", "Miller");
		list1.put("Amanda", "Camp");
		list1.put("Hall", "Perkins");
		System.out.println(list1);
		isUnique(list1);
		
		// Add values to second map (key,value) and prints its content
		list2.put("Kendrick", "Perkins");
		list2.put("Stuart", "Reges");
		list2.put("Jessica", "Miller");
		list2.put("Bruce", "Reges");
		list2.put("Hall", "Perkins");
		System.out.println(list2);
		isUnique(list2);
	}
	
		// Method isUnique with a String map as parameter
	public static void isUnique(Map<String, String> map) {
		Map<String,String> set = new HashMap<String,String>();

		// It checks all the content of the map
		// For every value of type String in map
	    for(String value : map.keySet()) {
	    	
	    // The variable name obtains the value of each value in map	
	        String name = map.get(value).toLowerCase();
	     
	    // Checks if value is repeated    
	        if(set.containsValue(name)) {
	        	
	    // Prints false if repeated
	        	System.out.println("False");
	        }
	        set.put(value,name);
	        
	    }
	    // Prints True if not repeated
	    System.out.println("True");
	}
}
						
	
	
	
		
