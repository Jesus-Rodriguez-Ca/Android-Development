// Jesus Rodriguez
// ITC 155 Data Structure
// Spring 2020
// 6-8-2020


/* Write a method isSorted that returns true if the list is in sorted 
*  (nondecreasing) order and returns false otherwise. An empty list is 
*  considered to be sorted. 
*/

package linked;

public class TheList {
	
	private static ListNode front;

	public static boolean isSorted() {
	    
		
		ListNode pre = front;
	    if (front == null) {
	        return true;
	    }
	    
	    while (pre.next != null) {
	        ListNode current = pre.next;
	        if (current.data < pre.data) {
	            return false;
	        }
	        pre = current;
	    }
	    
	    return true;
	}

}
