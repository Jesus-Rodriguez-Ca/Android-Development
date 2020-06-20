package p;

public class LinkedIntList {                                   
    private ListNode front, end;                                    
                                                                          
    public LinkedIntList() {                                                   
        front = null;
        end = null;
    }   
    public boolean isEmpty() {
    	if(front == null) {
    		return true;
    	}else {
    		return false;
    	}
    }
                                                                                             
    public void add(int value) {                                                      
        end = new ListNode(value, end);                                                        
        if (front == null) { 
        	front = end;
        }                                           
    }    
    public void addToEnd(int element) {
    	if(!isEmpty()) {
    		end.next = new ListNode();
    		end = end.next;
    	}else {
    		front = end = new ListNode(element);
    	}
    }
                                                   
  
    public boolean hasTwoConsecutive() {
	    ListNode current = front;
	    
	    if (front == null) {
	        return false;
	    } else {
	    
	        while (current.next != null) {
	            if (current.data + 1 == current.next.data) {
	                return true;
	            }
	            current = current.next;
	        }
	        
	        return false;
	    }
	}
    
    public void showList() {
    	ListNode r = end;
    	System.out.println();
    	while(r != null) {
    		System.out.print(" [" + r.data + "]-->" );
    		r = r.next;
    	}
    }
}
