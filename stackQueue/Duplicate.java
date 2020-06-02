// Jesus Rodriguez
// ITC 155 Data Structure
// 5-31-2020
// Spring 2020

/* Write a method called "stutter" that accepts a Stack of integer as a parameter and replaces every value
 * in the stack with two occurrences of that value. Preserve the original relative order. For example,
 * if the Stack stores [3, 7, 1, 14, 9], your method should change it to store [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]. 
 * Use a single queue as auxiliary storage. 
 */ 

package stackQueue;
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		int[] list = {3, 7, 1, 14, 9};
		Stack<Integer> r = new Stack<Integer>();
		for(int num:list) {
			r.push(num);
		}
		stutter(r);
	}
		
	public static void stutter(Stack<Integer> s) {
	    Queue<Integer> q = new LinkedList<Integer>();
	    while (!s.isEmpty()) {
	        int n = s.pop();
	        q.add(n);
	        q.add(n);
	    }
	    while (!q.isEmpty()) {
	        s.push(q.remove());
	    }
	    while (!s.isEmpty()) {
	    	int r = s.pop();
	    	q.add(r);
	    }
	    while (!q.isEmpty()) {
	        s.push(q.remove());
	    }
	    System.out.print(s);
	}
}
	
