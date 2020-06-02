// Jesus Rodriguez
// ITC 155 Data Structure
// 6-1-2020
// Spring 2020

/* Write a method called "isPalindrome" that accepts a queue of integers as parameter
 * and returns true if the numbers in the queue are the same in reverse order. For example, 
 * if the queue stores [3, 8, 17, 9, 17, 8, 3], your method should return true because this
 * sequence is the same in reverse order. If the queue stores [3, 17, 9, 4, 17, 3], your
 * method should return false because this sequence is not the same in reverse order.
 * Your method must restore the parameter queue to its original state before returning. 
 * Use one stack as auxiliary storage. 
 */


package stackQueue;
import java.util.*;
public class Match {

	public static void main(String[] args) {
		boolean result;
		//int[] Numbers = {3, 8, 17, 9,};
		
		Queue<Integer> r = new LinkedList<>();
		r.add(3);
		r.add(8);
		r.add(17);
		r.add(9);
		r.add(17);
		r.add(8);
		r.add(3);
		
		/*
		for(int i= 0; i< Numbers.length; i++ ) {
			r.add(i);
		}*/
		result = isPalindrome(r);
		System.out.println(result);
		System.out.println(r);
	}
	public static boolean isPalindrome(Queue<Integer> q) {
	    Stack<Integer> s = new Stack<Integer>();
	    int size = q.size();
	    boolean palindrome = true;
	                
	    for(int i = 0; i < size; i++) {
	        int n = q.remove();
	        q.add(n);
	        s.push(n);
	    }
	                                                    
	    for(int i = 0; i < size; i++) {
	        int n1 = q.remove();
	        int n2 = s.pop();
	        
	        if(n1 != n2)
	            palindrome = false;    
	        q.add(n1);
	    }
	    
	    return palindrome;
	}
}
