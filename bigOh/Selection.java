// Jesus Rodriguez
// ITC 155 Data Structure
// Spring 2020
// 05-16-2020

/* ---------------------------------------------------------------------------------------------------------------
 * 4. To which complexity class does the following algorithm belong? Consider N to be length or size 
 * of the array or collection passed to the method. Explain your reasoning.
 * 
 * public static int[] mystery1(int[] list)  {
    int[] result = new int[2 * list.length];
    for (int i = 0; i < list.length; i++)  {
        result[2 * i] = list[i] / 2 + list[i] % 2;
        result[2 * i + 1] = list[i] / 2;

    }

  return result;
  
}

*		The preceding code belongs to O(N) because the loop executes one time. This algorithm has one loop "N" 
*	and three statements to execute. That would be in the order of O(1 + 2N) but it could be round off to O(N).
*------------------------------------------------------------------------------------------------------------------
 */

/* To which complexity class does the following algorithm belongs?
 * 
 * public static void mystery2(int[] list){
 * 		for(int i = 0; i < list.length / 2 ; i++){
 *			int j = list.length - 1 - i;
 *			int temp = list[i];
 *			list[i] = list[j];
 *			list[j] = temp; 
 * 	}
 * }
 * 	The preceding code belongs to O(N) because the loop will be execute one time. The algorithm has one 
 * loop "N" and 4 statements. That would be in he order of O(4N) but it could be round off to O(N). 
 * The algorithm at first seems like a O(log N) because the condition "list.length /2" but, the rest of 
 * the statements make the algorithm run the whole array. 
 * ---------------------------------------------------------------------------------------------------------------
 */


/* Write a modified version of the selection sort algorithm that selects the largest elements each time
 * and moves it to the end of the array, rather than selecting the smallest element and moving it to
 * the beginning. Will this algorithm be faster than the standard selection sort? What will its complexity
 * class (big-Oh) be?  
 * 
 */
package bigOh;
import java.util.*;

public class Selection {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of elements you want in the array: ");
		int n = console.nextInt();
		int list2[] = new int[n];
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < n ; i++) {
			list2[i] = console.nextInt();
		}
		selectionSort(list2);
		System.out.println(Arrays.toString(list2));
		
	}
	public static void selectionSort(int[] list) {
		for (int i = 0; i< list.length - 1; i++ ) {
			int largest = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] > list[largest]) {
					largest =j;
					
				}
			}
			if (i != largest) {
				int swap = list[i];
				list[i] = list[largest];
				list[largest] = swap;
			}
		}
	}
	
	}
/* The preceding algorithm belongs to O(N^2) because there are two loops nested. The algorithm repeatedly finds the largest of the array
 * and moves it at the front. 
 * 
 */
	
	
