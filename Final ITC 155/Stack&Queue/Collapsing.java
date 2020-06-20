// Jesus Rodriguez
// Data Structure ITC 155
// 6-17-2020
// Spring 2020

/* Write a method called collapse that accepts a stack of integer as parameter and that collapses
 * it by replacing each successive pair of integers with the sum of the pair. For example, if the
 * stack stores [7 , 2, 8, 9, 4, 11, 7, 1, 42], the first pair should be collapsed into 9(7 + 2),
 * the second pair should collapsed into 17(8 + 9), and so on. If the stack stores an odd number
 * of elements, such as the 42 at the end of our example stack, the final element is not collapsed.
 * So for this stack your method would yield [9, 17, 15, 8, 42]. Use one queue as auxiliary storage.    
 */

package together;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collapsing {
	
	public static void main(String[] args) {
		
		int[] list = {7 , 2, 8, 9, 4, 11, 7, 1, 42};
		Stack<Integer> r = new Stack<Integer>();
		for(int num:list) {
			r.push(num);
		}
		collapse(r);
	}
	
	
	public static void collapse(Stack<Integer> list) {
		
		// Auxiliary storage
	    Queue<Integer> aux = new LinkedList<Integer>();
	    
	    
	    if (list.size() % 2 != 0) {
	    	aux.add(list.pop());
	    }
	    
	    while (!list.isEmpty()) {
	    	aux.add(list.pop() + list.pop());
	    }
	    
	    while (!aux.isEmpty()) {
	    	list.push(aux.remove());
	    }
	    
	    while (!list.isEmpty()) {
	    	aux.add(list.pop());
	    }
	    
	    while (!aux.isEmpty()) {
	    	list.push(aux.remove());
	    }
	    System.out.print(list);
	}
}
