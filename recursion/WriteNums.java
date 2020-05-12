// Jesus Rodriguez
// 5-11-2020
// ITC 155 Spring 2020

/* Write a method called "writeNums" that takes an integer n as parameter and prints to the 
 * console the first "n" integers starting with 1 in sequential order, separated by commas. For example, 
 * consider the following calls:
 * 
 * writeNums(5);
 * System.out.print();
 * writeNums(12);
 * System.out.print();
 * 
 * These calls should produce the following output:
 * 1, 2, 3, 4, 5
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11 , 12
 * 
 * Your method should throw an IllegalArgumentException if passed a value less than 1.
 * 
 */

package recursion;

public class WriteNums {

	public static void main(String[] args) {
		//writeNums(0);
		System.out.println();
		writeNums(1);
		System.out.println();
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();

	}
	public static void writeNums(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Invalid number");
		}
		else if (n == 1){
			System.out.print(1);
		}
		else {
		  writeNums(n - 1);
		  System.out.print(  ", " + n);
		  
		}
		
		
	}

}
